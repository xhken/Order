package com.hou.dao;

import com.hou.dataObject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import static org.junit.Assert.*;

/**
 * Created by Ken on 2018/8/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    int sum = 0;

    @Test
    public void findOneData() {
//        Optional<Integer> optional1 = Optional.ofNullable(1);
//        Optional<Integer> optional2 = Optional.ofNullable(null);

// 如果不是null,调用Consumer
//        optional1.ifPresent(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer t) {
//                System.out.println("value is " + t);
//            }
//        });
//
//        repository.findById(1).ifPresent(new Consumer<ProductCategory>() {
//            @Override
//            public void accept(ProductCategory productCategory) {
//
//            }
//        });



        repository.findById(1).ifPresent(productCategory -> { log.info("product_category:{} for id = 1", productCategory.toString()); });


    }

    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("新上鲜果");
        productCategory.setCategoryType(102);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);

    }

    @Test
    @Transactional
    public void updateTest() {
        repository.findById(2).ifPresent(productCategory -> {
            productCategory.setCategoryType(102);
            repository.save(productCategory);
        });
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(1, 2);
        List<ProductCategory> result = repository.findByCategoryIdIn(list);
        Assert.assertNotEquals(0, result.size());
    }

}