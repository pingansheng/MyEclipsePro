package com.pas.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetInfoRequest extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		
		out.println("完整URL:"+request.getRequestURL().toString());
		out.println("</br>");
		out.println("部分URI:"+request.getRequestURI().toString());
		out.println("</br>");
		out.println("QueryString:"+request.getQueryString());
		out.println("</br>");
		out.println("客户端地址:"+request.getRemoteAddr());
		out.println("</br>");
		//请求方没有在dns上注册，则返回ip,否则返回机器名
		out.println("主机名:"+request.getRemoteHost());
		out.println("</br>");
		out.println("远程端口:"+request.getRemotePort());
		out.println("</br>");
		out.println("服务器端口:"+request.getLocalPort());
		out.println("</br>");
		out.println("服务器IP:"+request.getLocalAddr());
		out.println("</br>");
		out.println("服务器名:"+request.getLocalName());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
