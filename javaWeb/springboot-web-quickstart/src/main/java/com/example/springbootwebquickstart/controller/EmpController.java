package com.example.springbootwebquickstart.controller;

import com.example.springbootwebquickstart.pojo.Emp;
import com.example.springbootwebquickstart.pojo.Result;
import com.example.springbootwebquickstart.service.EmpService;
import com.example.springbootwebquickstart.service.impl.EmpServiceA;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    private EmpService empService = new EmpServiceA();
    @RequestMapping("/listEmp")
    public Result list(){
        List<Emp> emplist = empService.listEmp();
//        响应
        return Result.success(emplist);
    }
}
