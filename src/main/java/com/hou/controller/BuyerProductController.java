package com.hou.controller;

import com.hou.utils.ResultVOUtil;
import com.hou.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BuyerProductController
 *
 * @author Ken
 * @date 2018/12/12
 */

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @PostMapping("/list")
    public ResultVO list() {
        ResultVO resultVO = ResultVOUtil.success("yes");
        return resultVO;
    }
}
