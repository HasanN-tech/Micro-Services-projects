package com.hasan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hasan.client.ShoppingClient;

@Service
public class ShoppingService {
	@Autowired
	private ShoppingClient shoppingClient;

	public ResponseEntity<String> callPaymentService() {
		return shoppingClient.pay();
	}

}
