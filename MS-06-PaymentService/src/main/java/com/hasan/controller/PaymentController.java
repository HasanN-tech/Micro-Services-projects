package com.hasan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	@Value("${server.port}")
	private int port;
	
	@Value("${spring.application.name}")
	private String instanceId;
	
	@GetMapping("/payment")
	public ResponseEntity<String> doPayment() {
		
		String result="Payment processing."+port+" "+instanceId;
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
}
