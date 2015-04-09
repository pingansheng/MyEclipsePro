package com.pas.domain;

import java.util.Set;

public class User {
	
	private int userid;
	private String password;
	private String name;
	
	private Set<Message> sendMsgs;
	private Set<Message> receiveMsgs;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Message> getSendMsgs() {
		return sendMsgs;
	}
	public void setSendMsgs(Set<Message> sendMsgs) {
		this.sendMsgs = sendMsgs;
	}
	public Set<Message> getReceiveMsgs() {
		return receiveMsgs;
	}
	public void setReceiveMsgs(Set<Message> receiveMsgs) {
		this.receiveMsgs = receiveMsgs;
	}
	
	
}
