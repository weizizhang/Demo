package com.example.app.demo.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.demo.config.NeoConfig;
import com.example.app.demo.config.NeoConfig2;
import com.example.app.demo.dao.UserDao;
import com.example.app.demo.pojo.Good;
import com.example.app.demo.pojo.Neo;
import com.example.app.demo.pojo.User;
import com.example.app.demo.service.HelloService;
import com.google.gson.Gson;

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
	
	@PostMapping("/go")
	public String go(@RequestParam("a") String a1, @RequestParam("b") String b1, @RequestParam("c") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime c) {
		return a1+":"+b1+":"+c.toString();
	}
	
	@GetMapping("/get")
	public String getTime() {
		return LocalDateTime.now().toString();
	}
	
	@PostMapping("/post")
	public String getT(@RequestBody Good g) {
		return g.getT().toString();
	}
	
	@PostMapping("/p/{title}")
	public String getPathvari(@PathVariable("title") String title) {
		return title;
	}
	
//	public static void main(String[] args) {
//		Gson gson = new Gson();
//		Good g = new Good();
//		g.setT(LocalDateTime.now());
//		System.out.println(gson.toJson(g));
//	}
}