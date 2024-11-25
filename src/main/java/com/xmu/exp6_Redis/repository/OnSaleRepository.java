package com.xmu.exp6_Redis.repository;


import com.xmu.exp6_Redis.entity.OnSalePo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OnSaleRepository extends JpaRepository<OnSalePo, Long> {

    // 根据productId查询OnSale
    List<OnSalePo> findByProductId(Long productId);

}
