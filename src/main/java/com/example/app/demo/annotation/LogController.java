package com.example.app.demo.annotation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
	
	@RequestMapping("/my")
	@Authorization(permission=PermissionEnum.YES)
	public String log() {
		return "myLog";
	}
}
