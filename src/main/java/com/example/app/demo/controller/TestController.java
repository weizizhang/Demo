package com.example.app.demo.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.demo.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Resource(name="testB")
	private TestService test;
	
	@RequestMapping("/eat")
	public String eat() {
		return test.eat();
	}
}
