package com.pas.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pas.util.HibernateSessionFactory;

public class MyFilter implements Filter {

	public void destroy() {

	}

	/**
	 * �˴����ù��������ֽ������������
	 */
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		Session session = null;
		Transaction tran = null;
		try {
			session = HibernateSessionFactory.getSession();
			tran = session.beginTransaction();
			// ������������
			arg2.doFilter(arg0, arg1);
			// �������
			System.out.println("���󷵻�");
			tran.commit();
		} catch (Exception e) {
			if (tran != null) {
				tran.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
