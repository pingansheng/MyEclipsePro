package com.pas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pas.util.MyTools;

public class GetInfo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		//设置接收编码格式 保证接收到不是乱码
		request.setCharacterEncoding("utf-8");
		//Mytool 用于Get方式乱码处理
		String u=MyTools.getNewString(request.getParameter("username"));
		System.out.println(u);
		//传递给下一页面
		//java.net.URLEncoder.encode用于IE6版本及其以下浏览器
		response.sendRedirect("/Encoding/Wel?yy="+java.net.URLEncoder.encode(u,"utf-8"));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
