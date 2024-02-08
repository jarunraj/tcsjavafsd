package com.tcs.oops;

public class CreateInvestors {
	public static void main(String[] args) {
		
		Investor i1 = new Investor();//i1 will be created during run time. 
		//It will get a copy of all data members of a class
		
		i1.id = 101;
		i1.name = "John";
		i1.address = "Chennai";
		i1.amount = 500;
		
		System.out.println(i1);
		
		System.out.println(i1.getClass().getName() + " @ " + Integer.toHexString(i1.hashCode()));
		
		System.out.println(i1.toString());
		
	}
}
