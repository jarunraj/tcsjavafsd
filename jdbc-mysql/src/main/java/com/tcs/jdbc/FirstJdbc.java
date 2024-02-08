package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbc {

	public static void main(String[] args) throws SQLException {
		
		// 1. Establish Connection - url, username & password of DB
		// url = "jdbc:mysql//localhost:3306/dbname"
		// 2. Obtain statement reference
		// 3. Prepare SQL statement as string
		// 4. Execute statement
		// 5. Fetch Results
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Root123$");
		System.out.println("Connected");
		
		Statement st = con.createStatement();
		String sql = "select * from EMP";
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
				System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getInt(4));
		}
		
		
		
	}

}
