package com.pas.backingbean;

public class UserBean {
	private String username;
	private String password;
	private String message;

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String checkUser() {
		if ("hello".equals(username) && "word".equals(password)) {
			return "success";
		}

		this.setMessage("username or password err!");
		return "failure";
	}
}
