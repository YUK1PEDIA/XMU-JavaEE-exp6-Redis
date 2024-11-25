package com.xmu.exp6_Redis.service;

import com.xmu.exp6_Redis.bo.Product;
import java.util.List;

public interface ProductService {

    /**
     * 根据 name 查询需要的数据
     * @param name
     * @return
     */
    List<Product> getProductsByNameAndRelatedData(String name);
}
