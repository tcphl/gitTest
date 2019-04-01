package com.shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Description:阿里云消息队列MQ配置
 * Author: LZ
 * Date:2018/7/4 10:20
 */
@Component
@Configuration
public class MQConfig {
    @Value("${server.accessKey}")
    private String accessKey;
    @Value("${server.secretKey}")
    private String secretKey;

    @Value("${server.repayProducer}")
    private String repayProducer;
    @Value("${server.repayTopicName}")
    private String repayTopicName;

    @Value("${server.consumeProducer}")
    private String consumeProducer;
    @Value("${server.consumeTopicName}")
    private String consumeTopicName;

    @Value("${server.alarmProducer}")
    private String alarmProducer;
    @Value("${server.alarmTopicName}")
    private String alarmTopicName;

    @Value("${server.unfreezeProducer}")
    private String unfreezeProducer;
    @Value("${server.unfreezeTopicName}")
    private String unfreezeTopicName;

    @Value("${server.resultCID}")
    private String resultCID;
    @Value("${server.resultTopicName}")
    private String resultTopicName;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRepayTopicName() {
        return repayTopicName;
    }

    public void setRepayTopicName(String repayTopicName) {
        this.repayTopicName = repayTopicName;
    }

    public String getRepayProducer() {
        return repayProducer;
    }

    public void setRepayProducer(String repayProducer) {
        this.repayProducer = repayProducer;
    }

    public String getConsumeProducer() {
        return consumeProducer;
    }

    public void setConsumeProducer(String consumeProducer) {
        this.consumeProducer = consumeProducer;
    }

    public String getConsumeTopicName() {
        return consumeTopicName;
    }

    public void setConsumeTopicName(String consumeTopicName) {
        this.consumeTopicName = consumeTopicName;
    }

    public String getAlarmProducer() {
        return alarmProducer;
    }

    public void setAlarmProducer(String alarmProducer) {
        this.alarmProducer = alarmProducer;
    }

    public String getAlarmTopicName() {
        return alarmTopicName;
    }

    public void setAlarmTopicName(String alarmTopicName) {
        this.alarmTopicName = alarmTopicName;
    }

    public String getUnfreezeProducer() {
        return unfreezeProducer;
    }

    public void setUnfreezeProducer(String unfreezeProducer) {
        this.unfreezeProducer = unfreezeProducer;
    }

    public String getUnfreezeTopicName() {
        return unfreezeTopicName;
    }

    public void setUnfreezeTopicName(String unfreezeTopicName) {
        this.unfreezeTopicName = unfreezeTopicName;
    }

    public String getResultCID() {
        return resultCID;
    }

    public void setResultCID(String resultCID) {
        this.resultCID = resultCID;
    }

    public String getResultTopicName() {
        return resultTopicName;
    }

    public void setResultTopicName(String resultTopicName) {
        this.resultTopicName = resultTopicName;
    }
}
