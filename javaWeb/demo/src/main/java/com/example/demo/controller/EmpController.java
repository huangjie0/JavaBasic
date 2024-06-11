package com.example.demo.controller;

import com.example.demo.anno.Log;
import com.example.demo.pojo.Emp;
import com.example.demo.pojo.PageBean;
import com.example.demo.pojo.Result;
import com.example.demo.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name,
                       Short gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end
                       ){
        log.info("分页查询，参数，{}，{}，{}，{}，{}，{}",page,pageSize,name,gender,begin,end);
        PageBean pageBean = empService.page(page,pageSize,name,gender,begin,end);
        return Result.success(pageBean);
    }

    @DeleteMapping("/{ids}")
    @Log
    public Result delete(@PathVariable List<Integer> ids){
        log.info("批量删除操作：{}",ids);
        empService.delete(ids);
        return Result.success();
    }

    @PostMapping
    @Log
    public Result save(@RequestBody Emp emp){
        log.info("新增员工的功能");
        empService.save(emp);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("根据id查询员工信息");
        Emp emp = empService.getById(id);
        return Result.success(emp);
    }

    @PutMapping
    @Log
    public Result update(@RequestBody Emp emp){
        log.info("更新员工信息");
        empService.update(emp);
        return Result.success();
    }
}
