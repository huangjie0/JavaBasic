package com.example.demo.service;

import com.example.demo.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> list();

    void delete(Integer id);

    void add(Dept dept);

    Dept selectById(Integer id);

    void put(Dept dept);
}
