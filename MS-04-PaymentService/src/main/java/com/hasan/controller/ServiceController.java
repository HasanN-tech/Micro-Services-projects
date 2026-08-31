package com.hasan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@GetMapping("/payment")
	public String paymentService() {
		return "Payment Service is running successfully.";
	}
	
}
