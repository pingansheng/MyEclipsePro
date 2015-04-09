package com.pas.domain;

import java.io.Serializable;
import java.util.Set;

public class Department implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	//����һ�����϶�Ӧ���ѧ�� һ�Զ�
	private Set<Employee> employeelist;
	
	
	public Set<Employee> getEmployeelist() {
		return employeelist;
	}
	public void setEmployeelist(Set<Employee> employeelist) {
		this.employeelist = employeelist;
	}
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
	
}
