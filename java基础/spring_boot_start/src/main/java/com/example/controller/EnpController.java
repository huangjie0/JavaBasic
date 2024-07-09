package com.example.controller;

import com.example.pojo.Result;
import com.example.server.impl.EmpServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnpController {
    private EmpServer empServer = new EmpServer();

    @RequestMapping("/listEmp")
    public Result list(){
        return Result.success(empServer.listEmp());
    }
}
