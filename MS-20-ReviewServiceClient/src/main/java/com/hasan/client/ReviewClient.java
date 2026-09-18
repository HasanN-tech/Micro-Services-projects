package com.hasan.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hasan.DTO.ReviewDTO;

@FeignClient(name="MS-20-ReviewService",fallback = ClientFallback.class)
public interface ReviewClient {
	
	@PostMapping("/add")
	public String create(@RequestBody ReviewDTO r);
	
	@GetMapping("/get/{id}")
	public ReviewDTO getById(@PathVariable int id);

	@GetMapping("/get")
	public List<ReviewDTO> getAll();

	@PatchMapping("/update/{id}")
	public String update(@PathVariable int id, @RequestBody ReviewDTO r);
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id);
}
