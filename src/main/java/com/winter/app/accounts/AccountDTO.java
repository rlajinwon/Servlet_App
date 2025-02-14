package com.winter.app.accounts;

import java.sql.Date;

public class AccountDTO {
	
	private int accountnum;
	private String username;
	private int productnum;
	private int accountbalance;
	private Date accountdate;
	
	
	
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getProductnum() {
		return productnum;
	}
	public void setProductnum(int productnum) {
		this.productnum = productnum;
	}
	public int getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}
	public Date getAccountdate() {
		return accountdate;
	}
	public void setAccountdate(Date accountdate) {
		this.accountdate = accountdate;
	}
	
	
	
	
	

}
