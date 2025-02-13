package com.winter.app.products;

import java.sql.Clob;
import java.sql.Date;

public class ProductDTO {
	
	private int productnum;
	private String productname;
	private double productrate;
	private Date productdate;
	private Clob productdetail;
	
	
	
	
	public int getProductnum() {
		return productnum;
	}
	public void setProductnum(int productnum) {
		this.productnum = productnum;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getProductrate() {
		return productrate;
	}
	public void setProductrate(double productrate) {
		this.productrate = productrate;
	}
	public Date getProductdate() {
		return productdate;
	}
	public void setProductdate(Date productdate) {
		this.productdate = productdate;
	}
	public Clob getProductdetail() {
		return productdetail;
	}
	public void setProductdetail(Clob productdetail) {
		this.productdetail = productdetail;
	}

	
	
	

}
