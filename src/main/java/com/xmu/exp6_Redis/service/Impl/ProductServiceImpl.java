package com.xmu.exp6_Redis.service.Impl;

import com.xmu.exp6_Redis.bo.OnSale;
import com.xmu.exp6_Redis.bo.Product;
import com.xmu.exp6_Redis.entity.OnSalePo;
import com.xmu.exp6_Redis.entity.ProductPo;
import com.xmu.exp6_Redis.repository.OnSaleRepository;
import com.xmu.exp6_Redis.repository.ProductRepository;
import com.xmu.exp6_Redis.service.ProductService;
import com.xmu.exp6_Redis.util.CloneFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OnSaleRepository onSaleRepository;

    @Override
    public List<Product> getProductsByNameAndRelatedData(String name) {
        // 1. 根据name查询goods_product表中的Product
        ProductPo productPo = productRepository.findByName(name);

        if (productPo == null) {
            throw new RuntimeException("Product not found with name: " + name);
        }

        // 2. 根据productId查询goods_onsale表中的数据
        List<OnSalePo> onSalePos = onSaleRepository.findByProductId(productPo.getId());
        List<OnSale> onSales = new ArrayList<>();
        for (OnSalePo onSalePo : onSalePos) {
            onSales.add(CloneFactory.copy(new OnSale(), onSalePo));
        }

        // 3. 根据goodsId查询goods_product表中的其他产品
        List<ProductPo> allProducts = productRepository.findByGoodsId(productPo.getGoodsId());
        List<Product> otherProduct = new ArrayList<>();


        // 将 ProductPo 转成 Product
        Product product = CloneFactory.copy(new Product(), productPo);

        // 提取出 otherProduct
        for (ProductPo allProduct : allProducts) {
            if (!name.equals(allProduct.getName())) {
                otherProduct.add(CloneFactory.copy(new Product(), allProduct));
            }
        }

        product.setOnSaleList(onSales);
        product.setOtherProduct(otherProduct);
        List<Product> productList = new ArrayList<>();
        productList.add(product);

        // 你可以在此返回所有查询到的数据，例如:
        return productList;
    }
}
