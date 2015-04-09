package com.pas.domain;

import java.io.Serializable;

//hibernate domain对象需要序列化
public class Users  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	private String username;
	private String password;
	private String email;
	private Integer grade; 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getId() {
		return id;
	}
}
