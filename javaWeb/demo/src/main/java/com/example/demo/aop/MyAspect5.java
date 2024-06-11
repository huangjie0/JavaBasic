package com.example.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//@Aspect
@Slf4j
public class MyAspect5 {

//    @Pointcut("execution(public void com.example.demo.service.impl.DeptServiceImpl.*(java.lang.Integer))")
//    @Pointcut("execution(* com.example.demo.service.DeptService.list()) ||" +
//            "execution(* com.example.demo.service.DeptService.delete(java.lang.Integer))")
    @Pointcut("@annotation(com.example.demo.aop.MyLog)")
    //匹配list方法和delete方法
    private void pt(){}

    @Before("pt()")
    public void before(){
        log.info("before------运行了·······");
    }
}
