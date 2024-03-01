package com.tcs.boot.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class EmployeeResource {
	
	@GetMapping("/")
	public String greet() {
		return "greet() working";
	}
	
	@GetMapping("/admin")
	public String greetAdmin() {
		return "greet() working for Admin";
	}
	
	@GetMapping("/user")
	public String greetUser() {
		return "greet() working for User";
	}
	
}
