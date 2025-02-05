package com.winter.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	
	//getCnnection
	
	public static Connection getConnection() throws Exception{
		
		String user = "hr";
		String password = "hr";
		String url ="jdbc:oracle:thin:@3.37.62.87:1521:xe";
		String driver ="oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		return DriverManager.getConnection(url,user,password);
		
	}
	public static void disConnection(ResultSet rs, PreparedStatement st , Connection con) throws Exception {
		rs.close();
		st.close();
		con.close();
	}
	public static void disConnection(PreparedStatement st , Connection con)throws Exception {
		
		st.close();
		con.close();
	}
	
	
	
	
	//disConnection
	
	//disConnection

}
