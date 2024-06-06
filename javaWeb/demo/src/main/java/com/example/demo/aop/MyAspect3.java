package com.example.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class MyAspect3 {

    @Before("com.example.demo.aop.MyAspect1.pt()")
    public void before(){
        log.info("before..3");
    }

    @After("com.example.demo.aop.MyAspect1.pt()")
    public void after(){
        log.info("after..3");
    }
}
