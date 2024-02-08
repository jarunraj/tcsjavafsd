package com.tcs.training;

public class TestTypesVariables {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;
		if(a < 10)
			c = a + b;
		if(a >= 10)
			c = a - b;
		
		System.out.println(c);
		
		boolean result = a > b && a > c;
		
		System.out.println(!result +", "+ result);
		
		boolean flag = true;
		
		if(flag == true) // (flag) // flag = true
			System.out.println(flag);
		
		a = -20;
		
		if(a < 0)
			System.out.println("Negative");
		else
			System.out.println("Not Negative");
		
		int total = 575;
		int subjects = 6;
		//print grade -> A+, A, B, C, D
		double avg = total/subjects;
		
		System.out.println(avg);
			
		if(avg > 90 && avg <= 100)
			System.out.println("A+");
		else if(avg > 80 && avg <= 90)
			System.out.println("A");
		else if(avg > 70 && avg <= 80)
			System.out.println("B");
		else if(avg > 50 && avg <= 70)
			System.out.println("C");
		else
			System.out.println("D, Fail");
		
		
	}

}
