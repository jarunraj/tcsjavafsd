package com.tcs.collections;

import java.util.*;

public class InvestmentTransactions {
	
	ArrayList<Transaction> transactions = new ArrayList<>();
	
	public boolean addTransaction(Transaction t) {
		boolean flag = transactions.add(t);
		return flag;
	}
	
	public void showTransactions() {
		//System.out.println(transactions);
//		for(Transaction t : transactions) {
//			System.out.println(t);
//		}
		Iterator<Transaction> iter = transactions.iterator();
		while(iter.hasNext()) {
			Transaction t = iter.next();
			System.out.println(t);
		}
	}
	
	public Transaction showGivenTransaction(int transactionId) {
		
		Transaction temp = null;
		for(Transaction t: transactions) {
			if(t.gettId() == transactionId)
				temp = t;
		}
		return temp;
	}
	
	
	
	public void updateTransactionAmount(int transactionId, double amount) {
		for(Transaction t: transactions) {
			if(t.gettId() == transactionId)
				t.setTranAmount(amount);
		}
	}

}
