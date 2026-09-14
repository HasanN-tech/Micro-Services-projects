package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.client.OrderClient;

@RestController
public class OrderController {

	@Autowired
	private OrderClient client;
	
	@GetMapping("/order")
	public ResponseEntity<String> order(){
		return ResponseEntity.status(200).body(client.pay().getBody());
	}
}
