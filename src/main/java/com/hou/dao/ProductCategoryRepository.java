package com.hou.dao;

import com.hou.dataObject.ProductCategory;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;
import java.util.Optional;


/**
 * Created by Ken on 2018/8/6.
 */

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory>  findByCategoryIdIn(List<Integer> categoryTypeList);
}
