package com.pas.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		request.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		
		//接收用户名
		String u=request.getParameter("username");
		
		//放入Request域对象
		request.setAttribute("username", u);
		//使用转发的方法把Request 与 response对象传给下一个Servlet
		request.getRequestDispatcher("/Servlet2")
		.forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
