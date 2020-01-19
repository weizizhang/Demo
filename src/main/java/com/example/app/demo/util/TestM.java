//package com.example.app.demo.util;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.example.app.demo.pojo.User;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class TestM {
//	@Test
//	public void test() {
//		List<User> list = new ArrayList<User>();
//		User user = new User();
//		user.setId("1");
//
//		User user2 = new User();
//		user2.setId("2");
//
//		User user3 = new User();
//		user3.setId("3");
//
//		list.add(user);
//		list.add(user2);
//		list.add(user3);
////		list.stream().forEach(p -> p.setId("1"));
////		list.stream().forEach(p -> System.out.println(p.getId()));
//
//		List<User> userList;
//
//		userList = list.stream().filter(u -> "1".equals(u.getId())).collect(Collectors.toList());
//		System.out.println("结束");
//	}
//
//	@Test
//	public void test2() {
//		List<String> list;
//		List<String> list2 = Arrays.asList("1","2","3");
//		for(int i=0; i<3; i++) {
//			String count = String.valueOf(i);
//			list = list2.stream().filter(p -> p.equals(count)).collect(Collectors.toList());
//			System.out.println(list.hashCode());
//		}
//
//		//过滤后为空的数据
//		list = list2.stream().filter(p -> p.equals("9")).collect(Collectors.toList());
//		System.out.println(list.size());
//	}
//}
