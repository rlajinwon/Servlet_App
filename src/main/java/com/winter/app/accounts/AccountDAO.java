package com.winter.app.accounts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.users.UserDTO;
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
	
	public List<AccountDTO> getList(UserDTO userDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM ACCOUNTS WHERE USERNAME = ?";
		PreparedStatement st = connection.prepareStatement(sql);
		st.setString(1, userDTO.getUsername());
		ResultSet rs = st.executeQuery();
		List<AccountDTO> ar = new ArrayList<AccountDTO>();
		
		while(rs.next()) {
			AccountDTO accountDTO = new AccountDTO();
			accountDTO.setAccountbalance(rs.getInt("accountbalance"));
			accountDTO.setAccountdate(rs.getDate("accountdate"));
			accountDTO.setAccountnum(rs.getInt("accountnum"));
			accountDTO.setProductnum(rs.getInt("productnum"));
			accountDTO.setUsername(rs.getString("username"));
			ar.add(accountDTO);
		}
		
		DBConnection.disConnection(rs, st, connection);
		
		return ar;
	}
	
	
	
	
}
