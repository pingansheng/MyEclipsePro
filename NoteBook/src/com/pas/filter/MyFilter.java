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
	 * 此处利用过滤器部分解决懒加载问题
	 */
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		Session session = null;
		Transaction tran = null;
		try {
			session = HibernateSessionFactory.getSession();
			tran = session.beginTransaction();
			// 继续发送请求
			arg2.doFilter(arg0, arg1);
			// 请求结束
			System.out.println("请求返回");
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
