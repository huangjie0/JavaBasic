package com.huangjie.mapper;

import com.huangjie.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    //根据id删除员工信息
    @Delete("delete from emp where id = #{id}")
    public void delete(Integer id);

    //新增员工,返回主键，id作为主键
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) values (\n" +
            "#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime});")
    public void insert(Emp emp);

    //更新数据
    @Update("update emp set username = #{username},name=#{name} ,gender = #{gender},image = #{image},job=#{job},entrydate=#{entrydate}," +
            "dept_id=#{deptId},update_time=#{updateTime} where id = #{id};")

    public void update(Emp emp);

    //根据id来查询员工
//    @Select("select * from emp where id = #{id}")
//    public Emp select(Integer id);

    //解决实体类和数据库表字段不一致问题
//    @Select("select id, username, password, name, gender, image, job, entrydate, dept_id deptId, create_time createTime, update_time updateTime from emp where id = #{id}")
//    public Emp select(Integer id);

//    @Results({
//            @Result(column = "dept_id",property = "deptId"),
//            @Result(column = "create_time",property = "createTime"),
//            @Result(column = "update_time",property = "updateTime"),
//    })
//    @Select("select * from emp where id = #{id}")
//    public Emp select(Integer id);

    //开启mybatis的驼峰自动命名开关
    @Select("select * from emp where id = #{id}")
    public Emp select(Integer id);

    //条件查询员工信息
//    @Select("select * from emp where name like concat('%',#{name},'%') and gender = #{gender} and entrydate between #{begin} and #{end} order by update_time desc")
    public List<Emp> list(@Param("name") String name,@Param("gender") Short gender,@Param("begin") LocalDate begin,@Param("end") LocalDate end);

    //动态更新员工信息
//    @Update("update emp set username = #{username},name=#{name} ,gender = #{gender},image = #{image},job=#{job},entrydate=#{entrydate}," +
//            "dept_id=#{deptId},update_time=#{updateTime} where id = #{id};")

    public void update2(Emp emp);

    //批量删除员工
    public void deleteByIds(List<Integer> ids);
}

