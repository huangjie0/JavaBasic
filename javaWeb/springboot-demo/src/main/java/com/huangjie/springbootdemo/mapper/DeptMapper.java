package com.huangjie.springbootdemo.mapper;

import com.huangjie.springbootdemo.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    /*
    *   查询部门信息的方法
    * */
    @Select("select * from dept")
    List<Dept> list();

    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into dept(name,create_time,update_time) values (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);

    @Select("select * from dept where id = #{id}")
    Dept selectById(Integer id);

    @Update("update dept set name=#{name} where id = #{id}")
    void put(Dept dept);
}
