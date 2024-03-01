package com.tcs.patterns;

public class Connection {
	
	private static Connection con = null;
	
	private Connection() {
	// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() {	
		if(con == null)
			return con = new Connection();
		else
			return con;
	}
}
