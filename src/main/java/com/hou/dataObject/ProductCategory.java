package com.hou.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ShiXiaohou on 2018/8/6.
 */
@Table(name = "product_category")
@Entity
@Data
public class ProductCategory
{
    @Id
    @GeneratedValue
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;


    
}
