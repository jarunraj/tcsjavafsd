package com.tcs.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.boot.model.Investor;
import com.tcs.boot.repository.InvestorRepository;

@Service
public class InvestorService {

	@Autowired
	InvestorRepository irepo;
	
	public Investor add(Investor inv) {
		return irepo.save(inv);
	}
	public Investor getInvestorById(int id) {
		Optional<Investor> optional = irepo.findById(id);
		return optional.get();
	}
	public List<Investor> getInvestors() {
		return irepo.findAll();
	}
	public Investor update(Investor inv) {
		Optional<Investor> optional = irepo.findById(inv.getIId());
		Investor temp = optional.get();
		temp.setIName(inv.getIName());
		temp.setIAmount(inv.getIAmount());
		temp.setIOption(inv.getIOption());
		return irepo.save(inv);
	}
	public String delete(int id) {
		Optional<Investor> optional = irepo.findById(id);
		irepo.deleteById(id);
		return "deleted" + optional;
	}
}
