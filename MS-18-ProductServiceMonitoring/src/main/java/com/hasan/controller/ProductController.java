package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.client.ProductClient;

@RestController
public class ProductController {

	@Autowired
	private ProductClient client;
	
	 @GetMapping("/pay")
	    public ResponseEntity<String> payment() {
	        System.out.println("Payment Service Called");
	        return new ResponseEntity<>(client.payment(),HttpStatus.OK);
	    }
}
