package com.example.springbootwebquickstart.controller;

import com.example.springbootwebquickstart.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

//原始方式请求
//@RestController
//public class RequestController {
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
//        //获取请求方式
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name + ":" + age);
//        return "Ok";
//    }
//}

@RestController

public class RequestController {
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name = "name" , required = false ) String userName, Integer age){
        //获取请求方式
        System.out.println(userName + ":" + age);
        return "Ok";
    }

    //实体参数
    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "ok";
    }

    //复杂方法
    @RequestMapping("/complexPojo")
    public String complexPojo(User user){
        System.out.println(user);
        return "ok";
    }

    //数组参数请求
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }

    //集合参数请求
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "ok";
    }

    //时间类型参数请求
    @RequestMapping("/updateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
        System.out.println(updateTime);
        return "ok";
    }

    //json格式参数请求
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "ok";
    }

    //路径参数请求
    @RequestMapping("/path/{id}/{name}")
    public String pathParam(@PathVariable Integer id,@PathVariable String name){
        System.out.println(id);
        System.out.println(name);
        return "ok";
    }

}

