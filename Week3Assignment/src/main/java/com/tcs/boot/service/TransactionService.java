package com.tcs.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.boot.model.Transaction;
import com.tcs.boot.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository trepo;
	
	public Transaction add(Transaction trxn) {
		return trepo.save(trxn);
	}
	public Transaction getTransactionById(int id) {
		Optional<Transaction> optional = trepo.findById(id);
		return optional.get();
	}
	public List<Transaction> getTransactions() {
		return trepo.findAll();
	}
	public Transaction update(Transaction trxn) {
		Optional<Transaction> optional = trepo.findById(trxn.getIId());
		Transaction temp = optional.get();
		temp.setTAmount(trxn.getTAmount());
		temp.setTDate(trxn.getTDate());
		temp.setTId(trxn.getTId());
		return trepo.save(trxn);
	}
	public String delete(int id) {
		Optional<Transaction> optional = trepo.findById(id);
		trepo.deleteById(id);
		return "deleted" + optional;
	}
}
