package com.hasan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	@Autowired
	private DiscoveryClient client;

	@GetMapping("/notify")
	public ResponseEntity<String> notifies() {
		List<ServiceInstance> instances = client.getInstances("MS-05-NotificationService");
		ServiceInstance serviceInstance = instances.get(0);
		String url = serviceInstance.getUri() + "/notification";
		String string = new RestTemplate().getForObject(url, String.class);
		return new ResponseEntity<>(string, HttpStatus.OK);
	}
}
