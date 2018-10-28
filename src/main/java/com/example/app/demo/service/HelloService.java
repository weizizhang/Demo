package com.example.app.demo.service;

import com.example.app.demo.pojo.Neo;

public interface HelloService {

	public Neo getNeo(String id);
	
	public String clearCache(String id);
}
