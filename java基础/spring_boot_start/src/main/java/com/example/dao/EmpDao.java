package com.example.dao;

import com.example.pojo.Emp;

import java.util.List;

public interface EmpDao {
    //获取员工列表集合
    public List<Emp> listEmp();
}
