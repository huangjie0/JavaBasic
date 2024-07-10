package com.example.server.impl;

import com.example.dao.impl.EmpDaoA;
import com.example.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpServer implements com.example.server.EmpServer {
    @Autowired
    private EmpDaoA empDao;

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
