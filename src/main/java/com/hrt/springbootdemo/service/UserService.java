package com.hrt.springbootdemo.service;

import com.hrt.springbootdemo.mapper.UserMapper;
import com.hrt.springbootdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserService{

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long id){
        return userMapper.queryUserById(id);
    }

    public Long regUser(User user){
        return userMapper.regUser(user);
    }

    public List<User> queryAllUsers(){
        return userMapper.queryAllUsers();
    }

    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    public void deleteUser(Long id){
        userMapper.deleteUser(id);
    }
}
