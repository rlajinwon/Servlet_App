package com.winter.app.locations;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import com.winter.app.ActionForward;
import com.winter.app.departments.DepartmentDTO;

public class LocationService {
	
	private LocationDAO locationDAO;
	
	public LocationService() {
	locationDAO = new LocationDAO();
		
	}
	
	public ActionForward getList(HttpServletRequest request, ActionForward actionForward) throws Exception{
		List<LocationDTO> ar = locationDAO.getlist();
		request.setAttribute("list", ar);
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/locations/list.jsp");
		return actionForward;
		
		
	}
	public ActionForward getDetail(HttpServletRequest request , ActionForward actionForward) throws Exception{
		
		String id = request.getParameter("location_id");
		LocationDTO locationDTO = new LocationDTO();
		locationDTO.setLocationId(Integer.parseInt(id));
		locationDTO = locationDAO.getdetail(locationDTO);
		request.setAttribute("dto", locationDTO);
		
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/locations/detail.jsp");
		return actionForward;
		
	}
	
	public void add(HttpServletRequest request, ActionForward actionForward) throws Exception{
		LocationDTO locationDTO = new LocationDTO();
		locationDTO.setStreetAddress(request.getParameter("street_address"));
		locationDTO.setPostalCode(request.getParameter("postal_code"));
		locationDTO.setCity(request.getParameter("city"));
		locationDTO.setStateProvince(request.getParameter("state_province"));
		locationDTO.setCountryId(request.getParameter("country_id"));
		int result = locationDAO.add(locationDTO);
		String str = "부서 등록 실패";
		if(result > 0) {
			str = "부서 등록 성공";
		}
		request.setAttribute("result", str); //
		
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/commons/result.jsp");
	}
	public void update(HttpServletRequest request, ActionForward actionForward) throws Exception{
		LocationDTO locationDTO = new LocationDTO();
		locationDTO.setLocationId(Integer.parseInt(request.getParameter("location_id")));
		locationDTO = locationDAO.getdetail(locationDTO);
		request.setAttribute("dto", locationDTO);
		
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/locations/update.jsp");
}
	
	
	public void updateProcess(HttpServletRequest request, ActionForward actionForward) throws Exception{
		String id = request.getParameter("location_id");
		String street = request.getParameter("street_address");
		String postal = request.getParameter("postal_code");
		String city = request.getParameter("city");
		String state = request.getParameter("stateProvince");
		String country = request.getParameter("country_id");

		LocationDTO locationDTO = new LocationDTO();
		locationDTO.setLocationId(Integer.parseInt(id));
		locationDTO.setStreetAddress(street);
		locationDTO.setPostalCode(postal);
		locationDTO.setCity(city);
		locationDTO.setStateProvince(state);
		locationDTO.setCountryId(country);

		int result = locationDAO.update(locationDTO);
		 
			String str = "부서 수정 실패";
			if(result > 0) {
				str = "부서 수정 성공";
			}
			request.setAttribute("result", str); //
			
			actionForward.setFlag(true);
			actionForward.setPath("/WEB-INF/views/commons/result.jsp");
	}
	
	public void delete(HttpServletRequest request, ActionForward actionForward) throws Exception{
		
		LocationDTO locationDTO = new LocationDTO();
		locationDTO.setLocationId(Integer.parseInt(request.getParameter("location_id")));
		int result = locationDAO.delete(locationDTO);
		
		String str = "부서 삭제 실패";
		if(result > 0) {
			str = "부서 삭제 성공";
		}
		request.setAttribute("result", str); //
		
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/commons/result.jsp");
	
	}
}
