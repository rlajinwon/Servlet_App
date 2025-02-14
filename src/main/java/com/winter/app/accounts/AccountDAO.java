package com.winter.app.accounts;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.winter.app.utils.DBConnection;

public class AccountDAO {

	
	public int add(AccountDTO accountDTO) throws Exception{
		
		int result = 0;
		
		Connection con = DBConnection.getConnection();
		
		String sql = "INSERT INTO ACCOUNTS(ACCOUNTNUM,USERNAME,PRODUCTNUM,ACCOUNTDATE) "
				+ " VALUES (TR_SEQ.NEXTVAL,?,?,SYSDATE)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, accountDTO.getUsername());
		st.setInt(2, accountDTO.getProductnum());
		
		result = st.executeUpdate();
		
		DBConnection.disConnection(st, con);
		
		return result;
		
	}
	
}
