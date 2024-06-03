package com.example.demo.mapper;

import com.example.demo.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from dept")
    List<Dept> list();

    @Delete("delete from dept where id = #{id}")
    void delete(Integer id);

    @Insert("insert into dept(name,create_time,update_time) values (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);

    @Select("select * from dept where id=#{id}")
    Dept selectById(Integer id);

    @Update("update dept set name=#{name},create_time=#{createTime},update_time=#{updateTime} where id=#{id}")
    void put(Dept dept);
}
