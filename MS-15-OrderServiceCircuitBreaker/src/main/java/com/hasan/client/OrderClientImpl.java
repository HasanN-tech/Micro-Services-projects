package com.hasan.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderClientImpl implements OrderClient {

	@Override
	public ResponseEntity<String> pay() {
		return new ResponseEntity<>("Fallback Method called.", HttpStatus.OK);
	}

}
