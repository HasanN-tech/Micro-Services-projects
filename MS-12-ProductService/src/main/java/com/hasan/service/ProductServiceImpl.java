package com.hasan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasan.entity.Product;
import com.hasan.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public String addProduct(Product p) {
		return repo.save(p).toString();
	}
	
	@Override
	public List<Product> getAllProduct() {
		return repo.findAll();
	}

	@Override
	public Product getProductById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public String updateProduct(int id, Product p) {
		Product prod=getProductById(id);
		prod.setName(p.getName());
		prod.setCategory(p.getCategory());
		prod.setPrice(p.getPrice());
		prod.setQuantity(p.getQuantity());
		repo.save(prod);
		return "Record updated with id: "+id;
	}

	@Override
	public String deleteProduct(int id) {
		repo.deleteById(id);
		return "Record updated with id: "+id;
	}

}
