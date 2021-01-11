package me.leehao.mybatisdemo.service;

import me.leehao.mybatisdemo.entity.User;
import me.leehao.mybatisdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User QueryById(int id){
        return userMapper.QueryById(id);
    }
}