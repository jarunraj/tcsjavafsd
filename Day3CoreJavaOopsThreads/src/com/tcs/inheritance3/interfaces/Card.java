package com.tcs.inheritance3.interfaces;

public class Card implements CardIface{
	
	private int cardNo;
	private String expiry;
	private int cvv;
	private String name;
	private int pin;
	private double amount; // available balance or credit limit
	
	public Card() {
		
	}
	
	public Card(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super();
		this.cardNo = cardNo;
		this.expiry = expiry;
		this.cvv = cvv;
		this.name = name;
		this.pin = pin;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", expiry=" + expiry + ", cvv=" + cvv + ", name=" + name + ", pin=" + pin
				+ ", amount=" + amount + "]";
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public boolean swipe(double transactionAmount) {
		// TODO Auto-generated method stub
		System.out.println("From Card class");
		return false;
	}
	
}
