package com.shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Description:计划时间的配置类
 * Author: LZ
 * Date:2018/7/4 10:14
 */
@Component
@Configuration
public class PlanTimeConfig {
    @Value("${server.consumeStartHour}")
    private String consumeStartHour;
    @Value("${server.consumeEndHour}")
    private String consumeEndHour;

    public String getConsumeStartHour() {
        return consumeStartHour;
    }

    public void setConsumeStartHour(String consumeStartHour) {
        this.consumeStartHour = consumeStartHour;
    }

    public String getConsumeEndHour() {
        return consumeEndHour;
    }

    public void setConsumeEndHour(String consumeEndHour) {
        this.consumeEndHour = consumeEndHour;
    }

    @Override
    public String toString() {
        return "PlanTimeConfig{" +
                "consumeStartHour='" + consumeStartHour + '\'' +
                ", consumeEndHour='" + consumeEndHour + '\'' +
                '}';
    }
}
