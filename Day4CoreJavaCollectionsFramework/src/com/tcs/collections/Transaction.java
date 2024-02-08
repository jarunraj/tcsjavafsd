package com.tcs.collections;

public class Transaction {
	int tId;
	String tranDate;
	double tranAmount;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public double getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(double tranAmount) {
		this.tranAmount = tranAmount;
	}
	public int getInvestorId() {
		return investorId;
	}
	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}
	int investorId;
	
	public Transaction() {
	}
	public Transaction(int tId, String tranDate, double tranAmount, int investorId) {
		super();
		this.tId = tId;
		this.tranDate = tranDate;
		this.tranAmount = tranAmount;
		this.investorId = investorId;
	}
	@Override
	public String toString() {
		return "Transaction [tId=" + tId + ", tranDate=" + tranDate + ", tranAmount=" + tranAmount + ", investorId="
				+ investorId + "]";
	}
}
