package com.example.demo.service.impl;

import com.example.demo.aop.MyLog;
import com.example.demo.mapper.DeptMapper;
import com.example.demo.mapper.EmpMapper;
import com.example.demo.pojo.Dept;
import com.example.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private EmpMapper empMapper;

    @Override
    @MyLog
    public List<Dept> list(){
        return deptMapper.list();
    }

    @Transactional(rollbackFor = Exception.class) //事务管理，将方法将于spring管理，处理所有的异常
    @Override
    @MyLog
    public void delete(Integer id){
        deptMapper.delete(id);
        empMapper.deleteByDept(id);
    }

    @Override
    @MyLog
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insert(dept);
    }

    @Override
    public Dept selectById(Integer id) {
        return deptMapper.selectById(id);
    }

    @Override
    public void put(Dept dept) {
        deptMapper.put(dept);
    }
}
