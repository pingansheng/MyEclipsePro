package com.pas.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		request.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		
		String u=request.getParameter("username");
		String p=request.getParameter("pwd");
		String sex=request.getParameter("sex").equals("1")? "男":"女";
		String[] likes= request.getParameterValues("like");
		if (null == likes) {
			likes = new String[] { "没有喜欢的" };
		}

		String city=request.getParameter("city");
		String intro=request.getParameter("intro");
		String file=request.getParameter("photo");
		String hid=request.getParameter("hidden1");
		
		out.println("用户名："+u);
		out.println("</br>");
		
		out.println("密　码："+p);
		out.println("</br>");
		
		out.println("性　别："+sex);
		out.println("</br>");
		
		out.println("喜欢的水果：");
		for (String string : likes) {
			out.println(string+" ");
		}
		out.println("</br>");
		
		out.println("所在城市："+city);
		out.println("</br>");
		out.println("个人介绍："+intro);
		out.println("</br>");
		out.println("文件："+file);
		out.println("</br>隐藏信息："+hid);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
