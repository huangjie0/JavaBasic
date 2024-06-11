package com.example.demo.controller;

import com.example.demo.anno.Log;
import com.example.demo.pojo.Dept;
import com.example.demo.pojo.Result;
import com.example.demo.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/depts")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping
    public Result list(){
        log.info("查询全部信息！");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    @Log
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除部门:{}",id);
        deptService.delete(id);
        return Result.success();
    }

    @PostMapping
    @Log
    public Result update(@RequestBody Dept dept) {
        log.info("新增部门:{}", dept);
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        log.info("根据id查询数据成功");
        Dept dept = deptService.selectById(id);
        return Result.success(dept);
    }

    @PutMapping
    public Result put(@RequestBody Dept dept){
        deptService.put(dept);
        return Result.success();
    }
}
