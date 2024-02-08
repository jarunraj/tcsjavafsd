package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class FirstJdbc2 {

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
		
		String update = "update EMP set sal = sal + 10 where deptno in (10,20,30)";
		int count = st.executeUpdate(update);
		System.out.println("Records updated count#" + count);
		
//		String sql = "insert into EMP values(" + "1013, 'abc', 'MANAGER', 7839, '1999-01-01', 2300, null, 10)";
//		
//		int count = st.executeUpdate(sql);
//		System.out.println("Records inserted count#" + count);
		
		String sql = "select * from EMP";
		ResultSet rs = st.executeQuery(sql);
		
//		ResultSetMetaData rsmd = rs.getMetaData();
//	
//		System.out.println(rsmd.getColumnCount());
//		System.out.println(rsmd.getColumnName(1));
//		System.out.println(rsmd.getColumnName(2));
//		System.out.println(rsmd.getColumnName(3));
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getInt(4) + " | " 
					+ rs.getDate(5) + " | " + rs.getDouble(6) + " | " + rs.getDouble(7) + " | " + rs.getInt(8));
		}
		
	}

}
