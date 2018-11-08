package com.example.app.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.app.demo.service.TestService;
@Service("testA")
public class TestAImpl implements TestService {

	@Override
	public String eat() {
		return "吃火锅";
	}

}
