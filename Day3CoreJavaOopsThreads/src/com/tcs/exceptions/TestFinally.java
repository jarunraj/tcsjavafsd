package com.tcs.exceptions;

public class TestFinally {

	public static void main(String[] args) {
		System.out.println("Before try, catch & finally");
		try {
			System.out.println("In try");
			System.out.println(10/2);
		}
		catch(ArithmeticException ae) {
			System.out.println("In catch");
			ae.printStackTrace();
		}
		finally {
			System.out.println("In finally");
		}
		System.out.println("After try, catch & finally");
	}

}
