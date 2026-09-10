package com.hasan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.client.IFeignClient;
import com.hasan.entity.Product;

@RestController
public class ClientController {

	@Autowired
	private IFeignClient client;
	
	@PostMapping("/products")
	public ResponseEntity<String> add(@RequestBody Product p) {
		return new ResponseEntity<>(client.add(p), HttpStatus.CREATED);
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> showAll(){
		return new ResponseEntity<List<Product>>(client.showAll().getBody(),HttpStatus.OK);
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> showById(@PathVariable int id){
		return new ResponseEntity<>(client.showById(id).getBody(), HttpStatus.OK);
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody Product p){
		return new ResponseEntity<>(client.update(id,p).getBody(), HttpStatus.OK);
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		return new ResponseEntity<>(client.delete(id).getBody(), HttpStatus.OK);
	}
	
}
