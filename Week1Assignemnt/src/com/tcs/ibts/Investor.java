package com.tcs.ibts;

public class Investor {
	
	private int id;
	private String name;
	private String option;
	private double amount;
	public Investor(int id, String name, String option, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.option = option;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Investor [id=" + id + ", name=" + name + ", option=" + option + ", amount=" + amount + "]";
	}
	
}
