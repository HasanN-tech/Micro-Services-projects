package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.client.GetMsg;

@RestController
public class ClientController {

	@Autowired
	private GetMsg msg;
	
	@GetMapping("/get")
	public ResponseEntity<String> msg(){
		return new ResponseEntity<>(msg.msg(), HttpStatus.OK);
	}
}
