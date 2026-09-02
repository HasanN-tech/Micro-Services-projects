package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.client.PaymentClient;

@RestController
public class OrderController {
	@Autowired
	PaymentClient client;
	
	@GetMapping("/pay")
	public ResponseEntity<String> pay(){
		return client.pay();
	}
	
}
