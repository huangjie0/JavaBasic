package com.example.demo.service.impl;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.pojo.Emp;
import com.example.demo.pojo.PageBean;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceImpl implements com.example.demo.service.EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin,LocalDate end) {
        //获取总数
//        Long count = empMapper.count();
        //获取查询结果
//        List<Emp> pageList = empMapper.page( (page-1)*pageSize,pageSize);

        PageHelper.startPage(page,pageSize);

        List<Emp> pageList = empMapper.page(name,gender,begin,end);

        Page<Emp> p = (Page<Emp>)pageList;
        //封装pagebean
        PageBean pageBean = new PageBean(p.getTotal(),p.getResult());

        return pageBean;
    }

    @Override
    public void delete(List<Integer> ids) {
        empMapper.delete(ids);
    }

    @Override
    public void save(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.save(emp);
    }

    @Override
    public Emp getById(Integer id) {
        return empMapper.getById(id);
    }

    @Override
    public void update(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update(emp);
    }
}
