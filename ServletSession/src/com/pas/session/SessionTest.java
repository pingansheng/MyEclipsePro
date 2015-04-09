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
		
		// 设置周期时间 秒 默认30分钟
		/*
		 * 一个地方是：tomcat/conf/web.xml <session-config>
		 * <session-timeout>30</session-timeout> </session-config> 对所有的web应用生效。
		 * 第二个地方是：在单个web应用下的web.xml文件下添加或修改ession-config <session-config>
		 * <session-timeout>10</session-timeout> </session-config> 只对本web应用生效
		 * 如果两个配置文件冲突，就以单个web应用的配置为准。
		 */
		sss.setMaxInactiveInterval(3600);
		sss.removeAttribute("uname");
		//remove后输出null
		//输出uname=true,pas=pas 
	
		out.println("uname=" + (sss.getAttribute("uname")==null) + ",pas="
			+ sss.getAttribute("pas"));
		
		//终结所有Session对象
		sss.invalidate();
		//用户权限判断
		HttpSession s=request.getSession(true);
		if(s.isNew())
		{
			out.println("非法登录");
		}
		out.flush();
		out.close();
	}

}
