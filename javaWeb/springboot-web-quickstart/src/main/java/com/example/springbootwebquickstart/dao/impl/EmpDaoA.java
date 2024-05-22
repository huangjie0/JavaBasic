package com.example.springbootwebquickstart.dao.impl;

import com.example.springbootwebquickstart.dao.EmpDao;
import com.example.springbootwebquickstart.pojo.Emp;
import com.example.springbootwebquickstart.utils.XmlParserUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component
@Repository("daoA")
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp(){
        List<Emp> emplist = XmlParserUtils.parse("E:\\项目\\Java\\javaWeb\\springboot-web-quickstart\\src\\main\\resources\\emp.xml", Emp.class);
        System.out.println(emplist);
        return emplist;
    }
}
