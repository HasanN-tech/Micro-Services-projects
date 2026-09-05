package com.hasan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.client.InventoryClient;

@RestController
public class InventoryController {

	@Autowired
	private InventoryClient client;
	
	@GetMapping("/invent")
	public ResponseEntity<String> invent(){
		return client.invent();
	}
}
