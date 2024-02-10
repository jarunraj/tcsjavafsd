package com.tcs.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iId;
	private String iName;
	private String iOption;
	private double iAmount;
	public Investor() {
		// TODO Auto-generated constructor stub
	}
	public Investor(int iId, String iName, String iOption, double iAmount) {
		super();
		this.iId = iId;
		this.iName = iName;
		this.iOption = iOption;
		this.iAmount = iAmount;
	}
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public String getiOption() {
		return iOption;
	}
	public void setiOption(String iOption) {
		this.iOption = iOption;
	}
	public double getiAmount() {
		return iAmount;
	}
	public void setiAmount(double iAmount) {
		this.iAmount = iAmount;
	}
	@Override
	public String toString() {
		return "Investor [iId=" + iId + ", iName=" + iName + ", iOption=" + iOption + ", iAmount=" + iAmount + "]";
	}	
}
