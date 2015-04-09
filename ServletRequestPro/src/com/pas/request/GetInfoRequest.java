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
		
		out.println("����URL:"+request.getRequestURL().toString());
		out.println("</br>");
		out.println("����URI:"+request.getRequestURI().toString());
		out.println("</br>");
		out.println("QueryString:"+request.getQueryString());
		out.println("</br>");
		out.println("�ͻ��˵�ַ:"+request.getRemoteAddr());
		out.println("</br>");
		//����û����dns��ע�ᣬ�򷵻�ip,���򷵻ػ�����
		out.println("������:"+request.getRemoteHost());
		out.println("</br>");
		out.println("Զ�̶˿�:"+request.getRemotePort());
		out.println("</br>");
		out.println("�������˿�:"+request.getLocalPort());
		out.println("</br>");
		out.println("������IP:"+request.getLocalAddr());
		out.println("</br>");
		out.println("��������:"+request.getLocalName());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
