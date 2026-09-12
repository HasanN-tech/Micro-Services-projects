package com.hasan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("/customer")
	public String msg() {
		return "Hello Customer.";
	}
}
