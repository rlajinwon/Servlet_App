package com.winter.app.users;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.winter.app.utils.DBConnection;

public class UserDAO {

	public int join(UserDTO userDTO) throws Exception{
		
		Connection con = DBConnection.getConnection();
		
		String sql = "INSERT INTO USERS "
				+ " VALUES (?,?,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, userDTO.getUsername());
		st.setString(2, userDTO.getPassword());
		st.setString(3, userDTO.getName());
		st.setString(4, userDTO.getPhone());
		st.setString(5, userDTO.getEmail());
	
		int result = st.executeUpdate();
		
		DBConnection.disConnection(st, con);
		
		return result;
	}
	
	
	
	
	
}
