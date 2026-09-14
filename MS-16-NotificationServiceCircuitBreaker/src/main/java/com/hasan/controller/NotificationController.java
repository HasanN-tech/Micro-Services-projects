package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.service.NotificationService;

@RestController
public class NotificationController {

	@Autowired
	private NotificationService service;
	
	@GetMapping("/show")
	public ResponseEntity<String> show(){
		return new ResponseEntity<>(service.msg(), HttpStatus.OK);
	}
}
