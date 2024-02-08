package com.tcs.encapsulation;

public class CreateInvestors {
	public static void main(String[] args) {
		 
		Investor i1 = new Investor();
		i1.setId(101);
		i1.setName("John");
		i1.setAddress("Chennai");
		i1.setAmount(500);
		
		System.out.println(i1.getName());
		System.out.println(i1.getAddress());
		
		Investor i2 = new Investor();
		i2.setId(103);
		i2.setName("Doe");
		i2.setAddress("Tambaram");
		i2.setAmount(5000);
		
		System.out.println(i1 +" "+ i1.hashCode());
		System.out.println(i2 +" "+ i2.hashCode());
		
		boolean result = i1 == i2;
		System.out.println(result);
		
		Investor i3 = i1;
		result = i3 == i1;
		System.out.println(i1 +" "+ i1.hashCode());
		System.out.println(i3 +" "+ i3.hashCode());
		System.out.println(result);
		
		Investor i4 = i3 = i1;
		System.out.println(i4 +" "+ i4.hashCode());
		
		i3 = null;
		result = i3 == i1;
		System.out.println(result);
		
		
		
	}
}
