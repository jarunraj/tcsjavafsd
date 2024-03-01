package com.tcs.rest.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.tcs.rest.resource.Product;
import com.tcs.rest.services.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/product/api.2.0")
//@Api(value = "Product Service API 2.0",
//description = "Rest endpoints for Product API")
public class ProductResource {

	@Autowired
	ProductService service;

	@GetMapping
	public String check() {
		return "/product/api.1.0";
	}

	@GetMapping("/allproducts")
//	@ApiOperation(value ="Returns the product Entity")
	public List<Product> showAllProducts() {
		return service.getProducts();
	}

	@GetMapping("/productid/{id}")
//	@ApiOperation(value ="Returns the product Entity")
	public Product fetchProduct(@PathVariable int id) {
		return service.getProductById(id);
	}

	@PostMapping
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/addproduct")
//	@ApiOperation(value ="Returns the product Entity")
	public Product createProduct(@RequestBody Product product) {
		return service.save(product);
	}

	@PutMapping
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/modifyproduct")
//	@ApiOperation(value ="Returns the product Entity")
	public Product updateProduct(@RequestBody Product product) {
		return service.update(product);
	}
	
	@DeleteMapping
	@RequestMapping(value = "/removeproduct/{id}")
//	@ApiOperation(value ="Returns the product Entity")
	public String deleteProduct(@PathVariable int id) {
		return service.delete(id);
	}

}
