package com.hasan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
	@Value("${server.port}")
	private int port;
	
	@Value("${spring.application.name}")
	private String id;
	
	@GetMapping("/inventory")
	public ResponseEntity<String> inventory(){
		return new ResponseEntity<String>(id+" Inventory Service called successfully. "+port,HttpStatus.OK);
	}
}
