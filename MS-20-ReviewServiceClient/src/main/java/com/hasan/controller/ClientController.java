package com.hasan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.DTO.ReviewDTO;
import com.hasan.service.ReviewClientService;

@RestController
public class ClientController {

		@Autowired
		private ReviewClientService service;

		@PostMapping("/add")
		public ResponseEntity<String> create(@RequestBody ReviewDTO r) {
			return new ResponseEntity<>(service.create(r).toString(), HttpStatus.CREATED);
		}

		@GetMapping("/get/{id}")
		public ResponseEntity<ReviewDTO> getById(@PathVariable int id) {
			return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
		}

		@GetMapping("/get")
		public ResponseEntity<List<ReviewDTO>> getAll() {
			return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		}

		@PatchMapping("/update/{id}")
		public ResponseEntity<String> update(@PathVariable int id, @RequestBody ReviewDTO r) {
			return new ResponseEntity<>(service.update(id, r), HttpStatus.OK);
		}

		@DeleteMapping("/delete/{id}")
		public ResponseEntity<String> delete(@PathVariable int id) {
			return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
		}
	
}
