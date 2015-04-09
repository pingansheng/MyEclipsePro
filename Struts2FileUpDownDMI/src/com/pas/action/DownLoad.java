package com.pas.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownLoad extends ActionSupport {
	
	private String filename;
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public InputStream getFile()
	{
		filename="aaa.txt";
		return ServletActionContext.getServletContext()
				.getResourceAsStream("/upload/abc.txt");
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public String abc()
	{
		return SUCCESS;
	}
}
