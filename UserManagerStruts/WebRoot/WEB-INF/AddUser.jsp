<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>添加用户</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>

	<form action="/UserManagerStruts/userCTL.do?type=add" method="post">
		<table border="1" bordercolor="green" cellspacing="0">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>电子邮件：</td>
				<td><input type="text" name="email"/></td>
			</tr>
			<tr>
				<td>用户级别：</td>
				<td><input type="text" name="grade"/></td>
			</tr>
			<tr>
				<td>用户密码：</td>
				<td><input type="text" name="pwd"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="添加用户"></td>
				<td><a href="/UserManagerStruts/route.do?path=main">返回主界面</a></td>
			</tr>
		</table>
	</form>
</body>
</html>