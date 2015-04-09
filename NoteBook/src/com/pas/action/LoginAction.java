package com.pas.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pas.domain.User;
import com.pas.service.impl.UserServiceImpl;
import com.pas.service.inter.UserServiceInter;
import com.pas.util.MyTools;

public class LoginAction extends ActionSupport {

	private String userid;
	private String password;
	private String toactionname;

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

	public String getToactionname() {
		return toactionname;
	}

	public void setToactionname(String toactionname) {
		this.toactionname = toactionname;
	}

	/**
	 * @return
	 */
	public String execute() {

		// 使用Service接口完成验证
		UserServiceInter userServiceInter=new UserServiceImpl();
	
		User user = new User();
		user.setUserid(Integer.parseInt(getUserid()));
		user.setPassword(getPassword());
		user = userServiceInter.checkUser(user);
		if (user != null) {
			ActionContext.getContext().getSession().put("userinfo", user);
			this.setToactionname("msglist");
			return SUCCESS;
		}
		return LOGIN;
	}
}