package com.xmu.exp6_Redis.repository;


import com.xmu.exp6_Redis.entity.ProductPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductPo, Long> {

    // 根据 name 字段查询 product
    ProductPo findByName(String name);

    // 根据 goodsId 查询 product
    List<ProductPo> findByGoodsId(Long goodsId);

}
