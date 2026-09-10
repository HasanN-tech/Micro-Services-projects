package com.hasan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hasan.entity.Product;

@Service
public interface ProductService {

	public String addProduct(Product p);
	public List<Product> getAllProduct();
	public Product getProductById(int id);
	public String updateProduct(int id,Product p);
	public String deleteProduct(int id);
	
}
