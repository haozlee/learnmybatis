package me.leehao.mybatisdemo.controller;

import me.leehao.mybatisdemo.entity.User;
import me.leehao.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("user/{id}")
    public String GetUser(@PathVariable int id){
        User user = userService.QueryById(id);
        if (user != null) {
            return user.toString();
        } else {
            return String.format("User(id: %s) not found", id);
        }
    }
}