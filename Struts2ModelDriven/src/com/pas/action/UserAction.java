package com.pas.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pas.model.User;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	private User user=new User();
	public User getModel() {
		return user;
	}	
	
	public String execute()
	{
		return SUCCESS;
	}
}
