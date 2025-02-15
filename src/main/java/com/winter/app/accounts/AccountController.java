package com.winter.app.accounts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.winter.app.ActionForward;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/AccountController")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountService accountService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountController() {
        super();
        accountService = new AccountService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String uri = request.getRequestURI();
		
		uri = uri.substring(uri.lastIndexOf("/")+1);
		
		String path = "";
		ActionForward actionForward = new ActionForward();
		
		
		try {
		
			
			if(uri.equals("add.do")) {
				accountService.add(request, actionForward);
		
			}else if(uri.equals("list.do")) {
				accountService.getList(request, actionForward);
				
			}
			
			
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(actionForward.getPath());
		 dispatcher.forward(request, response); 
		}
		
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
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
