package com.tcs.oops.inheritance;

import java.util.Objects;

public class Investor {
	private int id;
	private String name;
	private String address;
	private double amount;
	static int count;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Investor.count = count;
	}

	@Override
	public int hashCode() {
		//return Objects.hash(address, id, name);
		return this.id*32 + 
			   this.name.length()*32*2 + 
			   this.address.length()*32*3;
	}

	@Override
	public boolean equals(Object obj) {
		
		Investor other = (Investor) obj;
		
		//if(this.id == other.getId() && this.name == other.getName() && this.address == other.getAddress())
		if(Integer.compare(this.id, other.getId()) == 0 && this.name.compareTo(other.getName()) == 0 && this.address.compareTo(other.getAddress()) == 0)
			return true;
		else
			return false;
	}

	public Investor(int id, String name, String address, double amount) { 
		super(); 
		this.id = id; 
		this.name = name; 
		this.address = address;
		this.amount = amount;
		count++;
	}
	
	public Investor(int id, String name, String address) { 
		super(); 
		this.id = id; 
		this.name = name; 
		this.address = address;
		count++;
	}
	 	 
	public Investor() {
		// TODO Auto-generated constructor stub
		count++;
	}

	@Override
	public String toString() {
		return "Investor [id=" + id + ", name=" + name + ", address=" + address + ", amount=" + amount + "]";
	}

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
