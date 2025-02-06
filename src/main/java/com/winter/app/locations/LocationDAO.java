package com.winter.app.locations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.utils.DBConnection;

public class LocationDAO {
	
	public int update(LocationDTO locationDTO) throws Exception{
		int result = 0;
		
		Connection con = DBConnection.getConnection();
		
		String sql = "UPDATE LOCATIONS SET STREET_ADDRESS = ?, POSTAL_CODE = ? ,CITY = ?, STATE_PROVINCE = ? , COUNTRY_ID = ? "
				+ " WHERE LOCATION_ID = ? ";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, locationDTO.getStreetAddress());
		st.setString(2, locationDTO.getPostalCode());
		st.setString(3, locationDTO.getCity());
		st.setString(4, locationDTO.getStateProvince());
		st.setString(5, locationDTO.getCountryId());
		st.setInt(6, locationDTO.getLocationId());
		
		
		result = st.executeUpdate();
		
		DBConnection.disConnection(st, con);
		
		
		return result;
		
		
	}
//	private int locationId;
//	private String streetAddress;
//	private String postalCode;
//	private String city;
//	private String stateProvince;
//	private String countryId;
//	
	
	
	
	
	//부서삭제
	public int delete(LocationDTO locationDTO) throws Exception{
		
		int result = 0;
		
		Connection con = DBConnection.getConnection();
		
		String sql = "DELETE FROM LOCATIONS WHERE LOCATION_ID = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1,locationDTO.getLocationId());
		
		result = st.executeUpdate();
		
		DBConnection.disConnection(st, con);
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int add(LocationDTO locationDTO) throws Exception{
		int result = 0;
		
		Connection con = DBConnection.getConnection();
		
		String sql = "INSERT INTO LOCATIONS VALUES(LOCATIONS_SEQ.NEXTVAL,?,?,?,?,?)";
	
		
		PreparedStatement st = con.prepareStatement(sql);
		

		st.setString(1, locationDTO.getStreetAddress());
		st.setString(2, locationDTO.getPostalCode());
		st.setString(3, locationDTO.getCity());
		st.setString(4, locationDTO.getStateProvince());
		st.setString(5, locationDTO.getCountryId());
		
		
		result = st.executeUpdate();
		
		DBConnection.disConnection(st, con);
		
		return result;
	}
	
	
	
	
	
	
	
	
	public List<LocationDTO> getlist() throws Exception{
		System.out.println("지역정보 리스트 조회");
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM LOCATIONS ORDER BY LOCATION_ID DESC";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		List<LocationDTO> ar = new ArrayList<LocationDTO>();
		
		while(rs.next()) {
			LocationDTO locationDTO = new LocationDTO();
			locationDTO.setLocationId(rs.getInt("LOCATION_ID"));
			locationDTO.setStreetAddress(rs.getString("STREET_ADDRESS"));
			locationDTO.setPostalCode(rs.getString("POSTAL_CODE"));
			locationDTO.setCity(rs.getString("CITY"));
			locationDTO.setStateProvince(rs.getString("STATE_PROVINCE"));
			locationDTO.setCountryId(rs.getString("COUNTRY_ID"));
			
			ar.add(locationDTO);
			
		}
		
	
		
		DBConnection.disConnection(rs, st, con);
		return ar;
		
		
		
	}
	public LocationDTO getdetail(LocationDTO locationDTO) throws Exception{
		System.out.println("한 지역 정보 조회");
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = ? ";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, locationDTO.getLocationId());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			locationDTO = new LocationDTO();
			locationDTO.setLocationId(rs.getInt("LOCATION_ID"));
			locationDTO.setStreetAddress(rs.getString("STREET_ADDRESS"));
			locationDTO.setPostalCode(rs.getString("POSTAL_CODE"));
			locationDTO.setCity(rs.getString("CITY"));
			locationDTO.setStateProvince(rs.getString("STATE_PROVINCE"));
			locationDTO.setCountryId(rs.getString("COUNTRY_ID"));
			
			
		}
		DBConnection.disConnection(rs, st, con);
		
		return locationDTO;
		
		
		
		
	}

}
