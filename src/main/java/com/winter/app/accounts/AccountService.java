package com.winter.app.accounts;

import javax.servlet.http.HttpServletRequest;

import com.winter.app.ActionForward;

public class AccountService {
	
	private AccountDAO accountDAO;
	
	public AccountService() {
		accountDAO = new AccountDAO();
		
	}
	
	
	
	public void add(HttpServletRequest request, ActionForward actionForward) throws Exception{
		
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setUsername(request.getParameter("username"));
		accountDTO.setProductnum(Integer.parseInt(request.getParameter("productnum")));
		
		accountDTO.setAccountbalance(0);
		
		
		int result = accountDAO.add(accountDTO);
		String str = "상품 등록 실패 ";
		
		if(result > 0) {
			str = "상품 등록 성공";
		}
		request.setAttribute("result", str);
		request.setAttribute("path", "./list.do");
		
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/commons/result.jsp");
		
	}

}
