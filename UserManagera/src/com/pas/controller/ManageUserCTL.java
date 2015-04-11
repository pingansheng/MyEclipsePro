package com.pas.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pas.domain.User;
import com.pas.service.UserService;

public class ManageUserCTL extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ���ղ���
		response.setCharacterEncoding("gb2312");
		String S_pageNow = request.getParameter("pageNow");
		String S_pageStartIndex = request.getParameter("pageStartIndex");
		if (null == S_pageNow) {
			S_pageNow = "1";
		}

		int pageNow = 1;
		try {
			pageNow = (int)Double.parseDouble(S_pageNow);
		} catch (Exception e) {
			pageNow = 1;
			response.getWriter().println("<script type='text/javascript'>window.alert('��������');window.close()</script>");
			return;
		}

		int pageStartIndex = 1;

		// �������
		UserService us = new UserService();

		int pageCount = us.getUserPageCount(10);

		if (pageNow < 1 || pageNow > pageCount) {
			pageNow = 1;
		}

		if (S_pageStartIndex != null) {
			pageStartIndex = Integer.parseInt(S_pageStartIndex);

			if (pageStartIndex < 1 || pageStartIndex > pageCount) {
				pageStartIndex = 1;
			}
		} else {
			pageStartIndex = (pageNow - 10 > 0 ? pageNow - 9 : 1);
		}

		// ׼������ ����Service׼������
		int pageSize = 10;
		ArrayList<User> users = us.getUsersByPage(pageNow, pageSize);

		// ��֮���jspʹ��
		request.setAttribute("pageusers", users);
		request.setAttribute("pagecount", pageCount);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("pageStartIndex", pageStartIndex);

		request.getRequestDispatcher("WEB-INF/jsp/ManageUsers.jsp").forward(
				request, response);
	}

}
