package com.xmu.exp6_Redis.bo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class OnSale {

    private Long id;

    private Long price;

    private LocalDateTime beginTime;

    private LocalDateTime endTime;

    private Integer quantity;

    private Integer maxQuantity;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    @Builder
    public OnSale(Long id, Long price, LocalDateTime beginTime, LocalDateTime endTime, Integer quantity, Integer maxQuantity, LocalDateTime gmtCreate, LocalDateTime gmtModified) {
        this.id = id;
        this.price = price;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.quantity = quantity;
        this.maxQuantity = maxQuantity;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }
}
