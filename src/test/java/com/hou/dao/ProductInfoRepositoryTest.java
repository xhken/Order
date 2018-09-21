package com.hou.dao;

import com.hou.dataObject.ProductInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by Ken on 2018/9/21.
 */
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest()
    {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductInfo("12345");
    }
}