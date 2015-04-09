package com.pas.cart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowBooks extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.println("<h1>»¶Ó­¹ºÂò</h1>");
		HttpSession ss=request.getSession();
		
		String url=response.encodeURL("/Session/BuyBookCTL?id=1&name=java");
		out.println("Java<a href='"+url+"'>µã»÷¹ºÂò</a></br>");
		out.println("Oracle<a href='/Session/BuyBookCTL?id=2&name=oracle'>µã»÷¹ºÂò</a></br>");
		out.println("C++<a href='/Session/BuyBookCTL?id=3&name=cpp'>µã»÷¹ºÂò</a></br>");
		out.flush();
		out.close();
	}

}
