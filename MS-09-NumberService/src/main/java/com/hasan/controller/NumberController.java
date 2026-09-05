package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.client.INumberService;

@RestController
public class NumberController {
	
	@Autowired
	private INumberService service;
	
	@GetMapping("/prime/{n}")
	public ResponseEntity<String> checkPrime(@PathVariable int n){
		return new ResponseEntity<>(service.checkPrime(n), HttpStatus.OK);
	}
}
