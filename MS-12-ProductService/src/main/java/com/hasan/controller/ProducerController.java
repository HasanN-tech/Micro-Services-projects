package com.hasan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.entity.Product;
import com.hasan.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/products")
public class ProducerController {

	@Autowired
	private ProductService service;
	
	@PostMapping
	public String add(@RequestBody Product p) {
		return service.addProduct(p);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Product>> showAll(){
		return new ResponseEntity<>(service.getAllProduct(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> showById(@PathVariable int id){
		return new ResponseEntity<>(service.getProductById(id), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody Product p){
		return new ResponseEntity<>(service.updateProduct(id,p), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		return new ResponseEntity<>(service.deleteProduct(id), HttpStatus.OK);
	}
}
