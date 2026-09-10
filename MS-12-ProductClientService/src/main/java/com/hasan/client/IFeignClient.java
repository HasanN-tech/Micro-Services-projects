package com.hasan.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hasan.entity.Product;

@FeignClient("MS-12-ProductService")
public interface IFeignClient {

	@PostMapping("/products")
	public String add(@RequestBody Product p);

	@GetMapping("/products")
	public ResponseEntity<List<Product>> showAll();

	@GetMapping("/products/{id}")
	public ResponseEntity<Product> showById(@PathVariable int id);

	@PutMapping("/products/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody Product p);

	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> delete(@PathVariable int id);
}
