package com.haiyu.shopping.entity;

import lombok.Data;

/**
 * @Desc: 商品描述
 * @Author: liuxing
 * @Date: 2020/4/25 14:13
 * @Version 1.0
 */
@Data
public class ProductDescript {
    private Long id;

    /**
     * 所属商品id
     */
    private Long productInfoId;

    /**
     * 商品描述
     */
    private String descript;

    /**
     * 所属店铺id
     */
    private Long storeInfoId;

}
