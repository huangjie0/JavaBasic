package com.huangjie.springbootdemo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huangjie.springbootdemo.mapper.EmpMapper;
import com.huangjie.springbootdemo.pojo.Emp;
import com.huangjie.springbootdemo.pojo.PageBean;
import com.huangjie.springbootdemo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

//    @Override
//    public PageBean page(Integer page,Integer pageSize){
//
//        //获取总记录数
//        Long count = empMapper.count();
//        //获取总数据
//        List<Emp> empList = empMapper.page((page-1)*pageSize,pageSize);
//        //封装pageBean对象
//        PageBean pageBean = new PageBean(count,empList);
//        return pageBean;
//    }
    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin,LocalDate end){
        //设置分页参数
        PageHelper.startPage(page,pageSize);
        //执行查询查询
        Page<Emp> p = (Page<Emp>)empMapper.list(name,gender,begin,end);
        //封装pageBean对象
        PageBean pageBean = new PageBean(p.getTotal(),p.getResult());
        return pageBean;

    }
}
