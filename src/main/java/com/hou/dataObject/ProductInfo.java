package com.hou.dataObject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by Ken on 2018/9/19.
 */
@Table(name = "product_info")
@Entity
@Data
@DynamicUpdate
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private int productStock;
    private String productIcon;
    private int productStatus;
    private int categoryType;
//    private Date createTime;
//    private Date updateTime;
}
