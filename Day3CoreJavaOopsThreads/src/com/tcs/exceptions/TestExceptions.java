package com.tcs.exceptions;

import java.io.*;

public class TestExceptions {

	// exception is an object
	// objects are created at runtime
	
	public static Exception method(RuntimeException re) throws Exception {
		if(re == null)
			throw new Exception("Exception thrown");
		else
			return new RuntimeException("Returning without exception");
	}
	
	public static void main(String[] args) {
		
			
		try {
			Exception e = method(new RuntimeException());
			//System.out.println(e);
			System.out.println(e.getMessage());
			//method(null);
		} 
		catch (ArithmeticException ae) {
			ae.printStackTrace();
		} 
		catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		} 
		catch (RuntimeException re) {
			re.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		catch (Throwable t) {
			t.printStackTrace();
		}
		finally {
			
		}
		
		
//		try {
//			FileInputStream fis = new FileInputStream("");
//		}
//		catch(FileNotFoundException fnf) {
//			fnf.printStackTrace();
//		}
		
//		try {
//			System.out.println("Before Divide by zero");
//			System.out.println(10/0);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e.toString());
//			e.printStackTrace();
//			System.out.println("Caught Exception");	
//		}
//		finally {
//			System.out.println("Finally block - After Divide by zero");	
//		}
//		System.out.println("Inside code After Divide by zero");
	}

}
