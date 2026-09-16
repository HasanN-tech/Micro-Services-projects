package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.client.NotificationClient;

@RestController
public class NotificationController {

	@Autowired
	private NotificationClient client;
	
	@GetMapping("/notify")
	public ResponseEntity<String> notifyy(){
		return new ResponseEntity<String>(client.payment(), HttpStatus.OK);
	}
}
