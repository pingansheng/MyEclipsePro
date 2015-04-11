<%@ page language="java"
	import="java.util.*,com.pas.domain.User,java.text.*"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>系统主界面</title>

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
	<div>
		<img width="100px" height="50px" src="imgs/hello.jpg" alt="" /> 欢迎用户：${User.name }登录，${firstInfo }，
		本系统访问次数:${num }次 <a href="/UserManager">重新登陆</a>
	</div>
	<hr />

	<h3>请选择您要进行的操作</h3>
	<a href="/UserManager/ManageUserCTL">管理用户</a>
	<br>
	<a href="/UserManager/UserCTLServlet?type=toadduser">添加用户</a>
	<br>
	<a href="">查找用户</a>
	<br>
	<a href="">退出系统</a>
	<br>

	<hr />
	<img width="100px" height="50px" src="imgs/hello.jpg" alt="" />
</body>
</html>
