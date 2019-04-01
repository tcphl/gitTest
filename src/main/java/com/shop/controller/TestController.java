package com.shop.controller;

import com.shop.config.PlanTimeConfig;
import com.shop.enums.StatusCode;
import com.shop.model.Result;
import com.shop.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:测试
 * Author: LZ
 * Date:2018/6/28 16:02
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;
    @Autowired
    private PlanTimeConfig planTimeConfig;

    @RequestMapping(value = "/test" ,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result cancelAlipayOrder(HttpServletRequest request) throws Exception {
        testService.test();
        return Result.unDataResult(StatusCode.SUCCESS.getCode(), "测试");
    }
}
