package com.example.app.demo.dao;

import com.example.app.demo.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDaoTest {
    @Resource
    private UserDao userDao;

    @Test
    public void batchInsertTest(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setId("1001");
        user.setUsername("AA");
        user.setPassword("123");
        user.setVersion(1);
        user.setCreateTime(new Timestamp(System.currentTimeMillis()));
        user.setUpdateTime(new Timestamp(System.currentTimeMillis()));

        User user2 = new User();
        user2.setId("1002");
        user2.setUsername("SS");
        user2.setPassword("123");
        user2.setVersion(1);
        user2.setCreateTime(new Timestamp(System.currentTimeMillis()));
        user2.setUpdateTime(new Timestamp(System.currentTimeMillis()));

        User user3 = new User();
        user3.setId("1003");
        user3.setUsername("QQ");
        user3.setPassword("123");
        user3.setVersion(1);
        user3.setCreateTime(new Timestamp(System.currentTimeMillis()));
        user3.setUpdateTime(new Timestamp(System.currentTimeMillis()));

        list.add(user);
        list.add(user2);
        list.add(user3);

        int count = userDao.batchInsert(list);
//        Assert.assertEquals(3, count);
    }
}