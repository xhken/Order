package com.hou.dao;

import com.hou.dataObject.ProductCategory;
import com.hou.dataObject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Ken on 2018/9/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest()
    {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123");
        productInfo.setProductName("豆沙包");
        productInfo.setProductPrice(BigDecimal.valueOf(123456.889));
        productInfo.setProductStock(100);
        productInfo.setProductIcon("http://www.baidu.com");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(101);
        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }
}