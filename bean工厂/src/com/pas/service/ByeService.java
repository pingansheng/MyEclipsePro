package com.pas.service;

public class ByeService {
	
	private String name;

	public ByeService()
	{
		System.out.println("Bye��������"+this.hashCode());
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayBye()
	{
		System.out.println("Bye��"+name);
	}
}
