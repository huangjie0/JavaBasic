package com.example.springbootwebquickstart.controller;

import com.example.springbootwebquickstart.pojo.Emp;
import com.example.springbootwebquickstart.pojo.Result;
import com.example.springbootwebquickstart.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @RequestMapping("/listEmp")
    public Result list(){
        //加载解析xml文件
//        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        System.out.println(file);
        List<Emp> emplist = XmlParserUtils.parse("E:\\项目\\Java\\javaWeb\\springboot-web-quickstart\\src\\main\\resources\\emp.xml", Emp.class);
        System.out.println(emplist);
        //对数据转换
        emplist.stream().forEach(emp -> {
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
                emp.setGender("班主任");
            }else if("3".equals(job)){
                emp.setGender("就业指导");
            }
        });
//        响应
        return Result.success(emplist);
    }
}
