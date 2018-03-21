package com.hrt.springbootdemo.mapper;

import com.hrt.springbootdemo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface UserMapper {

    User queryUserById(@Param("id") Long id);

    Long regUser(User user);

    List<User> queryAllUsers();

    void updateUser(User user);

    void deleteUser(@Param("id") Long id);
}
