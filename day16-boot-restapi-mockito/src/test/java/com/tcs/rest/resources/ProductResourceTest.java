package com.tcs.rest.resources;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.rest.resource.Product;
import com.tcs.rest.services.ProductService;

@WebMvcTest(ProductResource.class)
class ProductResourceTest {

	@MockBean
	ProductService service;
	
	@Autowired
	MockMvc mockMvc; // makes a dummy HTTP call - get, post, put, delete
	
	@Test
	public void test_addProduct() throws Exception {
		Product product = new Product(1, "Apple Iphone 15", 75000);
		when(service.save(product)).thenReturn(product);
		
		mockMvc.perform(post("/addproduct").
		contentType(MediaType.APPLICATION_JSON).
		content(new ObjectMapper().
		writeValueAsString(product)));
	}
	
	@Test
	public void test_updateProduct() throws Exception {
		Product product = new Product(1, "Apple Iphone 15", 75000);
		when(service.save(product)).thenReturn(product);
		
		mockMvc.perform(put("/updateproduct").
		contentType(MediaType.APPLICATION_JSON).
		content(new ObjectMapper().
		writeValueAsString(product)));
	}
	
	@Test
	public void test_getAllProductst() throws Exception {
		Product product = new Product(1, "Apple Iphone 15", 75000);
		when(service.save(product)).thenReturn(product);
		Product product1 = new Product(2, "Apple Iphone 15", 75000);
		when(service.save(product1)).thenReturn(product1);
		Product product2 = new Product(3, "Apple Iphone 15", 75000);
		when(service.save(product2)).thenReturn(product2);
		
		List<Product> products = new ArrayList<Product>();
		products.add(product);
		products.add(product1);
		products.add(product2);
		
		mockMvc.perform(get("/allproducts").
		contentType(MediaType.APPLICATION_JSON).
		content(new ObjectMapper().
		writeValueAsString(products)));
	}

}
