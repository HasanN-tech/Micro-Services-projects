package com.hasan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/payment")
	public String payment() {
		System.out.println("Payment Service Called");
		return "Payment Service Response";
	}
}
