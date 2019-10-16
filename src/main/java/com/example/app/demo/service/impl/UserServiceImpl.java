package com.example.app.demo.service.impl;

import com.example.app.demo.dao.UserDao;
import com.example.app.demo.pojo.User;
import com.example.app.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public User findByName(String name) {
		return userDao.findByName(name);
	}
	@Override
	public List<User> findAll() {
		//分页查询
		PageHelper.startPage(1, 3);
		List<User> list = userDao.findAll();
		PageInfo<User> pageInfo = new PageInfo<>(list);
		return list;
	}

	@Override
	public void check() {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("12");
		list.add("123");
		list.add("1234");
		list.add("12345");
		list.add("123456");
		list.add("1234567");
		long count = filter(list);
		System.out.println("-------------------"+count+"---------------------");
	}

	private long filter(List<String> list){
		long count = list.stream().filter((p)->(p.indexOf("2")>0)).count();
		if(count>0){
			return count;
		}
		return 0;
	}
}
