package com.pas.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseCacheTest extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		
		nocache(response);
		
		
		//PrintWriter 和 OutputStream不可同时使用
//		PrintWriter out = response.getWriter();
		
		//out.println("Hello "+new java.util.Date().toString());
		OutputStream os =response.getOutputStream();
		
		byte[] hello="Hello World".getBytes();
//		for(int i=0;i<hello.length;i++)
//		{
//			out.print(hello[i]);
//		}
		
		os.write(hello);
	}

	private void nocache(HttpServletResponse response) {
		//不缓存
		//IE
		response.setDateHeader("Expires", -1);
		//firefox
		response.setHeader("Cache-Control", "no-cache");
		//其他
		response.setHeader("Pragma", "no-cache");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
