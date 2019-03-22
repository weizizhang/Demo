package com.example.app.demo.dao;

import com.example.app.demo.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
	/*xml方式*/
	User findByName(String name);
    /*注解方式*/
	@Select("select * from user")
	List<User> findAll();
}
