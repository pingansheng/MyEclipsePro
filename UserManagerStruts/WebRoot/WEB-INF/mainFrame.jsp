<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
		本系统访问次数:${num }次 <a href="/UserManagerStruts">重新登陆</a>
	</div>
	<hr />

	<h3>请选择您要进行的操作</h3>
	<a href="/UserManagerStruts/route.do?path=manageuser">管理用户</a>
	<br>
	<a href="/UserManagerStruts/route.do?path=adduser">添加用户</a>
	<br>
	<a href="">查找用户</a>
	<br>
	<a href="">退出系统</a>
	<br>

	<hr />
	<img width="100px" height="50px" src="imgs/hello.jpg" alt="" />
</body>
</html>
