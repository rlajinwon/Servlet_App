package com.winter.app.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.utils.DBConnection;

public class ProductDAO {
	
	public int update(ProductDTO productDTO) throws Exception{
		int result = 0;
		Connection con = DBConnection.getConnection();
		
		String sql ="UPDATE PRODUCTS SET PRODUCTNAME = ?,PRODUCTRATE = ?  "
				+ " WHERE PRODUCTNUM = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, productDTO.getProductname());
		st.setDouble(2, productDTO.getProductrate());
		
		result = st.executeUpdate();
		
		DBConnection.disConnection(st, con);
		
		return result;
		
		
		
		
	}
	
	
	
	
	
	public ProductDTO getDetail(ProductDTO productDTO) throws Exception{
		
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM PRODUCTS WHERE PRODUCTNUM = ? ";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, productDTO.getProductnum());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			productDTO.setProductnum(rs.getInt("productnum"));
			productDTO.setProductname(rs.getString("productname"));
			productDTO.setProductrate(rs.getDouble("productrate"));
			productDTO.setProductdate(rs.getDate("productdate"));
			productDTO.setProductdetail(rs.getClob("productdetail"));
			
			
			
		}else {
			productDTO=null;
		}
		
		DBConnection.disConnection(rs, st, con);
		
		return productDTO;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<ProductDTO> getList() throws Exception{
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM PRODUCTS ORDER BY PRODUCTNUM DESC";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		List<ProductDTO> ar = new ArrayList<>();
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductnum(rs.getInt("PRODUCTNUM"));
		productDTO.setProductname(rs.getString("PRODUCTNAME"));
		productDTO.setProductrate(rs.getDouble("PRODUCTRATE"));
		productDTO.setProductdate(rs.getDate("PRODUCTDATE"));
		productDTO.setProductdetail(rs.getClob("PRODUCTDETAIL"));
		ar.add(productDTO);
		
		}
		DBConnection.disConnection(rs, st, con);
		return ar;
		
		
	}
	public int add(ProductDTO productDTO)throws Exception{
		int result = 0;
		
		Connection con = DBConnection.getConnection();
		
		String sql = "INSERT INTO PRODUCTS "
				+ " VALUES (NO_SEQ.NEXTVAL,?,?,SYSDATE,?)" ;
		
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, productDTO.getProductname());
		st.setDouble(2, productDTO.getProductrate());
		st.setClob(3, productDTO.getProductdetail());
		
		result = st.executeUpdate();
		
		DBConnection.disConnection(st, con);
		
		return result;
		
		
		
	}
	
	
	

}
