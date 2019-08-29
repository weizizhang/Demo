package com.example.app.demo.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.app.demo.pojo.User;


public class Test {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setId("1");
		
		User user2 = new User();
		user2.setId("2");
		
		User user3 = new User();
		user3.setId("3");
		
		list.add(user);
		list.add(user2);
		list.add(user3);
//		list.stream().forEach(p -> p.setId("1"));
//		list.stream().forEach(p -> System.out.println(p.getId()));
		
		List<User> userList;
		
		userList = list.stream().filter(u -> "1".equals(u.getId())).collect(Collectors.toList());
		System.out.println("结束");
	}
}
