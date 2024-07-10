package com.example.dao.impl;

import com.example.dao.EmpDao;
import com.example.pojo.Emp;
import com.example.utils.XmlParserUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp(){
        List<Emp> empList = XmlParserUtils.parse("E:\\项目\\Java\\java基础\\spring_boot_start\\src\\main\\resources\\emp.xml", Emp.class);
        return empList;
    }
}
