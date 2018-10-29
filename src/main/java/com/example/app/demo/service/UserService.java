package com.example.app.demo.service;

import java.util.List;

import com.example.app.demo.pojo.User;

public interface UserService {

	public User findByName(String name);
	
	public List<User> findAll();
}
