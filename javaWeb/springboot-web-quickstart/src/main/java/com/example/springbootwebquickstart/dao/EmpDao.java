package com.example.springbootwebquickstart.dao;

import com.example.springbootwebquickstart.pojo.Emp;

import java.util.List;

public interface EmpDao {
    //用来获取员工数据
    List<Emp> listEmp();
}
