package com.tcs.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.rest.repository.ProductRepository;
import com.tcs.rest.resource.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;
	
	public List<Product> getProducts() {
		return repo.findAll();
	}
	
	public Product getProductById(int id) {
		Optional<Product> product = repo.findById(id);
		return product.get();
	}
	
	public Product save(Product p) {
		return repo.save(p);
	}
	
	public Product update(Product p) {
		Optional<Product> optional = repo.findById(p.getPId());
		Product tempProduct = optional.get();
		tempProduct.setPDescription(p.getPDescription());
		tempProduct.setPAmount(p.getPAmount());
		return repo.save(tempProduct);
	}
	
	public String delete(int id) {
		Optional<Product> deleted = repo.findById(id);
		repo.deleteById(id);
		return "Successfully deleted: "+ deleted;
	}
}
