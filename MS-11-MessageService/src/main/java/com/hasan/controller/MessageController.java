package com.hasan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageController {
	
	@Value("${message}")
	private String msg;
	
	@GetMapping("/msg")
	public ResponseEntity<String> getMsg(){
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
