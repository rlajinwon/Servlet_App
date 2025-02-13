package com.winter.app.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.winter.app.ActionForward;
import com.winter.app.utils.DBConnection;

public class UserService {

	private UserDAO userDAO;
	
	public UserService() {
		
		userDAO = new UserDAO();
	
	}
	
	public void update(HttpServletRequest request, ActionForward actionForward)throws Exception{
		
		UserDTO session = (UserDTO)request.getSession().getAttribute("user");
		UserDTO userDTO = new UserDTO();
		
		userDTO.setName(request.getParameter("name"));
		userDTO.setPhone(request.getParameter("phone"));
		userDTO.setEmail(request.getParameter("email"));
		userDTO.setPassword(request.getParameter("password"));
		userDTO.setUsername(session.getUsername());
		
		int result = userDAO.update(userDTO);
		
		if(result>0) {
			session.setName(userDTO.getName());
		}
		actionForward.setFlag(false);
		actionForward.setPath("./mypage.do");
		
		
	}
	
	
	
	
	
	
	
	
	
	public void detail(HttpServletRequest request, ActionForward actionForward) throws Exception{
		
		UserDTO userDTO = (UserDTO)request.getSession().getAttribute("user");
		
		UserDTO result = userDAO.detail(userDTO);
		request.setAttribute("user1", result);
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
		actionForward.setPath("../index.do");
	}
	

	
	public void login(HttpServletRequest request, ActionForward actionForward) throws Exception{
		
	UserDTO userDTO = new UserDTO();
	userDTO.setUsername(request.getParameter("username"));
	userDTO.setPassword(request.getParameter("password"));
	userDTO = userDAO.login(userDTO);
	
	if(userDTO != null) {
		// 로그인 성공
		HttpSession session = request.getSession();
		
		session.setAttribute("user", userDTO);
		
		actionForward.setFlag(false);
		actionForward.setPath("../index.do");
		
		
	}else {
		request.setAttribute("result", "로그인 실패");
		request.setAttribute("path", "./login.do");
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/commons/result.jsp");
		
		
	}

		
	}
	
	
	
}
