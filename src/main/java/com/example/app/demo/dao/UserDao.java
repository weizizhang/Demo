package com.example.app.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.app.demo.pojo.User;

public interface UserDao {
	/*xml方式*/
	User findByName(String name);
    /*注解方式*/
	@Select("select * from user")
	List<User> findAll();
}
