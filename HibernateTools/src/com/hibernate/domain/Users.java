package com.hibernate.domain;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String passwd;
	private String email;
	private Integer grade;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(Integer grade) {
		this.grade = grade;
	}

	/** full constructor */
	public Users(String username, String passwd, String email, Integer grade) {
		this.username = username;
		this.passwd = passwd;
		this.email = email;
		this.grade = grade;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGrade() {
		return this.grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

}