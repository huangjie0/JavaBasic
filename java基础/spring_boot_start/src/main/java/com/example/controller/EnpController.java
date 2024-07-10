package com.example.controller;

import com.example.pojo.Result;
import com.example.server.impl.EmpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnpController {
    @Autowired
    private EmpServer empServer;

    @RequestMapping("/listEmp")
    public Result list(){
        return Result.success(empServer.listEmp());
    }
}
