package com.pas.service;

import com.pas.inter.TestServiceInter;
import com.pas.inter.TestServiceInter2;

public class TestService1 implements TestServiceInter,TestServiceInter2{

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		System.out.println("Hello£ºTestService1");
	}

	@Override
	public void sayBye() {
		System.out.println("bye:"+name);
		int i=9/0;
	}

	@Override
	public void sayHi() {
		System.out.println("hi");
	}
	
}
