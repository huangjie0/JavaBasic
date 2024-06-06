package com.example.demo.mapper;

import com.example.demo.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
//    @Select("select count(*) from emp")
//    public Long count();

//    @Select("select * from emp limit #{start},#{pageSize}")
//    public List<Emp> page(@Param("start") Integer start,@Param("pageSize") Integer pageSize);

    //@Select("select * from emp")
    public List<Emp> page(@Param("name") String name,@Param("gender") Short gender,@Param("begin") LocalDate begin,@Param("end") LocalDate end);

    void delete(@Param("ids") List<Integer> ids);

    @Delete("delete from emp where dept_id = #{deptId}")
    void deleteByDept(Integer id);

    @Insert("insert into emp (username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    void save(Emp emp);

    @Select("select * from emp where id=#{id}")
    Emp getById(Integer id);

    void update(Emp emp);

    @Select("select * from emp where username = #{username} and password = #{password}")
    Emp login(Emp emp);

}
