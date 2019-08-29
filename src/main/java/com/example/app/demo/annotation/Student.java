package com.example.app.demo.annotation;

public class Student {

	@CheryAnnotation(name="jack", age=10, score= {10,12})
	public void study(int times) {
		for(int i=0;i<times;i++) {
			System.out.println(i+":abc");
		}
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.study(10);
	}
}
