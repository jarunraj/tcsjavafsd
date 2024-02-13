package com.tcs.mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String pDescription;
	private double pAmount;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int pId, String pDescription, double pAmount) {
		super();
		this.pId = pId;
		this.pDescription = pDescription;
		this.pAmount = pAmount;
	}



	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public double getpAmount() {
		return pAmount;
	}

	public void setpAmount(double pAmount) {
		this.pAmount = pAmount;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pDescription=" + pDescription + ", pAmount=" + pAmount + "]";
	}
	
}
