package com.winter.app.users;

import javax.servlet.http.HttpServletRequest;

import com.winter.app.ActionForward;

public class UserService {

	private UserDAO userDAO;
	
	public UserService() {
		
		userDAO = new UserDAO();
	
	}
	
	
	public void join(HttpServletRequest request, ActionForward actionForward) throws Exception{
		
		UserDTO userDTO = new UserDTO();
		userDTO.setUsername(request.getParameter("username"));
		userDTO.setPassword(request.getParameter("password"));
		userDTO.setName(request.getParameter("name"));
		userDTO.setPhone(request.getParameter("phone"));
		userDTO.setEmail(request.getParameter("email"));
		
		int result = userDAO.join(userDTO);
		
		
		actionForward.setFlag(false);
		actionForward.setPath("/index.do");
	}
	
	
	
}
