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
		//��֤
		if(!"123".equals(this.getUserid()))
		{
			//�Զ����쳣
			throw new UserNameException("�û�������");
			//this.addFieldError("userid", "�û������������");
			//return "err";
		} 
		else if(!"123".equals(this.getPassword()))
		{
			//�Զ����쳣
			throw new PasswordException("�������");
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
//			this.addFieldError("userid", "�û�������Ϊ��");
//		}
//		if(null==this.getPassword()||"".equals(this.getPassword().trim()))
//		{
//			this.addFieldError("password", "���벻��Ϊ��");
//		}
//		super.validate();
//	}
	
	
}
