package com.xmu.exp6_Redis.bo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品规格
 */
@Data
@NoArgsConstructor
public class Product {
    private Long id;

    private List<Product> otherProduct = new ArrayList<>();

    private List<OnSale> onSaleList = new ArrayList<>();

    private String skuSn;

    private String name;

    private Long originalPrice;

    private Long weight;

    private String barcode;

    private String unit;

    private String originPlace;

    private Integer commissionRatio;

    private Long freeThreshold;

    private byte status;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    @Builder
    public Product(Long id, String skuSn, String name, Long originalPrice, Long weight, String barcode, String unit, String originPlace, Integer commissionRatio, Long freeThreshold, byte status, LocalDateTime gmtCreate, LocalDateTime gmtModified) {
        this.id = id;
        this.skuSn = skuSn;
        this.name = name;
        this.originalPrice = originalPrice;
        this.weight = weight;
        this.barcode = barcode;
        this.unit = unit;
        this.originPlace = originPlace;
        this.commissionRatio = commissionRatio;
        this.freeThreshold = freeThreshold;
        this.status = status;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }
}
