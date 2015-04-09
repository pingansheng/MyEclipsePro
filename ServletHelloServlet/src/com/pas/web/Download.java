package com.pas.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Download extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		response.setHeader("Content-Disposition", "attachment;filename=807.rar");
		
		String path=this.getServletContext().getRealPath("/904.rar");
		FileInputStream fis=new FileInputStream(path);
		OutputStream os=response.getOutputStream();
		byte[] tem=new byte[1024];
		int len=0;
		while((len=fis.read(tem))>0)
		{
			os.write(tem, 0, len);
		}
		
		os.close();
		fis.close();

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
