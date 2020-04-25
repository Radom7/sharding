package com.haiyu.shopping.entity;

import lombok.Data;

/**
 * @Desc: 店铺信息
 * @Author: liuxing
 * @Date: 2020/4/25 14:12
 * @Version 1.0
 */
@Data
public class StoreInfo {
    private Long id;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 信誉等级
     */
    private int reputation;

    /**
     * 店铺所在地
     */
    private String regionCode;

    /**
     * 店铺所在地名称
     */
    private String regionName;
}
