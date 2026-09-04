package com.hasan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

	@Value("${server.port}")
	private int port;
	
	@Value("${spring.application.name}")
	private String id;
	
	@GetMapping("/notification")
	public ResponseEntity<String> notification(){
		return new ResponseEntity<String>("Notification from: "+id+" with port:  "+port,HttpStatus.OK);
	}
}
