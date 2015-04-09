package com.pas.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KeyWordsFilter extends HttpServlet implements Filter {

	String[] keywords;
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		String name=arg0.getParameter("username");
		if(name!=null)
		{
			for (String key : keywords) {
				if(key.equals(name))
				{
					arg0.setAttribute("err", "<font color='red'>"+name+"</font>≤ª‘ –Ì");
					arg0.getRequestDispatcher("/WEB-INF/err.jsp").forward(arg0, arg1);
					return;
				}
			}
			arg2.doFilter(arg0, arg1);
		}
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		keywords=arg0.getInitParameter("keywords").split(";");
		
	}

}
