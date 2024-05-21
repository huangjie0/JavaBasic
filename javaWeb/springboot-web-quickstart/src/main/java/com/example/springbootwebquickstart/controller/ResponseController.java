package com.example.springbootwebquickstart.controller;

import com.example.springbootwebquickstart.pojo.Address;
import com.example.springbootwebquickstart.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {
    @RequestMapping("/hello2")
    public Result hello(){
        System.out.println("hello 2");
        return Result.success("hello world2!!");
    }

    @RequestMapping("/getAddr")
    public Result getAddr(){
        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        return Result.success(addr);
    }

    @RequestMapping("/listAddr")
    public Result listAddr(){
        List<Address> list = new ArrayList<>();

        Address addr1 = new Address();
        addr1.setProvince("安徽");
        addr1.setCity("合肥");

        Address addr2 = new Address();
        addr2.setProvince("陕西");
        addr2.setCity("西安");

        list.add(addr1);
        list.add(addr2);
        return Result.success(list);

    }
}
