package com.winter.app.products;

import java.sql.Clob;
import java.util.List;
import java.util.function.DoublePredicate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.winter.app.ActionForward;
import com.winter.app.users.UserDTO;

public class ProductService {
	
	private ProductDAO productDAO;
	
	public ProductService() {

		productDAO = new ProductDAO();
		
		
	}
		
	
	
	public void updateB(HttpServletRequest request, ActionForward actionForward) throws Exception{
		
		
		ProductDTO productDTO = new ProductDTO();		
		String num = request.getParameter("productnum");
		productDTO.setProductnum(Integer.parseInt(num));
		productDTO = productDAO.getDetail(productDTO);
		request.setAttribute("dto", productDTO);
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/products/update.jsp");
		
		
	}
	
	
	
	
	public void update(HttpServletRequest request, ActionForward actionForward) throws Exception{
		
		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductname(request.getParameter("productname"));
		productDTO.setProductrate(Double.parseDouble(request.getParameter("productrate")));
		productDTO.setProductnum(Integer.parseInt(request.getParameter("productnum")));
		int result = productDAO.update(productDTO);
		
		String str = "상품 정보 수정 실패";
		if(result > 0) {
			str = "상품 정보 수정 성공";
		}
		request.setAttribute("result", str);
		request.setAttribute("path", "/products/detail.do?productnum="+request.getParameter("productnum"));
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/commons/result.jsp");
			
		
			
		}
	
	
	public ActionForward getDetail(HttpServletRequest request,ActionForward actionForward) throws Exception{
		
		String id = request.getParameter("productnum");
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductnum(Integer.parseInt(id));
		productDTO = productDAO.getDetail(productDTO);
		request.setAttribute("dto", productDTO);
		
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/products/detail.jsp");
		return actionForward;
		
		
		
	}
	
	
	
	
	
	
	
	
	public void add(HttpServletRequest request, ActionForward actionForward) throws Exception{
		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductname(request.getParameter("productname"));
		productDTO.setProductrate(Double.parseDouble(request.getParameter("productrate")));
		
		
		int result = productDAO.add(productDTO);
		String str = "상품 등록 실패";
		
		if(result > 0) {
			str = "상품 등록 성공";
		}
		request.setAttribute("result", str);
		request.setAttribute("path", "./list.do");
		
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/commons/result.jsp");
	}
	
	
	
	
	
	
	
	
	public ActionForward getList(HttpServletRequest request, ActionForward actionForward) throws Exception {
		
		List<ProductDTO> ar = productDAO.getList();
		request.setAttribute("list", ar);
		
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/products/list.jsp");
		return actionForward;
		
	}
	
	
	
	
	

}
