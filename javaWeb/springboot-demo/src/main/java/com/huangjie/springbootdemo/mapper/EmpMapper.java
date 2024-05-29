package com.huangjie.springbootdemo.mapper;

import com.huangjie.springbootdemo.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    /**
     * 查询总记录数
     * */

//    @Select("select count(*) from emp")
//    public Long count();

    /**
     * 查询返回的结果数据
     * */
//    @Select("select * from emp limit #{start},#{pageSize}")
//    public List<Emp> page(@Param("start") Integer start,@Param("pageSize") Integer pageSize);

//    @Select("select * from emp")
    public List<Emp> list(String name, Short gender, LocalDate begin,LocalDate end);

}
