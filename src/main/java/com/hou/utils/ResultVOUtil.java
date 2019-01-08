package com.hou.utils;

import com.hou.vo.ResultVO;

/**
 * ResultVOUtil
 *
 * @author ShiXiaohou
 * @date 2018/12/13
 */
public class ResultVOUtil {
    public static ResultVO success(Object obj) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(obj);
        return resultVO;
    }
}
