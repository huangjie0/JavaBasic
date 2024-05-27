package com.huangjie.mapper;

import com.huangjie.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper //运行时，实现接口实现类，ioc容器
public interface UserMapper {
    @Select("select * from user")
    public List<User> list();
}

