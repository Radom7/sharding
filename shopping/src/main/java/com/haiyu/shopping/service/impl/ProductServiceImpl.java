package com.haiyu.shopping.service.impl;

import com.haiyu.shopping.dao.ProductDao;
import com.haiyu.shopping.entity.ProductDescript;
import com.haiyu.shopping.entity.ProductInfo;
import com.haiyu.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/25 14:19
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    @Transactional
    public void createProduct(ProductInfo productInfo) {
        ProductDescript productDescript =new ProductDescript();
        //设置商品描述 信息
        productDescript.setDescript(productInfo.getDescript());
        //调用dao向商品信息表
        productDao.insertProductInfo(productInfo);
        //将商品信息id设置到productDescript
        productDescript.setProductInfoId(productInfo.getProductInfoId());
        //设置店铺id
        productDescript.setStoreInfoId(productInfo.getStoreInfoId());
        //向商品描述信息表插入数据
        productDao.insertProductDescript(productDescript);
    }

    @Override
    public List<ProductInfo> queryProduct(int page, int pageSize) {
        int start = (page - 1) * pageSize;
        return productDao.selectProductList(start,pageSize);
    }
}
