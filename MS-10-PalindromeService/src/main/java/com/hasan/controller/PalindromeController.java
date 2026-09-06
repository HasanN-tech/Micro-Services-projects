package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.service.AppService;

@RestController
public class PalindromeController {

	@Autowired
	private AppService service;
	
	@GetMapping("/check/{n}")
	public ResponseEntity<String> checkPalindrome(@PathVariable int n){
		return new ResponseEntity<>(service.checkPalindrome(n), HttpStatus.OK);
	}
	
	@GetMapping("/arm/{n}")
	public ResponseEntity<String> checkArmstrong(@PathVariable int n){
		return new ResponseEntity<>(service.checkArmstrong(n), HttpStatus.OK);
	}
}
