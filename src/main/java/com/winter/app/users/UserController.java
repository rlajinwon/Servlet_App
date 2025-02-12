package com.winter.app.users;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.winter.app.ActionForward;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private UserService userService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
       
        userService = new UserService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uri = request.getRequestURI();
		
		uri = uri.substring(uri.lastIndexOf("/")+1);
		String path="";
		ActionForward actionForward = new ActionForward();
		
		try {
		
		if(uri.equals("join.do")) {
			String method = request.getMethod();
			if(method.toUpperCase().equals("POST")) {
				userService.join(request, actionForward);
			}else {
				actionForward.setFlag(true);
				actionForward.setPath("WEB-INF/views/users/join.jsp");
			}
		}
		
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
