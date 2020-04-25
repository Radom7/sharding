package com.haiyu.shopping.service;

import com.haiyu.shopping.entity.ProductInfo;

import java.util.List;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/25 14:18
 * @Version 1.0
 */
public interface ProductService {
    //添加商品
    public void createProduct(ProductInfo productInfo);

    //查询商品
    public List<ProductInfo> queryProduct(int page, int pageSize);
}
