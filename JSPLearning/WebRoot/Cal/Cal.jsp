<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Cal.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="Cal/cal.js"></script>
</head>

<body>
	<%
		double result = 0;
		double n1=0;
		double n2=0;
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String op=request.getParameter("op");
		if (num1 != null && num2 != null) {
			if(!"".equals(num1.trim())&&!"".equals(num2.trim()))
			{
				n1=Double.parseDouble(num1.trim());
				n2=Double.parseDouble(num2.trim());
				if(op.equals("+"))
				{	
					result=n1+n2;
				}else if(op.equals("-"))
				{
					result=n1-n2;
				}else if(op.equals("*"))
				{
					result=n1*n2;
				}else
				{
					if(n2==0)
					{
						out.print("<script>alert('除数为0');</script>");
					}
					else
					{
						result=n1/n2;
					}
				}
			}else
			{
				out.print("<script>alert('参数为空');</script>");
			}
		}else
		{
			out.print("<script>alert('参数为空');</script>");
		}
		
	%>
	<form action="/JSPLearning/Cal/Cal.jsp" method="post"
		onsubmit="check()">
		第一个数：<input type="text" id="num1" name="num1" value='<%=n1 %>' /><br>
		第二个数：<input type="text" id="num2" name="num2" value='<%=n2 %>' /><br>
		操作符号：<select name="op">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">x</option>
			<option value="/">/</option>
		</select><br> <input type="submit" onclick="return check();" value="计算" />
	</form>
	<br>
	<hr>

	<input type="text" readonly="readonly"
		value='<%=String.format("%.5f",result)%>' />
  </body>
</html>
