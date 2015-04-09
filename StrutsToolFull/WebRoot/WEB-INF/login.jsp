<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
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
	<form action="/StrutsToolFull/login.do" method="post">
		<table cellspacing="0" cellpadding="0" border="0" width="200">
			<tbody>
				<tr>
					<td colspan="2" align="center" valign="top">
						<h1>用户登录</h1></td>
				</tr>
				<tr>
					<td align="right">用户名：</td>
					<td><input type="text" style="width: 100px;" name="username">
					</td>
				</tr>
				<tr>
					<td align="right">密 码：</td>
					<td><input type="password" style="width: 100px;"
						name="password"></td>
				</tr>

				<tr>

					<td colspan="2" align="center"><input type="submit" value="登录">
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>