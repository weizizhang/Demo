package com.example.app.demo.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	
	public static void main(String[] args) {
		List<String> list;
		List<String> list2 = Arrays.asList("1","2","3");
		for(int i=0; i<3; i++) {
			String count = String.valueOf(i);
			list = list2.stream().filter(p -> p.equals(count)).collect(Collectors.toList());
			System.out.println(list.hashCode());
		}
		
	}

}
