package com.example.demo.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//注解的运行时间
@Retention(RetentionPolicy.RUNTIME)

//注解的运行方法
@Target(ElementType.METHOD)
public @interface MyLog {

}
