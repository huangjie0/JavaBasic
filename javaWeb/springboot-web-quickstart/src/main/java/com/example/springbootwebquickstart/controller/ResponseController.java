package com.example.springbootwebquickstart.controller;

import com.example.springbootwebquickstart.pojo.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class ResponseController {
    @RequestMapping("/hello2")
    public String hello(){
        System.out.println("hello 2");
        return "hello hjuhu";
    }

    @RequestMapping("/getAddr")
    public Address getAddr(){
        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        return addr;
    }

    @RequestMapping("/listAddr")
    public List<Address> listAddr(){
        List<Address> list = new ArrayList<>();

        Address addr1 = new Address();
        addr1.setProvince("安徽");
        addr1.setCity("合肥");

        Address addr2 = new Address();
        addr2.setProvince("陕西");
        addr2.setCity("西安");

        list.add(addr1);
        list.add(addr2);
        return list;
    }
    
}
