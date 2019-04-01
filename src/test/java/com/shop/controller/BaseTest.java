package com.shop.controller;

import com.shop.ShopApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Description:测试的基类
 * Author: LZ
 * Date:2018/6/15 15:22
 */
@RunWith(SpringJUnit4ClassRunner.class)// SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes = ShopApplication.class)// 指定我们SpringBoot工程的Application启动类
@WebAppConfiguration //由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class BaseTest {

}
