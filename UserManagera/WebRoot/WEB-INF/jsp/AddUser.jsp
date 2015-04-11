<%@ page language="java" import="java.util.*,com.pas.domain.User"
	pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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

	<form action="/UserManager/UserCTLServlet?type=AddUser" method="post">
		<table border="1" bordercolor="green" cellspacing="0">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="UserName"/></td>
			</tr>
			<tr>
				<td>电子邮件：</td>
				<td><input type="text" name="UserEmail"/></td>
			</tr>
			<tr>
				<td>用户级别：</td>
				<td><input type="text" name="UserGrade"/></td>
			</tr>
			<tr>
				<td>用户密码：</td>
				<td><input type="text" name="UserPassWD"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="添加用户"></td>
				<td><a href="/UserManager/RouteCTL?path=user">返回主界面</a></td>
			</tr>
		</table>
	</form>
</body>
</html>
