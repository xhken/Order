package com.hou.service.impl;

import com.hou.dao.ProductCategoryRepository;
import com.hou.dataObject.ProductCategory;
import com.hou.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Ken on 2018/9/18.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ProductCategoryRepository repository;

    @Override
    public Optional<ProductCategory> findOne(Integer categoryId) {
        return repository.findById(categoryId);
    }

    @Override
    public List<ProductCategory> findByCategoryIdIn(List<Integer> categoryId) {
        return repository.findByCategoryIdIn(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
