package com.example.springbootwebquickstart.controller;

import com.example.springbootwebquickstart.pojo.Emp;
import com.example.springbootwebquickstart.pojo.Result;
import com.example.springbootwebquickstart.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmpController {
//    @Qualifier("empServiceB")
//    @Autowired  //依赖注入
    @Resource(name="empServiceB")
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list(){
        List<Emp> emplist = empService.listEmp();
//        响应
        return Result.success(emplist);
    }
}
