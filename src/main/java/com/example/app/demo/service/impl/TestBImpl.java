package com.example.app.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.app.demo.service.TestService;
@Service("testB")
public class TestBImpl implements TestService {

	@Override
	public String eat() {
		return "吃烧烤";
	}

}
