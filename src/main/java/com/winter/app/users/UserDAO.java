package com.winter.app.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.winter.app.utils.DBConnection;

public class UserDAO {
	
	
	
	public int update(UserDTO userDTO) throws Exception{
		Connection con = DBConnection.getConnection();
		
		String sql = "UPDATE USERS SET NAME = ?,PHONE = ?,EMAIL = ?,PASSWORD = ? ";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, userDTO.getName());
		st.setString(2, userDTO.getPhone());
		st.setString(3, userDTO.getEmail());
		st.setString(4, userDTO.getPassword());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnection(st, con);
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	public UserDTO detail(UserDTO userDTO) throws Exception{
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM USERS WHERE USERNAME = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, userDTO.getUsername());
		
		ResultSet rs = st.executeQuery();
		UserDTO result = null;
		
		if(rs.next()) {
			
			
			result = new UserDTO();
			result.setUsername(rs.getString("USERNAME"));
			result.setPhone(rs.getString("PHONE"));
			result.setEmail(rs.getString("EMAIL"));
			
		}
		DBConnection.disConnection(rs, st, con);
		
		return result;
		
		
		
	}
	
	
	
	
	
	
	

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
	
	public UserDTO login(UserDTO userDTO) throws Exception{
		Connection con = DBConnection.getConnection();
		
		
		String sql = "SELECT USERNAME, PASSWORD, NAME FROM USERS "
				+ " WHERE USERNAME = ? AND PASSWORD = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, userDTO.getUsername());
		st.setString(2, userDTO.getPassword());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			userDTO.setName(rs.getString("NAME"));
		}else {
			userDTO = null;
		}
		DBConnection.disConnection(rs, st, con);
		
		return userDTO;
	}
	
	}
	
	
	

