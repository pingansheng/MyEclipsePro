package com.pas.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

//Ĭ�Ͽ��Բ�д Ϊsturts-default
@ParentPackage("struts-default")
@Action(value="login",results={@Result(name="success",location="/res.jsp"),
								@Result(name="input",location="/login.jsp"),
								@Result(name="err",location="/loginTag.jsp")})
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
			this.addFieldError("userid", "�û������������");
			return "err";
		}
		return "success";
	}
	@Override
	public void validate() {
		if(null==this.getUserid()||"".equals(this.getUserid().trim()))
		{
			this.addFieldError("userid", "�û�������Ϊ��");
		}
		if(null==this.getPassword()||"".equals(this.getPassword().trim()))
		{
			this.addFieldError("password", "���벻��Ϊ��");
		}
		super.validate();
	}
	
	
}
