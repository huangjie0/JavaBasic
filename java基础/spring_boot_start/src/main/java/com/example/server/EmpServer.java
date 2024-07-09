package com.example.server;

import com.example.pojo.Emp;

import java.util.List;

public interface EmpServer {
    //获取员工列表数据
    public List<Emp> listEmp();
}
