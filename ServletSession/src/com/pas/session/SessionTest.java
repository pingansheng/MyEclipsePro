package com.pas.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTest extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();

		HttpSession sss = request.getSession();
		sss.setAttribute("uname", "uname");
		sss.setAttribute("pas", "pas");
		
		// ��������ʱ�� �� Ĭ��30����
		/*
		 * һ���ط��ǣ�tomcat/conf/web.xml <session-config>
		 * <session-timeout>30</session-timeout> </session-config> �����е�webӦ����Ч��
		 * �ڶ����ط��ǣ��ڵ���webӦ���µ�web.xml�ļ�����ӻ��޸�ession-config <session-config>
		 * <session-timeout>10</session-timeout> </session-config> ֻ�Ա�webӦ����Ч
		 * ������������ļ���ͻ�����Ե���webӦ�õ�����Ϊ׼��
		 */
		sss.setMaxInactiveInterval(3600);
		sss.removeAttribute("uname");
		//remove�����null
		//���uname=true,pas=pas 
	
		out.println("uname=" + (sss.getAttribute("uname")==null) + ",pas="
			+ sss.getAttribute("pas"));
		
		//�ս�����Session����
		sss.invalidate();
		//�û�Ȩ���ж�
		HttpSession s=request.getSession(true);
		if(s.isNew())
		{
			out.println("�Ƿ���¼");
		}
		out.flush();
		out.close();
	}

}
