package com.example.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class MyAspect1 {
    @Before("execution(* com.example.demo.service.impl.DeptServiceImpl.*(..))")
    public void before(){
        log.info("before...");
    }

    @Around("execution(* com.example.demo.service.impl.DeptServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("around before...");
        //运行时的方法
        Object result = joinPoint.proceed();
        log.info("around after");
        return result;
    }

    @After("execution(* com.example.demo.service.impl.DeptServiceImpl.*(..))")
    public void after(){
        log.info("after...");
    }


    @AfterReturning("execution(* com.example.demo.service.impl.DeptServiceImpl.*(..))") //原始方法正常运行，正常返回会运行次方法
    public void afterReturning(){
        log.info("afterReturning...");
    }

    @AfterThrowing("execution(* com.example.demo.service.impl.DeptServiceImpl.*(..))")
    public void afterThrowing(){
        log.info("afterThrowing...");
    }
}
