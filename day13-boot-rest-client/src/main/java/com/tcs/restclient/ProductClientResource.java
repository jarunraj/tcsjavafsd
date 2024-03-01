package com.tcs.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class ProductClientResource {
	@Autowired
	RestTemplate template;
	
	@GetMapping
	public Product getProduct() {
		Product prod = template.getForObject("http://localhost:9090/product/api.1.0/productid/12", Product.class);
		return prod;
	}
}
