package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    //Mybatis 的Mapper接口注解
    //创建用户
    @Insert("insert into user_tb (user_name,password,create_time,update_time) VALUES(#{user_name},#{password},#{create_time},#{update_time})")
    public void save(User user);


    //查询是否存在
    @Select("select * from user_tb where user_name = #{username} and password = #{password}")
    User Identify(String username, String password);


}
