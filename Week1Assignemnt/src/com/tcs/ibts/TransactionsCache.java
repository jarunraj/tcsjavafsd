package com.tcs.ibts;

import java.util.ArrayList;
import java.util.Iterator;

public class TransactionsCache {

	public TransactionsCache() {
		// TODO Auto-generated constructor stub
	}
	
	ArrayList<Transactions> transactions = new ArrayList<Transactions>();
	ArrayList<Investor> investors = new ArrayList<Investor>();
	
	public boolean addInvestor(Investor i) {
		return investors.add(i);
	}
	
	public void showInvestors() {
		Iterator<Investor> iter = investors.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("No of Investors: " + investors.size());
	}
	
	public boolean addTransactions(Transactions t) {
		boolean flag = false;
		for(Investor i : investors) {
			if(t.getiId() == i.getId()) {
				transactions.add(t);
				flag = true;
			}
		}
		return flag;
	}
	
	public void showTransactions() {
		Iterator<Transactions> iter = transactions.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("No of Transactions: " + transactions.size());
	}
	
}
