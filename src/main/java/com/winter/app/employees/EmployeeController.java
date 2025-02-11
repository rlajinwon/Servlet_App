package com.winter.app.employees;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.winter.app.ActionForward;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private EmployeeService employeeService;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        employeeService = new EmployeeService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/")+1);
		String path = "";
		ActionForward actionForward = new ActionForward();
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/errors/notfound.jsp");
		
		try {
		
		if(uri.equals("join.do")) {
			String method = request.getMethod();
			
			if(method.toUpperCase().equals("POST")) {
				employeeService.join(request, actionForward);
				
			}else {
				actionForward.setFlag(true);
				actionForward.setPath("/WEB-INF/views/employees/join.jsp");
			}
		}else if(uri.equals("login.do")){
			String method = request.getMethod();
			
			if(method.toUpperCase().equals("POST")) {
				employeeService.login(request, actionForward);
			}else {
				actionForward.setFlag(true);
				actionForward.setPath("/WEB-INF/views/employees/login.jsp");
			}
			
		}
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
		
	if(actionForward.isFlag()) {	
		
		
	RequestDispatcher view = request.getRequestDispatcher(actionForward.getPath()); //jsp 절대경로
	view.forward(request, response);	//응답방식이 forward일때 사용
	}
	else {
		//redirect
		response.sendRedirect(actionForward.getPath()); //주소 가져오기
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
