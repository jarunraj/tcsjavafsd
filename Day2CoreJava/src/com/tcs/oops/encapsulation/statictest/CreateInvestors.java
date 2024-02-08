package com.tcs.oops.encapsulation.statictest;

public class CreateInvestors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Investor.getCount());
		Investor i1 = new Investor(101, "John", "Velachaery", 20000);
		System.out.println(i1.getCount());
		Investor i2 = new Investor(102, "Jason", "Chennai");
		System.out.println(i2.getCount());
		Investor i3 = new Investor(103, "Doe", "Tambaram", 20000);
		System.out.println(i3.getCount());
		Investor i4 = new Investor();
		System.out.println(i4.getCount());
		i1.setCount(240);
		System.out.println(i4.getCount());
		i1.setAmount(44000);
		System.out.println(i4.getAmount());
		
	}			

}
