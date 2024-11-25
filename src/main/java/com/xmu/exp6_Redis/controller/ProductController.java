package com.xmu.exp6_Redis.controller;


import com.xmu.exp6_Redis.bo.Product;
import com.xmu.exp6_Redis.controller.dto.ProductDto;
import com.xmu.exp6_Redis.model.ReturnObject;
import com.xmu.exp6_Redis.service.Impl.ProductServiceImpl;
import com.xmu.exp6_Redis.util.CloneFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("")
    public ReturnObject getProductsByName(@RequestParam String name) {
        ReturnObject retObj = null;
        List<Product> productList = productService.getProductsByNameAndRelatedData(name);
        List<ProductDto> data = productList.stream().map(o-> CloneFactory.copy(new ProductDto(),o)).collect(Collectors.toList());
        retObj = new ReturnObject(data);
        return  retObj;
    }
}
