package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.NeoConfig;
import com.example.demo.config.NeoConfig2;
import com.example.demo.pojo.Neo;
import com.example.demo.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private NeoConfig neoConfig;
	
	@Autowired
	private NeoConfig2 neoConfig2;
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/config")
	public Neo getConfig() {
		return neoConfig2.getNeo();
	}
	
	@RequestMapping("/getData")
	public Neo getData(){
		return helloService.getNeo("a1");
	}
}
