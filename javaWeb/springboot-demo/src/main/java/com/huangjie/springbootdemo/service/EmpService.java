package com.huangjie.springbootdemo.service;

import com.huangjie.springbootdemo.pojo.PageBean;

import java.time.LocalDate;

public interface EmpService {
    /**
     * 分页操作
     * */
    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin,LocalDate end);
}
