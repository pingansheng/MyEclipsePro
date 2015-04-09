package com.pas;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SContext extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		ServletContext sc=this.getServletContext();
		
		//添加对象
		sc.setAttribute("num", 1);
		out.println(sc.getAttribute("num"));
		
		//xml config中 init参数
		out.println(sc.getInitParameter("name"));
		
		//实现跳转 和request.getRequestDispatch一样
//		sc.getRequestDispatcher("/ContextTest").forward(request, response);
		
		//读取资源文件
		
		InputStream is=sc.getResourceAsStream("dbInfo.properties");	
		Properties pp=new Properties();
		pp.load(is);
		out.println(pp.getProperty("username"));
		pp.clear();
		is.close();
		
		//绝对路径
		//文件在src目录下 需要用类加载器
		out.println(sc.getRealPath("WEB-INF/web.xml")+"</br>");
		out.println(sc.getContextPath());
		
		HttpSession session=request.getSession();
		out.println("</br>protocol: " + request.getProtocol()); 
		out.println("</br>Scheme: " + request.getScheme()); 
		out.println("</br>Server Name: " + request.getServerName() ); 
		out.println("</br>Server Port: " + request.getServerPort()); 
		out.println("</br>rotocol: " + request.getProtocol()); 
		out.println("</br>Server Info: " + getServletConfig().getServletContext().getServerInfo()); 
		out.println("</br>Remote Addr: " + request.getRemoteAddr()); 
		out.println("</br>Remote Host: " + request.getRemoteHost()); 
		out.println("</br>Character Encoding: " + request.getCharacterEncoding()); 
		out.println("</br>Content Length: " + request.getContentLength()); 
		out.println("</br>Content Type: "+ request.getContentType()); 
		out.println("</br>Auth Type: " + request.getAuthType()); 
		out.println("</br>HTTP Method: " + request.getMethod()); 
		out.println("</br>path Info: " + request.getPathInfo()); 
		out.println("</br>path Trans: " + request.getPathTranslated()); 
		out.println("</br>Query String: " + request.getQueryString()); 
		out.println("</br>Remote User: " + request.getRemoteUser()); 
		out.println("</br>Session Id: " + request.getRequestedSessionId()); 
		out.println("</br>Request URI: " + request.getRequestURI()); 
		out.println("</br>Servlet Path: " + request.getServletPath()); 
		out.println("</br>Accept: " + request.getHeader("Accept")); 
		out.println("</br>Host: " + request.getHeader("Host")); 
		out.println("</br>Referer : " + request.getHeader("Referer")); 
		out.println("</br>Accept-Language : " + request.getHeader("Accept-Language")); 
		out.println("</br>Accept-Encoding : " + request.getHeader("Accept-Encoding")); 
		out.println("</br>User-Agent : " + request.getHeader("User-Agent")); 
		out.println("</br>Connection : " + request.getHeader("Connection")); 
		out.println("</br>Cookie : " + request.getHeader("Cookie")); 
		out.println("</br>Created : " + session.getCreationTime()); 
		out.println("</br>LastAccessed : " + session.getLastAccessedTime());
		out.flush();
		out.close();
		
		
	}

}
