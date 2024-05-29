package com.huangjie.springbootdemo.service;

import com.huangjie.springbootdemo.pojo.Dept;

import java.util.List;

public interface DeptService {
    //查询部门方法
    List<Dept> list();

    //删除部门
    void delete(Integer id);

    //新增部门
    void add(Dept dept);

    //查询部门
    Dept select(Integer id);

    //修改部门信息
    void put(Dept dept);
}
