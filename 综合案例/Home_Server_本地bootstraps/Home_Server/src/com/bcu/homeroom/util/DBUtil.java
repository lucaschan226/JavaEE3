package com.bcu.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static Connection conn;
	private static Statement sm;
	private static ResultSet rs;
	static {
		
		try {
				Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
	public static Connection getConnection() {
		try {
			conn=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/longtermroom?characterEncoding=UTF-8",
					"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return conn;
		
	}
	
	 public static void close(Connection con,Statement sm,ResultSet rs){

	        try {
	            if(rs !=null)rs.close();
	        } catch (Exception e) {
	           e.printStackTrace();
	        }

	        try {
	            if(sm !=null)sm.close();
	        } catch (Exception e) {
	        	 e.printStackTrace();
	        }

	        try {
	            if(con !=null)con.close();
	        } catch (Exception e) {
	        	 e.printStackTrace();
	        }
	    }
	
}
