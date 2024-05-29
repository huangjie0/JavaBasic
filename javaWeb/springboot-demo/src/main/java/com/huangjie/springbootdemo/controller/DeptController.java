package com.huangjie.springbootdemo.controller;

import com.huangjie.springbootdemo.pojo.Dept;
import com.huangjie.springbootdemo.pojo.Result;
import com.huangjie.springbootdemo.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
//抽取公共路径操作
@RequestMapping("/depts")

public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping
    public Result list(){

        log.info("查询全部信息");
        //调用service查询全部信息
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);

    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id来删除部门：{}",id);
        deptService.delete(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("新增部门：{}",dept);
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result select(@PathVariable Integer id){

        log.info("根据id来查询部门：{}",id);
        Dept selectDept = deptService.select(id);
        return Result.success(selectDept);
    }

    @PutMapping
    public Result putDept(@RequestBody Dept dept){
        log.info("修改部门：{}",dept);
        deptService.put(dept);
        return Result.success();
    }
}
