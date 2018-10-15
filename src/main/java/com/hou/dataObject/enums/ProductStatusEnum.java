package com.hou.dataObject.enums;

import lombok.Getter;

/**
 * Created by Ken on 2018/10/9.
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架");
    private Integer code;
    private String message;
    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
