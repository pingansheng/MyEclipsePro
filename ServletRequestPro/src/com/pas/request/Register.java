package com.pas.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		request.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		
		String u=request.getParameter("username");
		String p=request.getParameter("pwd");
		String sex=request.getParameter("sex").equals("1")? "��":"Ů";
		String[] likes= request.getParameterValues("like");
		if (null == likes) {
			likes = new String[] { "û��ϲ����" };
		}

		String city=request.getParameter("city");
		String intro=request.getParameter("intro");
		String file=request.getParameter("photo");
		String hid=request.getParameter("hidden1");
		
		out.println("�û�����"+u);
		out.println("</br>");
		
		out.println("�ܡ��룺"+p);
		out.println("</br>");
		
		out.println("�ԡ���"+sex);
		out.println("</br>");
		
		out.println("ϲ����ˮ����");
		for (String string : likes) {
			out.println(string+" ");
		}
		out.println("</br>");
		
		out.println("���ڳ��У�"+city);
		out.println("</br>");
		out.println("���˽��ܣ�"+intro);
		out.println("</br>");
		out.println("�ļ���"+file);
		out.println("</br>������Ϣ��"+hid);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
