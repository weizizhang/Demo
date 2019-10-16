package com.example.app.demo.controller;

import com.example.app.demo.config.NeoConfig;
import com.example.app.demo.config.NeoConfig2;
import com.example.app.demo.pojo.Neo;
import com.example.app.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

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
	@RequestMapping("/clearCache")
	public String clearCache(){
		return helloService.clearCache("a1");
	}

	@PostMapping("go")
	public String hello(@RequestParam("a") String a, @RequestParam("b") String b, @RequestParam("c")LocalDateTime c){
		return a+":"+b+":"+c.toString();
	}
}