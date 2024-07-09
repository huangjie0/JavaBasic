package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

//请求处理类
@RestController
public class HelloControl {
    @RequestMapping("/hello")
    public Result hello(){
        System.out.println("hello World");
        return Result.success("Hello world!");
    }

//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
//        //获取请求参数
//        String name = request.getParameter("name");
//        String age = request.getParameter("age");
//        int age1 = Integer.parseInt(age);
//        System.out.println(name + ":" + age1);
//        return "OK";
//    }

    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name = "name",required = false) String name, Integer age){
        System.out.println(name + ":" + age);
        return "OK";
    }

    //接受复杂实体操作
    @RequestMapping("/simplePojo")
    public Result simplePoji(User user){
        return Result.success(user);
    }

    //接受数组参数
    @RequestMapping("/arrayParam")
    public Result arrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return Result.success(hobby);
    }

    //接受集合参数
    @RequestMapping("/listParam")
    public Result listParam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return Result.success(hobby);
    }

    //接受日期类型
    @RequestMapping("/dataParam")
    public Result dataParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime time){
        System.out.println(time);
        return Result.success(time);
    }

    //接受json请求参数
    @RequestMapping("/jsonParam")
    public Result jsonParam(@RequestBody User user){
        System.out.println(user);
        return Result.success(user);
    }

    //接受路劲参数
    @RequestMapping("/path/{id}/{name}")
    public String pathParam(@PathVariable Integer id,@PathVariable String name){
        System.out.println(id + name);
        return "ok";
    }
}
