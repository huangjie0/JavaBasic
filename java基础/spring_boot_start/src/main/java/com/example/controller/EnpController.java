package com.example.controller;

import com.example.pojo.Result;
import com.example.server.EmpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EnpController {
//    @Autowired
//    @Qualifier("empServerB")
    @Resource(name="empServerA")
    private EmpServer empServer;

    @RequestMapping("/listEmp")
    public Result list(){
        return Result.success(empServer.listEmp());
    }
}
