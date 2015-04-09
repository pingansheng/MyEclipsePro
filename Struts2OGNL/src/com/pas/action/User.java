package com.pas.action;

public class User {
	
	private String username;
	private String password;
	private int age;
	
	public User()
	{
	}
	
	public User(int i)
	{
		this.age=i;
	}
	public User(String name)
	{
		this.username=name;
	}
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
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNameLength()
	{
		return username+"的长度为"+username.length();
	}
	
}
