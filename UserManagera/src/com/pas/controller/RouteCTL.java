package com.pas.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RouteCTL extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String method=request.getParameter("path");
		if(null==method)
		{
			response.sendRedirect("/UserManager/");
			return;
		}
		if("main".equals(method))
		{
			request.getRequestDispatcher("/WEB-INF/jsp/MainFrame.jsp").forward(request, response);
		}else if("user".equals(method))
		{
			request.getRequestDispatcher("/ManageUserCTL").forward(request, response);
		}
	}

}
