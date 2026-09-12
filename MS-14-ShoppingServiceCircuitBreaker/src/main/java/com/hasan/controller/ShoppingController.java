package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.service.ShoppingService;

@RestController
public class ShoppingController {

	@Autowired
	private ShoppingService shoppingService;

	@GetMapping("/shop")
	public ResponseEntity<String> shop() {
		return shoppingService.callPaymentService();
	}
}
