package com.example.app.demo.controller;

import com.example.app.demo.pojo.User;
import com.example.app.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findByName")
    public User findByName(String name) {
        return userService.findByName(name);
    }

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
}
