package com.example.app.demo.service.impl;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.app.demo.pojo.Neo;
import com.example.app.demo.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService {

	//所有key中的单引号 都不能少，不然会被识别成一个对象
	@Override
	@Cacheable(value="userCache",key="'user_'+#id")
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

	@CacheEvict(value="userCache",key="#id")
	public String clearCache(String id) {
		return "清楚缓存成功";
	}
}
