package com.hou.dao;

import com.hou.dataObject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * Created by Ken on 2018/8/6.
 */

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
}
