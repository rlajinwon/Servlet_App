package com.winter.app.locations;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.winter.app.ActionForward;

/**
 * Servlet implementation class LocationController
 */
@WebServlet("/LocationController")
public class LocationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LocationService locationService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocationController() {
        super();
        locationService = new LocationService();
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
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/errors/notfound.jsp");
		
		
		
		try {
		if(uri.equals("list.do")) {
			locationService.getList(request, actionForward);
			
			
			
		}else if(uri.equals("detail.do")) {
			locationService.getDetail(request, actionForward);
			
		}else if(uri.equals("add.do")) {
			String method = request.getMethod();
			if(method.toUpperCase().equals("POST")) {
				locationService.add(request, actionForward);
			}else {
				actionForward.setFlag(true);
				actionForward.setPath("/WEB-INF/views/locations/add.jsp");
			}
		}else if(uri.equals("update.do")) {
			String m = request.getMethod();
			if(m.toUpperCase().equals("POST")) {
				locationService.updateProcess(request, actionForward);
				
			}else {
				locationService.update(request, actionForward);
			
			}
			
			
		}else if(uri.equals("delete.do")) {
			locationService.delete(request, actionForward);
		}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		
		}
		RequestDispatcher view = request.getRequestDispatcher(actionForward.getPath()); //jsp 절대경로
		
		
		view.forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
