package com.hasan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/employee")
	public String msg(){
		return "Hello from Employee Service";
	}
	
}
