package com.shop.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Description:SpringBean工具类，用于手动获取Spring Bean对象
 * Author: LZ
 * Date:2018/7/4 9:37
 */
@Component
public class SpringBeanUtil implements ApplicationContextAware{

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringBeanUtil.applicationContext = applicationContext;
    }

    /**
     * 对外提供的获取Bean的方法（通过名称获取bean对象）
     * @param beanName 名称
     * @return
     */
    public static Object getBeanByName(String beanName) {
        if (applicationContext == null){
            return null;
        }
        return applicationContext.getBean(beanName);
    }
}
