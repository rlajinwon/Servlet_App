package com.winter.app.employees;

import java.util.Formatter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.winter.app.ActionForward;
import com.winter.app.departments.DepartmentDTO;


public class EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	public EmployeeService() {
		employeeDAO = new EmployeeDAO();
		
	}
	
	
	
	
	
	
	public void update(HttpServletRequest request,ActionForward actionForward) throws Exception{
		EmployeeDTO employeeDTO = new EmployeeDTO();
		EmployeeDTO seesion = (EmployeeDTO)request.getSession().getAttribute("user");
		employeeDTO.setLast_name(request.getParameter("last_name"));
		employeeDTO.setFirst_name(request.getParameter("first_name"));
		employeeDTO.setEmeployee_id(seesion.getEmeployee_id());
		int result = employeeDAO.update(employeeDTO);
		
		if(result > 0) {
			seesion.setFirst_name(employeeDTO.getFirst_name());
		}
		
		actionForward.setFlag(false);
		actionForward.setPath("./mypage.do");
		
		
		
		
		
		
		
	}
	
//	public void updateProcess(HttpServletRequest request, ActionForward actionForward) throws Exception{
//		
//		String id = request.getParameter("emeployee_id");
//		String ln = request.getParameter("last_name");
//		String fn = request.getParameter("first_name");
//		
//		EmployeeDTO employeeDTO = new EmployeeDTO();
//		employeeDTO.setEmeployee_id(Integer.parseInt(id));
//		employeeDTO.setLast_name(ln);
//		employeeDTO.setFirst_name(fn);
//		
//		int result = employeeDAO.update(employeeDTO);
//		
//		String str = "부서수정 실패";
//		
//		if(result > 0) {
//			str = "부서 수정 성공";
//		}
//		request.setAttribute("result", str);
//		request.setAttribute("path", "./list.do");
//		actionForward.setFlag(true);
//		actionForward.setPath("/WEB-INF/views/commons/result.jsp");
		
//	}
	
	
	
	
	
	
	
	
	public void detail(HttpServletRequest request, ActionForward actionForward) throws Exception{
		
		EmployeeDTO employeeDTO = (EmployeeDTO)request.getSession().getAttribute("user");
		
		EmployeeDTO result = employeeDAO.detail(employeeDTO);
		request.setAttribute("user", result);
		
	}
	
	
	
	
	
	
	
	public void login(HttpServletRequest request,ActionForward actionForward) throws Exception{
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmeployee_id(Integer.parseInt(request.getParameter("employee_id")));
		employeeDTO.setPassword(request.getParameter("password"));
		
		employeeDTO = employeeDAO.login(employeeDTO);
		
		if(employeeDTO != null) {
			// index
			HttpSession session = request.getSession();
		
			session.setAttribute("user", employeeDTO);
			actionForward.setFlag(false);
			actionForward.setPath("../index.do");
		}else {
			// 
			request.setAttribute("result", "로그인 실패");
			request.setAttribute("path", "./login.do");
			actionForward.setFlag(true);
			actionForward.setPath("/WEB-INF/views/commons/result.jsp");
			
		}
	}
	
	
	
	

	
	public void join(HttpServletRequest request, ActionForward actionForward) throws Exception{
		EmployeeDTO employeeDTO = new EmployeeDTO();
//		employeeDTO.setFirst_name(request.getParameter("first_name"));
//		employeeDTO.setLast_name(request.getParameter("last_name"));
//		employeeDTO.setEmail(request.getParameter("email"));
//		employeeDTO.setPhone_number(request.getParameter("phone_number"));
//		employeeDTO.setJob_id(request.getParameter("job_id"));
//		employeeDTO.setSalary(Integer.parseInt(request.getParameter("salary")));
//		employeeDTO.setCommission_pct(Integer.parseInt(request.getParameter("commission_pct")));
//		employeeDTO.setManager_id(Integer.parseInt(request.getParameter("manager_id")));
//		employeeDTO.setDepartment_id(Integer.parseInt(request.getParameter("department_id")));
//		employeeDTO.setPassword(request.getParameter("password"));
//		
//		
//		int result = employeeDAO.join(employeeDTO);
//		
		// /index.do
		actionForward.setFlag(false);
		actionForward.setPath("../index.do");
		
		
		
//		String str = "사원 등록 실패";
//		if(result > 0) {
//			str = "사원 등록 성공";
//		}
//		request.setAttribute("result", str); //
//		
//		actionForward.setFlag(true);
//		actionForward.setPath("/WEB-INF/views/commons/result.jsp");

}

}