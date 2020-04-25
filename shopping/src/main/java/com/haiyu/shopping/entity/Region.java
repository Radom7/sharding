package com.haiyu.shopping.entity;

import lombok.Data;

/**
 * @Desc: 地理区域信息
 * @Author: liuxing
 * @Date: 2020/4/25 14:10
 * @Version 1.0
 */
@Data
public class Region {
    private Long id;

    /**
     * 地理区域编码
     */
    private String regionCode;

    /**
     * 地理区域名称
     */
    private String regionName;

    /**
     * 地理区域级别(省、市、县)
     */
    private int level;

    /**
     * 上级地理区域编码
     */
    private String parentRegionCode;
}
