package com.example.app.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.app.demo.pojo.Neo;

@Configuration
public class NeoConfig2 {

	@Bean
	@ConfigurationProperties(prefix = "com.neo")
	public Neo getNeo() {
		return new Neo();
	}
}
