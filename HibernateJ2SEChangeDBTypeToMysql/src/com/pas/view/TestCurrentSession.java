package com.pas.view;

import org.hibernate.classic.Session;

import com.pas.util.MySessionFactory;

/**
 * 测试自定义的currentsession
 * @author pingansheng
 *
 */
public class TestCurrentSession {

	public static void main(String[] args) {
		Session session1=MySessionFactory.getCurrentSession();
		Session session2=MySessionFactory.getCurrentSession();
		
		Session session3=MySessionFactory.openSession();
		
		System.out.println(session1.hashCode()+" ");
		System.out.println(session2.hashCode()+" ");
		System.out.println(session3.hashCode());
	}

}
