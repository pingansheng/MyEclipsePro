package com.pas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pas.util.MyTools;

public class GetInfo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		//���ý��ձ����ʽ ��֤���յ���������
		request.setCharacterEncoding("utf-8");
		//Mytool ����Get��ʽ���봦��
		String u=MyTools.getNewString(request.getParameter("username"));
		System.out.println(u);
		//���ݸ���һҳ��
		//java.net.URLEncoder.encode����IE6�汾�������������
		response.sendRedirect("/Encoding/Wel?yy="+java.net.URLEncoder.encode(u,"utf-8"));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
