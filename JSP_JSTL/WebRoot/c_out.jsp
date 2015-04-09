<%@ page language="java" import="java.util.*,com.pas.domain.*"
	pageEncoding="UTF-8"%>
<!-- 引入jstl标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>My JSP 'MyJsp.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
</head>

<body>
	<%

 	//此代码应在控制器中
  	//request.setAttribute("abc", "1213");
  	//pageContext.setAttribute("abc", "<a href='asd'>hhh</a>");
	
	User u=new User();
	u.setId(123);
	u.setName("asd");
	request.setAttribute("abc", u);
	
  //优先级
   %>
	<h1>如何输出各种域对象：pagecontext>request>session>application</h1>
	
	<%--c:out --%>
	<c:out value="Hello,world!"></c:out>
	<br> <!-- escapeXml是否过滤html 默认true -->
	<c:out value="${abc}" default="no value" escapeXml="false"></c:out>
	<br>
	<c:out value="${abc.id}" default="no value" escapeXml="false"></c:out>
	<c:out value="${abc.name}" default="no value" escapeXml="false"></c:out>
	<br> ${abc.id*12 },${abc.name } 
</body>
</html>
