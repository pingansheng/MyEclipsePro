package com.pas.exception;

public class UserNameException extends Exception{
	private String message;
	
	public UserNameException(String message)
	{
		super(message);
		this.message=message;
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
