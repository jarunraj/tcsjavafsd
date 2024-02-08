package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class FirstJdbc3 {

	public static void main(String[] args) throws SQLException {
		
		// 1. Establish Connection - url, username & password of DB
		// url = "jdbc:mysql//localhost:3306/dbname"
		// 2. Obtain statement reference
		// 3. Prepare SQL statement as string
		// 4. Execute statement
		// 5. Fetch Results
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Root123$");
		System.out.println("Connected");
		
		PreparedStatement ps = con.prepareStatement("update EMP set sal = sal + ? where empno = ?");
		ps.setInt(1, 0);
		ps.setInt(2, 7839);
		
		int count = ps.executeUpdate();
		System.out.println(count + " records updated...");
		
	}

}
