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
import javax.servlet.http.HttpSession;

public class MyFilter extends HttpServlet implements Filter {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();

		out.flush();
		out.close();
	}


	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		
		//查看请求资源
		String url=req.getRequestURI();
		  if (url.startsWith("/UserManager/CreateCode") || url.startsWith("/UserManager/Login") || url.startsWith("/UserManager/imgs")) {
            //放行
            chain.doFilter(request, response);
        } else {
//            HttpSession session = hsr.getSession();
//            Users u = (Users) session.getAttribute("u");
//            if (u != null) {
//                chain.doFilter(request, response);
//            } else {
//                request.setAttribute("err", "请登录");
//                request.getRequestDispatcher("/Login").forward(request, response);                
//            }
        }
		
		
	}


	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
