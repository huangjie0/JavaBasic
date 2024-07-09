package com.example.demo;

import com.example.demo.controller.DeptController;
import com.example.demo.pojo.Result;
import com.google.gson.Gson;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private ApplicationContext applicationContext;  //ioc容器对象
    @Autowired
    private Gson gson;

    @Test
    void contextLoads() {
    }

    @Test
    public void testGenJwt(){
         Map<String,Object> claims =new HashMap<>();
         claims.put("id",1);
         claims.put("name","tom");

        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"huangjie") //签名算法
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + 3600*1000)) //设置有效期
                .compact(); //生成string
        System.out.println(jwt);
    }

    @Test
    public void testAnalyze(){
        Claims claims = Jwts.parser()
                .setSigningKey("huangjie")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoidG9tIiwiaWQiOjEsImV4cCI6MTcxNzQ5MzgzOX0.WD4VpKJOtMqigkaByPsHVU36n3F7pCv2PdaIEzCL3-c")
                .getBody();
        System.out.println(claims);
    }

    @Test
    public void testGetBean(){
        //根据bean的名称获取
        DeptController bean = (DeptController) applicationContext.getBean("deptController");
        System.out.println(bean);
        //根据bean的类型获取
        DeptController bean2 = applicationContext.getBean(DeptController.class);
        System.out.println(bean2);
        //根据bean的名称及类型获取
        DeptController bean3 = applicationContext.getBean("deptController",DeptController.class);
        System.out.println(bean3);
    }

    @Test
    public void testBeanScope(){
        for (int i = 0; i < 10; i++) {
            DeptController deptController = applicationContext.getBean(DeptController.class);
            System.out.println(deptController);
        }
    }

    @Test
    public void testJson(){
        String json = gson.toJson(Result.success());
        System.out.println(json);
    }
}
