package com.ruanko.springboothelloworld.mapper;

import com.ruanko.springboothelloworld.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resource;

@Mapper
public interface UserMapper {
    @Select("select * from logins where username=#{username} AND password=#{password}")
    User getInfo(@Param("username")String username,@Param("password")String password);

}
