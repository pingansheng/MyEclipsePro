package com.pas.test;

import com.pas.util.HibernateSessionFactory;
import com.pas.util.MyTools;

public class TestMian {
	
	public static void main(String[] args) {
//		HibernateSessionFactory.getSession();
		System.out.println(MyTools.MD5("123"));
	}
}
