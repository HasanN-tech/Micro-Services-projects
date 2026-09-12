package com.hasan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	@GetMapping("/pay")
	public ResponseEntity<String> showMsg() {
		return new ResponseEntity<>("Payment Service Called.", HttpStatus.OK);
	}

}
