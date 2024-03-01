package com.tcs.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.boot.model.Investor;
import com.tcs.boot.service.InvestorService; 

@RestController
@RequestMapping("/investor-api")
public class InvestorController {
	
	@Autowired
	InvestorService iservice;
	
	@GetMapping
	public String check() {
		return "In /investor-api";
	}

	// CREATE
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/add")
	public ResponseEntity<Investor> createInvestor(@RequestBody Investor investor) {
		//return iservice.add(investor);
		return new ResponseEntity<Investor>(iservice.add(investor), HttpStatus.CREATED);
	}	
	// RETRIEVE
	@GetMapping("/{id}")
	public ResponseEntity<Investor> retrieveInvestor(@PathVariable int id) {
		//return iservice.getInvestorById(id);
		return new ResponseEntity<Investor>(iservice.getInvestorById(id), HttpStatus.FOUND);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Investor>> retrieveInvestors() {
		//return iservice.getInvestors();
		return new ResponseEntity<List<Investor>>(iservice.getInvestors(), HttpStatus.FOUND);
	}
	// UPDATE
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/update")
	public ResponseEntity<Investor> updateInvestor(@RequestBody Investor investor) {
		//return iservice.update(investor);
		return new ResponseEntity<Investor>(iservice.update(investor), HttpStatus.OK);
	}
	//DELETE
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String> deleteInvestor(@PathVariable int id) {
		//return iservice.delete(id);
		return new ResponseEntity<String>(iservice.delete(id), HttpStatus.OK);
	}
}
