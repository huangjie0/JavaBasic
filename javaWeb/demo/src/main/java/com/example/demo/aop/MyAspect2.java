package com.example.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Aspect
@Slf4j
//@Order(2)
public class MyAspect2 {

    @Before("com.example.demo.aop.MyAspect1.pt()")
    public void before(){
        log.info("before...2");
    }

    @After("com.example.demo.aop.MyAspect1.pt()")
    public void after(){
        log.info("after..2");
    }

}
