package com.example.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class MyAspect1 {

    @Pointcut("execution(* com.example.demo.service.impl.DeptServiceImpl.*(..))")
    public void pt(){
    } //当切入点重复时候进行抽取操作

    @Before("pt()")
    public void before(){
        log.info("before...");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("around before...");
        //运行时的方法
        Object result = joinPoint.proceed();
        log.info("around after");
        return result;
    }

    @After("pt()")
    public void after(){
        log.info("after...");
    }

    @AfterReturning("pt()") //原始方法正常运行，正常返回会运行次方法
    public void afterReturning(){
        log.info("afterReturning...");
    }

    @AfterThrowing("pt()") //在异常通知，在方法抛出异常之后执行
    public void afterThrowing(){
        log.info("afterThrowing...");
    }
}
