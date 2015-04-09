package com.pas.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.pas.domain.Point;

public class PointAction extends ActionSupport {

	private Point p;
	private int age;
	private String username;
	private Date date;
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String execute() throws Exception {

		
		return SUCCESS;
	}
	
	
}
