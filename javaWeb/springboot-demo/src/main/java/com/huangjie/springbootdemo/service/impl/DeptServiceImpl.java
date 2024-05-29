package com.huangjie.springbootdemo.service.impl;

import com.huangjie.springbootdemo.mapper.DeptMapper;
import com.huangjie.springbootdemo.pojo.Dept;
import com.huangjie.springbootdemo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list(){
        return deptMapper.list();
    }

    @Override
    public void delete(Integer id){
        deptMapper.deleteById(id);
    }

    @Override
    public void add(Dept dept){
          dept.setCreateTime(LocalDateTime.now());
          dept.setUpdateTime(LocalDateTime.now());
          deptMapper.insert(dept);
    }

    @Override
    public Dept select(Integer id){
        return deptMapper.selectById(id);
    }
    @Override
    public void put(Dept dept){
        deptMapper.put(dept);
    }
}
