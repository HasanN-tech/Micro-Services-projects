package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.feign.StudentClient;

@RestController
public class StudentController {
	
	@Autowired
	private StudentClient client;
	
	@GetMapping("/notify")
	public ResponseEntity<String> notification(){
		return client.notifies();
	}
}
