package com.pas.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pas.domain.User;
import com.pas.service.UserService;
import com.sun.security.auth.UserPrincipal;

public class LoginCheckServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gb2312");
		

		//��֤��
		String code=request.getParameter("code");
		String codeSer=request.getSession().getAttribute("code").toString();
		if("".equals(code)||"".equals(codeSer))
		{
			err(request, response,"��������֤��");
			return;
		}
		else if(!code.equals(codeSer))
		{
			err(request, response,"��֤�벻��ȷ");
			return;
		}
		
		// �������� �û��� ����
		User user = new User();
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");

		if ("".equals(userid) || "".equals(password)||null==userid||null==password) {
			err(request, response,"��������Ϣ");
		} else {
			user.setId(Integer.parseInt(userid.equals("") ? "-1" : userid));
			user.setPwd(password);

			// �ȼ���֤
			if (new UserService().checkUser(user)) {
				// ��ת�¸�ҳ�桾Servlet �����ַ�ʽ sendredirectת�� forwardת����
				// sendredirect url /webapp/servlet url
				// response.sendRedirect("/UserManager/MainFrame");
				user = new UserService().getUserModel(userid);
				request.getSession().setAttribute("User", user);
				
				//��������������1
				int num=Integer.parseInt(this.getServletContext().getAttribute("num").toString());
				this.getServletContext().setAttribute("num", num+1);
				//�鿴�Ƿ񱣴�cookie
				setPassKeepCookie(request, response, userid, password);
				//ȡ���Ƿ��״ε�½
				request.getSession().setAttribute("firstInfo", firstLogin(request,response));
				//��ˢ��
				response.sendRedirect("/UserManager/RouteCTL?path=main");
			} else {
				err(request, response,"�û������������");
			}
		}
	}

	private void setPassKeepCookie(HttpServletRequest request,
			HttpServletResponse response, String userid, String password) {
		String[] likes= request.getParameterValues("keeppass");
		if(null!=likes)
		{
			Cookie ckid=new Cookie("keepid",userid);
			Cookie ckpass=new Cookie("keeppass",password);
			ckid.setMaxAge(3600*24*7);
			ckpass.setMaxAge(3600*24*7);
			response.addCookie(ckid);
			response.addCookie(ckpass);
		}
		else
		{
			for (Cookie cookie : request.getCookies()) {
				if(cookie.getName().startsWith("keep"))
				{
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
			}
		}
	}

	private void err(HttpServletRequest request, HttpServletResponse response,String err)
			throws ServletException, IOException {
		request.setAttribute("err", err);
		request.getRequestDispatcher("/index.jsp")
				.forward(request, response);
		return;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}
	
	/*
	 * �ж��Ƿ��״ε�½ ȡ���ϴε�¼ʱ��
	 */
	public String firstLogin(HttpServletRequest request,
			HttpServletResponse response) {
		Cookie[] cks = request.getCookies();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowTime = sdf.format(new Date());
		if (cks != null) {
			for (Cookie c : cks) {
				if (c.getName().equals("ck_date")) {
					String date = "���ϴε�¼ʱ�䣺" + c.getValue();
					c.setValue(nowTime);
					response.addCookie(c);
					return date;
				}
			}
		}

		Cookie ck_date = new Cookie("ck_date", nowTime);
		ck_date.setMaxAge(3600 * 7 * 24);
		response.addCookie(ck_date);
		return "�����״ε�¼";
	}
}
