package com.shop.controller;

import com.shop.service.ITestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description:
 * Author: LZ
 * Date:2018/6/28 16:48
 */
public class TestControllerTest extends BaseTest {
    @Autowired
    private ITestService testService;
    @Test
    public void testCancelAlipayOrder() throws Exception {
    }
}