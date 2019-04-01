package com.shop.handler;

import com.shop.enums.StatusCode;
import com.shop.model.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常捕获
 * Created by LZ on 2017/12/18.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Result exceptionHandler(Exception e){
        e.printStackTrace();
        return Result.unDataResult(StatusCode.FAIL.getCode(), "系统异常");
    }
}
