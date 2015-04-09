package com.pas.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//һ����ֻ֤��һ���Ự����
public final class MySessionFactory {

	private static SessionFactory sessionFactory = null;

	private MySessionFactory() {

	}

	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
