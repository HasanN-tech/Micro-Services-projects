package com.hasan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/order")
	public ResponseEntity<String> msg(){
		return new ResponseEntity<>("Order service.", HttpStatus.OK);
	}
}
