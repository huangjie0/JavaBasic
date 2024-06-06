package com.example.demo.exception;

import com.example.demo.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 * */
@RestControllerAdvice
public class GlobalExceptionHandler {
    //捕获所有的异常操作
    @ExceptionHandler(Exception.class)
    public Result ex(Exception e){
        e.printStackTrace();
        return Result.error("对不起，操作失败，请联系管理人员");
    }
}
