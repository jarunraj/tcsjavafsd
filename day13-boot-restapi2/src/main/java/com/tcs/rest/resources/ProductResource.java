package com.tcs.rest.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.tcs.rest.resource.Product;
import com.tcs.rest.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/product/api.1.0")
public class ProductResource {

	@Autowired
	ProductService service;

	@GetMapping
	public String check() {
		return "/product/api.1.0";
	}

	@GetMapping("/allproducts")
	public List<Product> showAllProducts() {
		return service.getProducts();
	}

	@GetMapping("/productid/{id}")
	public Product fetchProduct(@PathVariable int id) {
		return service.getProductById(id);
	}

	@PostMapping
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/addproduct")
	//@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		
		return new ResponseEntity(service.save(product), HttpStatus.CREATED);
//		HttpHeaders myheader = new HttpHeaders();
//		myheader.add("secret", "something");
//		myheader.add("secret", "something");
//		myheader.add("secret", "something");
//		return ResponseEntity.status(HttpStatus.CREATED).headers(myheader).body(service.save(product));
		// return service.save(product);
		//service.save(product);
		//return ResponseEntity.status(HttpStatus.CREATED).body("Create request fulfilled");
		//return ResponseEntity.status(HttpStatus.CREATED).body(service.save(product));
	}

	@PutMapping
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/modifyproduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.update(product);
	}
	
	@DeleteMapping
	@RequestMapping(value = "/removeproduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.delete(id);
	}

}
