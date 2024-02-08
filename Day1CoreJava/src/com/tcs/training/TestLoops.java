package com.tcs.training;

public class TestLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = 1, stop = 100;
		
		while(start <= stop) {
			System.out.println("Runnning at " +start+ " m");
			start++;
		}
		
		System.out.println(start +" "+ stop);
				
		for(start = 1; start <= stop; start++) {
			System.out.println("Runnning at " +start+ " m");
		}
		
		for(; start > 0; start--) {
			System.out.println("Runnning at " +start+ " m");
		}
		
		for(start = 1; start <= stop/2; start++) {
			System.out.println("Runnning at " +start+ " m");
		}
		
		for(start = 1; start <= stop/2; start += 2) {
			System.out.println("Runnning at " +start+ " m");
		}
		
		int sum = 0;
		
		for(start = 1; start <= stop/2; start += 1) {
			sum += start;
			if( start % 3 == 0) {
				System.out.println(sum);
				sum = 0;
			}
		}
		
		double amount = 1000000;
		double comp_amount = amount;
		int tenure = 25;
		float rate = 13.0f;
		for(int i = 1; i <= tenure; i++) {
			comp_amount += (comp_amount*(rate)/100);
			System.out.println(comp_amount);
		}
		

	}

}
