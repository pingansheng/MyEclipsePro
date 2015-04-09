package com.pas.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String userid;
	private String password;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute() throws Exception
	{
		//验证
		if(!"123".equals(this.getUserid()))
		{
			this.addFieldError("userid", "用户名或密码错误！");
			return "err";
		}
		return "success";
	}
	@Override
	public void validate() {
		if(null==this.getUserid()||"".equals(this.getUserid().trim()))
		{
			this.addFieldError("userid", "用户名不可为空");
		}
		if(null==this.getPassword()||"".equals(this.getPassword().trim()))
		{
			this.addFieldError("password", "密码不可为空");
		}
		super.validate();
	}
	
	
}
