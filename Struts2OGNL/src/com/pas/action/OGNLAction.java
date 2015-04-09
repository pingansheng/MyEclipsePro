package com.pas.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

public class OGNLAction extends ActionSupport {
	
	private User user=new User();
	private String username;
	private String password;
	public static String SVAR="这是静态变量";
	
	private List<User> users=new ArrayList<User>();
	private Set<User> dogs=new HashSet<User>();
	private Map<String,User> cats=new HashMap<String,User>();
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	
	public String execute()
	{
		username="普通属性pingansheng";
		password="普通属性password";
		user.setUsername("对象属性pingansheng");
		user.setPassword("对象属性password");
		
		users.add(new User(1));
		users.add(new User(2));
		users.add(new User(3));

		dogs.add(new User("dog1"));
		dogs.add(new User("dog2"));
		dogs.add(new User("dog3"));
		
		cats.put("cat1", new User("cat1"));
		cats.put("cat2", new User("cat2"));
		cats.put("cat3", new User("cat3"));
		return SUCCESS;
	
	}
	
	public static String getSVAR() {
		return SVAR;
	}
	public static void setSVAR(String sVAR) {
		SVAR = sVAR;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public Set<User> getDogs() {
		return dogs;
	}
	public void setDogs(Set<User> dogs) {
		this.dogs = dogs;
	}
	public Map<String, User> getCats() {
		return cats;
	}
	public void setCats(Map<String, User> cats) {
		this.cats = cats;
	}
	public String check()
	{
		return "这是Action中的普通方法";
	}
	
	public static String s()
	{
		return "这是一个静态方法";
	}
}
