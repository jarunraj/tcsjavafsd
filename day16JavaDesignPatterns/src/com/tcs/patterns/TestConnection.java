package com.tcs.patterns;

public class TestConnection {
	public static void main(String[] args) {
		
		Connection con = Connection.getConnection();
		System.out.println(con);
		
		con = Connection.getConnection();
		System.out.println(con);
		
//		Connection con1 = new Connection();
//		Connection con2 = new Connection();
//		Connection con3 = new Connection();
//		System.out.println(con1);
//		System.out.println(con2);
//		System.out.println(con3);
	}
}
