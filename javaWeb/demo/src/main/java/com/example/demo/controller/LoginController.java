package com.example.demo.controller;

import com.example.demo.pojo.Emp;
import com.example.demo.pojo.Result;
import com.example.demo.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoginController {
    @Autowired
    private EmpService empService;

    @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
        log.info("员工登录");
        Emp emp1 = empService.login(emp);
        return emp1 != null?Result.success():Result.error("用户名或密码错误！");
    }
}
