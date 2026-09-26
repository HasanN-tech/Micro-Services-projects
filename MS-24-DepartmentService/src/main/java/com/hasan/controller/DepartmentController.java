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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.entity.Department;
import com.hasan.service.DepartmentService;
@RequestMapping("/department")
@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService service;

	@PostMapping("/add")
	public ResponseEntity<Department> add(@RequestBody Department d) {
		System.out.println(service.add(d));
		return new ResponseEntity<>(service.add(d), HttpStatus.CREATED);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Department> get(@PathVariable int id) {
		System.out.println(service.getById(id));
		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
	}

	@GetMapping("/get")
	public ResponseEntity<List<Department>> getAll() {
		System.out.println(service.getAll());
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}

	@PatchMapping("/update/{id}")
	public ResponseEntity<Department> update(@PathVariable int id, @RequestBody Department d) {
		return new ResponseEntity<>(service.update(id, d), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
	}

}
