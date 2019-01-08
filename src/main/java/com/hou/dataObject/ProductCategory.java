package com.hou.dataObject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ken on 2018/8/6.
 */
@Table(name = "product_category")
@Entity
@Data
@DynamicUpdate  //自动更新时间
public class ProductCategory
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "categoryId:" + categoryId + " categoryName:" + categoryName + " categoryType:" + categoryType;
    }
    
}
