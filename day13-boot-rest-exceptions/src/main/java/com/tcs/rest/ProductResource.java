package com.tcs.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.rest.exceptions.InvalidValueException;

@RestController
public class ProductResource {

	@GetMapping
	public String message(String str) throws InvalidValueException, Exception {
		
		if(str == null)
			throw new NullPointerException("Value not provided");
		
		boolean isNumeric = str.chars().anyMatch(x -> Character.isDigit(x));
		if(isNumeric)
			throw new InvalidValueException("Expected String, Received Int");
		
		if(str.length() == 1)
			throw new Exception("Give a value with length greater than 1");
		
		return "Hello " + str;
	}
}
