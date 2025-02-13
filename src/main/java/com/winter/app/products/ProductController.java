package com.winter.app.products;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.winter.app.ActionForward;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductService productService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        productService = new ProductService();
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
		
		if(uri.equals("list.do")) {
		
			productService.getList(request, actionForward);
			
		}else if(uri.equals("add.do")) {
			String method = request.getMethod();
			if(method.toUpperCase().equals("POST")) {
				productService.add(request, actionForward);
			}else {
				actionForward.setFlag(true);
				actionForward.setPath("/WEB-INF/views/products/add.jsp");
			}
			
			
		}else if(uri.equals("detail.do")) {
			
			productService.getDetail(request, actionForward);
			
		}else if(uri.equals("update.do")) {
			String m = request.getMethod();
			if(m.toUpperCase().equals("POST")) {
				actionForward.setFlag(false);
				actionForward.setPath("./detail.do");
				
			}else {
				productService.update(request, actionForward);
			}
		}
				
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(actionForward.getPath());
		 dispatcher.forward(request, response); 
		
		
		
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
