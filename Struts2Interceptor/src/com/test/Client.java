package com.test;

public class Client {

	public static void main(String[] args)
	{
		Target t=new Target();
		
		MyProxy myproxy=new MyProxy();
		
		TargetInterface proxy =(TargetInterface)myproxy.getProxy(t);
		
		proxy.dosth1();
	}
}
