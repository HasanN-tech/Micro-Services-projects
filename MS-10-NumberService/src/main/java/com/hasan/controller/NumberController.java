package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.client.ClientService;

@RestController
@RequestMapping("/number")
public class NumberController {

	@Autowired
	private ClientService service;
	
	@GetMapping("/palindrome/{n}")
	public ResponseEntity<String> checkPalindrome(@PathVariable int n){
		return new ResponseEntity<>(service.Palindrome(n), HttpStatus.OK);
	}
	
	@GetMapping("/armstrong/{n}")
	public ResponseEntity<String> checkArmstrong(@PathVariable int n){
		return new ResponseEntity<>(service.Armstrong(n), HttpStatus.OK);
	}
	
}
