package com.pas.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pas.exception.PasswordException;
import com.pas.exception.UserNameException;

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
			//自定义异常
			throw new UserNameException("用户名错误");
			//this.addFieldError("userid", "用户名或密码错误！");
			//return "err";
		} 
		else if(!"123".equals(this.getPassword()))
		{
			//自定义异常
			throw new PasswordException("密码错误");
		}
		else
		{
			return SUCCESS;
		}
		
	}
//	@Override
//	public void validate() {
//		if(null==this.getUserid()||"".equals(this.getUserid().trim()))
//		{
//			this.addFieldError("userid", "用户名不可为空");
//		}
//		if(null==this.getPassword()||"".equals(this.getPassword().trim()))
//		{
//			this.addFieldError("password", "密码不可为空");
//		}
//		super.validate();
//	}
	
	
}
