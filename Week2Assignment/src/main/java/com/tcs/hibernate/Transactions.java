package com.tcs.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transactions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tId;
	private String tDate;
	private double tAmount;
	private int iId;
	public Transactions() {
		// TODO Auto-generated constructor stub
	}
	public Transactions(int tId, String tDate, double tAmount, int iId) {
		super();
		this.tId = tId;
		this.tDate = tDate;
		this.tAmount = tAmount;
		this.iId = iId;
	}
	
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettDate() {
		return tDate;
	}
	public void settDate(String tDate) {
		this.tDate = tDate;
	}
	public double gettAmount() {
		return tAmount;
	}
	public void settAmount(double tAmount) {
		this.tAmount = tAmount;
	}

	@Override
	public String toString() {
		return "Transactions [tId=" + tId + ", tDate=" + tDate + ", tAmount=" + tAmount + ", iId=" + iId + "]";
	}
	
}
