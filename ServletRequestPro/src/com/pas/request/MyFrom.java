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
		
		out.println("�û�����<input type='text' name='username'></br>");
		out.println("�ܡ��룺<input type='password' name='pwd'></br>");
		out.println("�ԡ���<input type='radio' name='sex' value='1' checked>��");
		out.println("<input type='radio' name='sex' value='0'>Ů</br>");
		
		out.println("��ϲ��ʲô��<input type='checkbox' name='like' value='����'>����" +
				"<input type='checkbox' name='like' value='ƻ��'>ƻ��"+
				"<input type='checkbox' name='like' value='����'>����</br>");
		
		out.println("�����ڵĳ��У�<select name='city'>");
		out.println(" <option value='����'>����</option>"+
                	"<option value='����'>����</option>"+
					"<option value='�Ϻ�'>�Ϻ� </option>");
		out.println("</select></br>");
		
		out.println("��Ľ���:<textarea cols='20' rows='10' name='intro' >���������..</textarea><br/>");
		out.println("�ύ��Ƭ:<input type='file' name='photo'><br/>");
		out.println("������Ϣ:<input type='hidden' value='������Ϣ' name='hidden1'><br/>");
		
		out.println("<input type='submit' value='�ύ��Ϣ'>");
		out.println("</form>");
		

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
