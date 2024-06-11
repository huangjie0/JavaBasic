package com.example.demo.config;

import org.dom4j.io.SAXReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //配置类
public class CommonConfig {
    //声明第三方的bean
    @Bean //将方法返回值对象交给ioc容器管理，成为ioc的bean对象

    public SAXReader saxReader(){
        return new SAXReader();
    }
}

