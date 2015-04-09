package com.pas.domain;

import java.io.Serializable;

public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Department dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
}
