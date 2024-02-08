package com.tcs.ibts;

public class DemonstrateTransactions {

	public static void main(String[] args) {
				
		Investor i1 = new Investor(101, "Arun", "shares", 1000);
		Investor i2 = new Investor(102, "Nivaz", "bonds", 3000);
		Investor i3 = new Investor(103, "Sunil", "shares", 2000);
		
		TransactionsCache tcache = new TransactionsCache();
		
		tcache.addInvestor(i1);
		tcache.addInvestor(i2);
		tcache.addInvestor(i3);
		
		// Display no of investors
		// tcache.showInvestors();
		
		Transactions t1 = new Transactions(1, "01-02-2024", 500, 101);
		Transactions t4 = new Transactions(2, "02-02-2024", 500, 101);
		Transactions t7 = new Transactions(3, "03-02-2024", 500, 101);
		
		Transactions t2 = new Transactions(1, "01-02-2024", 1500, 102);
		Transactions t6 = new Transactions(2, "02-02-2024", 2500, 102);
		
		Transactions t3 = new Transactions(1, "01-02-2024", 2500, 100);
		Transactions t9 = new Transactions(1, "02-02-2024", 2500, 104);
		Transactions t8 = new Transactions(1, "03-02-2024", 1500, 105);
		
		Transactions t5 = new Transactions(1, "02-02-2024", 1500, 103);
		
		tcache.addTransactions(t1);
		tcache.addTransactions(t2);
		tcache.addTransactions(t3);
		tcache.addTransactions(t4);
		tcache.addTransactions(t5);
		tcache.addTransactions(t6);
		tcache.addTransactions(t7);
		tcache.addTransactions(t8);
		tcache.addTransactions(t9);
		
		// Display no of transactions
		tcache.showTransactions();
	}
}
