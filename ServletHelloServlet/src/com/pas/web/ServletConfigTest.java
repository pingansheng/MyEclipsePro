package com.pas.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Environment;

public class ServletConfigTest extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding(this.getServletConfig().getInitParameter("encoding"));
		response.getWriter().println("ƒ„∫√ ¿ΩÁaaaa");
		
		Enumeration<String> en= this.getServletConfig().getInitParameterNames();
		String lineSeparator = System.getProperty("line.separator", "/n"); 
		while(en.hasMoreElements())
		{
			response.getWriter().println(en.nextElement()+lineSeparator);
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
