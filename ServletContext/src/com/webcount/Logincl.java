package com.webcount;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logincl extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		
		String pass=request.getParameter("password");
		if("123".equals(pass))
		{
			int num=Integer.parseInt(this.getServletContext().getAttribute("num").toString());
			this.getServletContext().setAttribute("num", num+1);
			response.sendRedirect("/ServletContext/mana");
//			request.getRequestDispatcher("/mana").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("/Login").forward(request, response);
		}
	}

}
