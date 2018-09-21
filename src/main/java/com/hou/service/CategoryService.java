package com.hou.service;

import com.hou.dataObject.ProductCategory;

import java.util.List;
import java.util.Optional;

/**
 * Created by Ken on 2018/9/18.
 */
public interface CategoryService {
    Optional<ProductCategory> findOne(Integer categoryId);
    List<ProductCategory> findByCategoryIdIn(List<Integer> categoryId);
    List<ProductCategory> findAll();
    ProductCategory save(ProductCategory productCategory);

}
