package com.pas.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session_Cookie extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();

		Cookie[] cks = request.getCookies();
		for (int i = 0; i < cks.length; i++) {
			if (cks[i].getName().equals("JSESSIONID")) {
				out.println("读取cookie SessionID 成功");
				out.println(cks[i].getValue());
				out.println(request.getSession().getAttribute("123"));
			}
		}
		HttpSession ss = request.getSession();
		ss.setAttribute("123", "123");

		if (ss.isNew()) {
			out.print("Session创建");
		}
		Cookie ck = new Cookie("JSESSIONID", ss.getId());
		ck.setMaxAge(3600);
		response.addCookie(ck);

		out.flush();
		out.close();
	}

}
