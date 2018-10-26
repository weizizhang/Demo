package com.example.demo.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Neo;
import com.example.demo.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService {

	@Override
	@Cacheable(value="neoCache")
	public Neo getNeo(String id) {
//		Neo n = getData();
//		return n;
		System.out.println("query db");
		Neo neo = new Neo();
		neo.setTitle("标题");
		neo.setDescription("描述");
		return neo;
	}

	private Neo getData() {
		System.out.println("query db");
		Neo neo = new Neo();
		neo.setTitle("标题");
		neo.setDescription("描述");
		return neo;
	}
}
