<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>My JSP 'ok.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
</head>

<body>
	<table border="1">
		<tr>
			<td>用户ID：</td>
			<td>${user }</td>
		</tr>
		<tr>
			<td>用户名：</td>
			<td>${username }</td>
		</tr>
		<tr>
			<td>密 码：</td>
			<td>${password }</td>
		</tr>
		<tr>
			<td>年龄：</td>
			<td>${age }</td>
		</tr>
		<tr>
			<td>时间：</td>
			<td>${date }</td>
		</tr>
	</table>
</body>
</html>
