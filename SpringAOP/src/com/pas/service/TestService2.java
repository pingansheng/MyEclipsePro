package com.pas.service;

import com.pas.inter.TestServiceInter;

public class TestService2 implements TestServiceInter {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		System.out.println("Hello£ºTestService2");
	}

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

}
