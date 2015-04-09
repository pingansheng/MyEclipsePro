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

<title>My JSP 'MainFrame.jsp' starting page</title>

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
	<H2>欢迎${employee.name}，您所在的部门是${employee.department.name }请选择操作</H2>
	<a href="${pageContext.request.contextPath }/employee?flag=addEmployee">添加雇员</a>
	<a href="${pageContext.request.contextPath }/employee?flag=showEmployee">显示雇员</a>
	<a href="#">查询雇员</a>
	<a href="#">退出雇员</a>
</body>
</html>
