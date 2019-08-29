package com.example.app.demo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CheryAnnotation {
	String name();
	int age() default 18;
	int[] score();
}
