package com.pas.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.awt.RepaintArea;

public class Hello extends HttpServlet {

	//������Ҫ���� �����doXX��������
	int i=2;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		
		synchronized (this) {
			if(i>0)
			{
				out.println("��Ʊ"+i);
				
				try {
					Thread.sleep(10*1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				i--;
			}
			else
			{
				out.println("û��Ʊ");
			}
		}
		
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		//һ�㿪����Աϰ��get post��һ
		this.doGet(request, response);
	}

}
