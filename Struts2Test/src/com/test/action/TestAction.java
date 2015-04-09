package com.test.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public String execute()
	{
		this.setType("test");
		return SUCCESS;
	}
}
