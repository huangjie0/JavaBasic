package com.example.demo.controller;

import com.example.demo.pojo.Emp;
import com.example.demo.pojo.Result;
import com.example.demo.service.EmpService;
import com.example.demo.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class LoginController {
    @Autowired
    private EmpService empService;

    @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
        log.info("员工登录");
        Emp emp1 = empService.login(emp);

        //登录成功，生成令牌，下发令牌
        if(emp1 != null) {
            Map<String,Object> claims = new HashMap<>();
            claims.put("id",emp1.getId());
            claims.put("name",emp1.getName());
            claims.put("username",emp1.getUsername());

            String jwt = JwtUtils.generateJwt(claims); //包含员工登录信息
            return Result.success(jwt);
        }
        return Result.error("用户名或密码错误！");
    }
}
