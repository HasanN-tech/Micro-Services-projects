package com.hasan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/book")
	public ResponseEntity<String> book(){
		return ResponseEntity.ok("Hello from book service");
	}
}
