package com.demo.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection connection = null;
	
	public static Connection getConnection() {
		try {
			// 1. Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " not found");
		}
		
		try {
			// 2. Open the Connection
			connection=DriverManager
					.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false", 
							"root", "BarHarbor4589.");
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			return connection;
		}
	}
}
