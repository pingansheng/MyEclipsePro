package com.pas.request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetRequestHeader extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		
		//��ȡ�����header��Ϣ
		out.println(request.getHeader("Host"));
		
		out.println("</br>");
		out.println("************Head��Ϣ************");
		out.println("</br>");
		//getHeaderNames(��ӡ����http������Ϣ)
		Enumeration<?> headers= request.getHeaderNames();
		String head="";
		
		while(headers.hasMoreElements())
		{
			head=headers.nextElement().toString();
			out.println(head+":"+request.getHeader(head));
			out.println("</br>");
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
