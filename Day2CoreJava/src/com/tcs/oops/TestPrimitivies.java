package com.tcs.oops;

public class TestPrimitivies {

	static void validate(byte b) {
		b++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		final int i = 127;
		float f = 10.0f;
		double d = 10.0;
		b = i;
		//i = b;
		validate(b);
		
		final short s = 10;
		short sum = s + s;
		// shorter & longer data type calculation results in longer type
		// byte, short will be converted to int after calculation.
		
		
		
	}

}
