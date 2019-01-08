package com.hou.vo;

import lombok.Data;

/**
 * ResultVO
 *
 * @author ShiXiaohou
 * @date 2018/12/13
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
}
