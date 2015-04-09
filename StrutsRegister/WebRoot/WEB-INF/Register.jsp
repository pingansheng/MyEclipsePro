<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>My JSP 'Register.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
</head>

<body>
	<h1>注册</h1>
	<html:form action="/register.do" method="post">
		用户ID:<html:text property="userid"></html:text>
		<br>
		用户名:<html:text property="username"></html:text>
		<br> 邮件:<html:text property="email"></html:text><br>
		<html:submit value="注册用户"></html:submit>
		<html:cancel value="取消"></html:cancel>
	</html:form>
</body>
</html>
