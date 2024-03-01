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

import com.tcs.boot.model.Transaction;
import com.tcs.boot.service.TransactionService;

@RestController
@RequestMapping("/transaction-api")
public class TransactionController {
	
	@Autowired
	TransactionService tservice;
	
	@GetMapping
	public String check() {
		return "In /transaction-api";
	}
	
	// CREATE
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/add")
	public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
		//return tservice.add(transaction);
		return new ResponseEntity<Transaction>(tservice.add(transaction), HttpStatus.CREATED);
	}	
	// RETRIEVE
	@GetMapping("/{id}")
	public ResponseEntity<Transaction> retrieveTransaction(@PathVariable int id) {
		//return tservice.getTransactionById(id);
		return new ResponseEntity<Transaction>(tservice.getTransactionById(id), HttpStatus.FOUND);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Transaction>> retrieveTransactions() {
		//return tservice.getTransactions();
		return new ResponseEntity<List<Transaction>>(tservice.getTransactions(), HttpStatus.FOUND);
	}
	// UPDATE
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/update")
	public ResponseEntity<Transaction> updateTransaction(@RequestBody Transaction transaction) {
		//return tservice.update(transaction);
		return new ResponseEntity<Transaction>(tservice.update(transaction), HttpStatus.OK);
	}
	//DELETE
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String> deleteTransaction(@PathVariable int id) {
		//return tservice.delete(id);
		return new ResponseEntity<String>(tservice.delete(id), HttpStatus.OK);
	}
}
