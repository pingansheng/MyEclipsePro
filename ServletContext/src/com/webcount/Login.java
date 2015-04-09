package com.webcount;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.println("<form action='/ServletContext/Logincl' method='post'>");

		out.println("<table style='width:100%;text-align:center'>");
		out.println("<tr>");
		out.println("<td style='width:50%;text-align:center'>");
		out.println("</td>");
		out.println("<td style='width:50%;text-align:center'>");
		out.println("<div style='text-align:center'>");
		out.println("<h1>用户登录</h1>");
		out.println("用户ID：<input style='width:100px' type='text'  name='userid' /></br>");
		out.println("密&nbsp;&nbsp;码：<input style='width:100px' type='password' name='password' /></br>");
		out.println("<input type='submit' value='登录' /></br>");
		out.println("</div>");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.flush();
		out.close();
	}

}
