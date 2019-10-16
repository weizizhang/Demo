package com.example.app.demo.service.impl;

import com.example.app.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;
    @Test
    public void findByNameTest() {
        userService.findByName("jack");
    }
    @Test
    public void findAllTest() {
        userService.findAll();
    }
    @Test
    public void checkTest() {
        userService.check();
    }
}