package com.pas.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFrom extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		out.println("<form action='/RequestPro/Register' method='post'>");
		
		out.println("用户名：<input type='text' name='username'></br>");
		out.println("密　码：<input type='password' name='pwd'></br>");
		out.println("性　别：<input type='radio' name='sex' value='1' checked>男");
		out.println("<input type='radio' name='sex' value='0'>女</br>");
		
		out.println("你喜欢什么？<input type='checkbox' name='like' value='栗子'>栗子" +
				"<input type='checkbox' name='like' value='苹果'>苹果"+
				"<input type='checkbox' name='like' value='桃子'>桃子</br>");
		
		out.println("你所在的城市：<select name='city'>");
		out.println(" <option value='北京'>北京</option>"+
                	"<option value='广州'>广州</option>"+
					"<option value='上海'>上海 </option>");
		out.println("</select></br>");
		
		out.println("你的介绍:<textarea cols='20' rows='10' name='intro' >请输入介绍..</textarea><br/>");
		out.println("提交照片:<input type='file' name='photo'><br/>");
		out.println("隐藏信息:<input type='hidden' value='隐藏信息' name='hidden1'><br/>");
		
		out.println("<input type='submit' value='提交信息'>");
		out.println("</form>");
		

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
