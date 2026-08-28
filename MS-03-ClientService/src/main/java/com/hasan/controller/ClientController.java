package com.hasan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {
	@Autowired
	private DiscoveryClient client;
	@GetMapping("/msg")
	public String  message(){
		List<ServiceInstance> instances = client.getInstances("MS-03-EmployeeService");
		ServiceInstance serviceInstance = instances.get(0);
		String url=serviceInstance.getUri()+"/employee";
		return new RestTemplate().getForObject(url, String.class);
	}
}
