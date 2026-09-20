package com.hasan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@GetMapping("/member")
	public ResponseEntity<String> member(){
		return ResponseEntity.ok("Hello from member service");
	}
}
