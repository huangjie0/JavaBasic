package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求处理类
@RestController
public class HelloControl {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello World");
        return "hello world";
    }
}
