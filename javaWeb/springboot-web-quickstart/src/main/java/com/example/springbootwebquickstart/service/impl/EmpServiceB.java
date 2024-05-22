package com.example.springbootwebquickstart.service.impl;

import com.example.springbootwebquickstart.dao.EmpDao;
import com.example.springbootwebquickstart.pojo.Emp;
import com.example.springbootwebquickstart.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
//@Primary
@Service
public class EmpServiceB implements EmpService {
    @Autowired  //依赖注入
    private EmpDao empDao;
    @Override
    public List<Emp> listEmp(){
        //调用dao获取数据
        List<Emp> emplist = empDao.listEmp();

        emplist.stream().forEach(emp -> {
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男士");
            }else if("2".equals(gender)){
                emp.setGender("女士");
            }

            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)){
                emp.setGender("班主任");
            }else if("3".equals(job)){
                emp.setGender("就业指导");
            }
        });
        return emplist;
    }
}
