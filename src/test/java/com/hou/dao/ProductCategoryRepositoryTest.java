package com.hou.dao;

import com.hou.dataObject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.function.Consumer;

import static org.junit.Assert.*;

/**
 * Created by ShiXiaohou on 2018/8/6.
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
}