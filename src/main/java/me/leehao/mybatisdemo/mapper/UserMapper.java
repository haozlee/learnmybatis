package me.leehao.mybatisdemo.mapper;

import me.leehao.mybatisdemo.entity.User;
import org.springframework.stereotype.Repository;

public interface UserMapper {
    User QueryById(int id);
}