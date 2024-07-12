package com.example.server.impl;

import com.example.dao.EmpDao;
import com.example.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Primary
public class EmpServerA implements com.example.server.EmpServer {
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp(){
        //获取dao的相关数据
        List<Emp> empList = empDao.listEmp();

        empList.stream().forEach(emp->{
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else if("2".equals(gender)){
                emp.setGender("女");
            }

            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)){
                emp.setJob("班主任");
            }else if("3".equals(job)){
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
