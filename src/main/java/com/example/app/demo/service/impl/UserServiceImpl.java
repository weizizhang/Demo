package com.example.app.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.demo.dao.UserDao;
import com.example.app.demo.pojo.User;
import com.example.app.demo.service.UserService;
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
		return null;
	}

	
}
