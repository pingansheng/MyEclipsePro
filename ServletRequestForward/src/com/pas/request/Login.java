package com.pas.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		//����һ������

		//action����д /webӦ��/Servleturl
		out.println("<form action='/RequestForward/Servlet1' method='post'>");
		out.println("<div style='text-align:center'>");
		out.println("<h1>�û���¼</h1>");
		out.println("�û�����<input style='width:100px' type='text' name='username' /></br>");
		out.println("��&nbsp;&nbsp;�룺<input style='width:100px' type='password' name='password' /></br>");
		out.println("<input type='submit' value='��¼' /></br>");
		out.println("</div>");
		out.println("</form>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
