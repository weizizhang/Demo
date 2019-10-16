package com.example.app.demo.service;

import com.example.app.demo.pojo.User;

import java.util.List;

public interface UserService {

	public User findByName(String name);
	
	public List<User> findAll();

	void check();
}
