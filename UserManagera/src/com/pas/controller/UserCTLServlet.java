package com.pas.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pas.domain.User;
import com.pas.service.UserService;

public class UserCTLServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("gb2312");
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();

		String userid = request.getParameter("id");
		String type = request.getParameter("type");
		UserService us = new UserService();

		if ("".equals(type)) {
			out.println("<h1>参数错误<h1>");
			return;
		} else if ("del".equals(type)) {
			delUser(request, response, out, userid, us);
		} else if ("update".equals(type)) {
			// 修改用户跳转
			User user = us.getUserModel(userid);
			request.setAttribute("User", user);
			request.getRequestDispatcher("/WEB-INF/jsp/UpdateUser.jsp").forward(request,
					response);
		} else if ("modify".equals(type)) {
			modifyUser(request, response, out, us);
		} else if ("toadduser".equals(type)) {
			request.getRequestDispatcher("/WEB-INF/jsp/AddUser.jsp").forward(request, response);
		} else if ("AddUser".equals(type)) {
			addUser(request, response, out, us);
		}
		out.flush();
		out.close();

	}

	/*
	 * 删除用户
	 */
	private void delUser(HttpServletRequest request,
			HttpServletResponse response, PrintWriter out, String userid,
			UserService us) throws ServletException, IOException {
		if ("".equals(userid)) {
			out.println("<h1>参数错误<h1>");
			return;
		} else {
			if (us.delUser(userid)) {
				request.getRequestDispatcher("/Ok").forward(request, response);
			} else {

				request.getRequestDispatcher("/Err").forward(request, response);
			}
		}
	}

	/*
	 * 修改用户信息
	 */
	private void modifyUser(HttpServletRequest request,
			HttpServletResponse response, PrintWriter out, UserService us)
			throws ServletException, IOException {
		// 修改用户
		User user = getUser(request, out);

		if (us.updateUser(user)) {
			request.getRequestDispatcher("/Ok").forward(request, response);
		}
	}

	/*
	 * 得到用户实体
	 */
	private User getUser(HttpServletRequest request, PrintWriter out) {
		String userId = request.getParameter("UserID");
		String username = request.getParameter("UserName");
		String email = request.getParameter("UserEmail");
		String grade = request.getParameter("UserGrade");
		String pwd = request.getParameter("UserPassWD");
		if ("".equals(username) || "".equals(email) || "".equals(grade)
				|| "".equals(pwd)) {
			out.println("参数错误");
			return null;
		}

		User user = new User();

		if (null != userId) {
			user.setId(Integer.parseInt(userId));
		}
		user.setName(username);
		user.setEmail(email);
		user.setGrade(Integer.parseInt(grade));
		user.setPwd(pwd);
		return user;
	}

	/*
	 * 添加用户
	 */
	private void addUser(HttpServletRequest request,
			HttpServletResponse response, PrintWriter out, UserService us)
			throws ServletException, IOException {

		User user = getUser(request, out);

		if (us.addUser(user)) {
			request.getRequestDispatcher("/Ok").forward(request, response);
		}
	}

}
