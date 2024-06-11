package com.example.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
//@Aspect
@Slf4j
public class MyAspect6 {
    @Pointcut("execution(* com.example.demo.service.DeptService.*(..))")
    private void put(){}

    @Before("put()")
    public void before(JoinPoint joinPoint){
        log.info("myAspect8 before方法执行了！");
    }

    @Around("put()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("myAspect8 before方法执行了！");

        //获取目标对象的类名
        String className = joinPoint.getTarget().getClass().getName();
        log.info("目标对象的类名" + className);

        //获取目标对象的方法
        String methodName = joinPoint.getSignature().getName();
        log.info("目标对象的方法名" + methodName);

        //获取目标对象的运行时候所传入的参数
        Object[] args = joinPoint.getArgs();
        log.info("目标对象所传入的参数" + Arrays.toString(args));

        //让目标对象放行操作
        Object result = joinPoint.proceed();

        //获取目标方法的返回值
        log.info("目标方法的返回值是" + result);

        log.info("myAspect8 after方法执行了！");

        return result;
    }
}
