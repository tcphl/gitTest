package com.shop.enums;

/**
 * Description:状态码
 * Author: LZ
 * Date:2018/5/4 9:09

 */
public enum StatusCode {
    SUCCESS("success", ""), FAIL("fail", "");

    private String code;
    private String msg;


    StatusCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
