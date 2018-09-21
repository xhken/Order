package com.hou.service.impl;

import com.hou.dataObject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by Ken on 2018/9/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() throws Exception {
        categoryService.findOne(1).ifPresent(productCategory -> Assert.assertNotNull(productCategory));
    }

    @Test
    public void findByCategoryIdIn() throws Exception {
        List<ProductCategory> productCategories = categoryService.findByCategoryIdIn(Arrays.asList(1, 2));
        Assert.assertNotNull(productCategories);
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> productCategories = categoryService.findAll();
        Assert.assertNotNull(productCategories);
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryType(103);
        productCategory.setCategoryName("热卖套餐");
        productCategory.setCategoryId(3);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }

}