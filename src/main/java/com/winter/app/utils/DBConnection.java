package com.winter.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	
	//getCnnection
	
	public static Connection getConnection() throws Exception{
		
		String user = "user01";
		String password = "user01";
		String url ="jdbc:oracle:thin:@15.164.220.106:1521:xe";
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
