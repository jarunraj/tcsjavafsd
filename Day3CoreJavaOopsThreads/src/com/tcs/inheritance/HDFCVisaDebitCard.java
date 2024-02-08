package com.tcs.inheritance;

public class HDFCVisaDebitCard extends Card {

	public HDFCVisaDebitCard() {
		super();
	}

	public HDFCVisaDebitCard(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super(cardNo, expiry, cvv, name, pin, amount);
	}
	
	@Override
	public boolean swipe(double transactionAmount) {
		// get balance from account based on cardNo of customer.
		// balance will get updated by transactionAmount
		System.out.println("Transaction Successful from HDFC Debit Card");
		return true;
	}
	
}
