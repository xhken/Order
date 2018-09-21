package com.hou.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Ken on 2018/9/19.
 */
@Table(name = "product_info")
@Entity
@Data
public class ProductInfo {
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private int productStock;
    private String productIcon;
    private String productStatus;
    private int categoryType;
//    private Date createTime;
//    private Date updateTime;
}
