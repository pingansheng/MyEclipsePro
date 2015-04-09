<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<form action="/DynamicForm/register.do?type=register" method="post">
		用户ID:<input type="text" name="userid" />
		<br>
		密　码:<input type="password" name="password" />
		<br> 邮件:<input type="text" name="email" /><br>
		<input type="submit" value="注册" />
		<input type="reset" name="重置" />
	</form>
</body>
</html>
