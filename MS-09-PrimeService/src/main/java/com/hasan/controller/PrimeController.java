package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.service.PrimeChecker;

@RestController
public class PrimeController {

	@Autowired
	private PrimeChecker checker;
	
	@GetMapping("/check/{n}")
	public ResponseEntity<String> check(@PathVariable int n){
		return new ResponseEntity<String>(checker.check(n), HttpStatus.OK);
	}
}
