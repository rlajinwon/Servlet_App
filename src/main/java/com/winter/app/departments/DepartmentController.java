package com.winter.app.departments;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DepartmentController
 */
@WebServlet("/DepartmentController")
public class DepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /*
     * 서버 요청시 :
     * 1. URL(ip:port/경로)
     * 2. 메서드 형식
     *		1) GET
     *			*단순 요청시
     *			*파라미터가 주소창에 노출(파라미터가 Header에 담김)
     *			*작은 용량을 보낼 때 사용
     *		2) POST 
     *			*보안이 요구되는 요청시 
     *			*파라미터가 주소창에 노출되지 않는다.(파라미터가 body에 담김)
     *			*큰 용량을 보낼 때 사용 
     *
     *		
     *
     *	3) 메서드 결정
     *		1)주소창에 URL을 사용자가 직접 입력 - GET 
     *		2)a 태그를 사용 				 - GET 
     *			
     * */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		
		
		
		try {
		String uri = request.getRequestURI();
		
				
		DepartmentDAO departmentDAO = new DepartmentDAO();
		String suburi = (uri.substring(uri.lastIndexOf("/")+1));
		
		
			if(suburi.equals("list.do")) {
				List<DepartmentDTO> ar = departmentDAO.getList();
				
				PrintWriter p = response.getWriter();
				p.println("<h1>departmentList</h1>");
				
				p.print("<Table border = 1");
				for(int i=0; i<ar.size(); i++) {
				p.println("<tr>");
				p.println("<td>"+ar.get(i).getDepartment_id()+"</td>");
				
				p.println("<td>"+ar.get(i).getDepartment_name()+"</td>");
				p.println("</tr>");
				}
				p.print("</Table>");
				p.close();
				
		
				
				
			}else if(suburi.equals("detail.do")) {
				departmentDAO.getDetail(null);
			}
		}catch (Exception e) {
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
