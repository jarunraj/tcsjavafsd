package com.tcs.collections;

public class PerformTransactions {
	public static void main(String[] args) {
		Investor i1 = new Investor(1, "abc", "chennai", "shares", 50000);
		Investor i2 = new Investor(2, "xyz", "hyd", "bonds", 75000);
		Investor i3 = new Investor(3, "pqr", "pune", "deposits", 80000);
		Investor i4 = new Investor(4, "mno", "delhi", "shares", 40000);
		Investor i5 = new Investor(5, "ijk", "mumbai", "bonds", 30000);
		
		Transaction t1 = new Transaction(101, "01-jan-24", 5000, 1);
		Transaction t2 = new Transaction(102, "01-jan-24", 8000, 2);
		Transaction t3 = new Transaction(103, "02-jan-24", 9000, 3);
		Transaction t4 = new Transaction(104, "04-jan-24", 10000, 4);
		Transaction t5 = new Transaction(105, "05-jan-24", 8000, 5);
		
		InvestmentTransactions it = new InvestmentTransactions();
		it.addTransaction(t1);
		it.addTransaction(t2);
		it.addTransaction(t3);
		it.addTransaction(t4);
		it.addTransaction(t5);
		
//		it.showTransactions();
		System.out.println(it.showGivenTransaction(104));
		
		it.updateTransactionAmount(104, 15000);
		System.out.println(it.showGivenTransaction(104));
	}
}
