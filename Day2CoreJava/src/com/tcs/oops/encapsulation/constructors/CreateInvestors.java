package com.tcs.oops.encapsulation.constructors;

public class CreateInvestors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Investor i1 = new Investor(101, "John Doe", "Chennai", 20000);
		System.out.println(i1);
		
		Investor i2 = new Investor(101, "John Doe", "Chennai");
		System.out.println(i2);
		
		i2.setAmount(15000);
		System.out.println(i2);
		
		boolean result = i1.equals(i2);
		System.out.println(result);
		result = i1 == i2;
		System.out.println(result);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());

	}

}
