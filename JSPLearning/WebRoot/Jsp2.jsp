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

<title>My JSP 'Jsp2.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
table {
	border: 2px solid black;
	border-collapse: collapse;
}

table td {
	border: 1px solid black;
}
</style>
</head>

<body>
	<%--该注释HTML中没有 --%>
	<jsp:include page="MyJsp.jsp"></jsp:include>
	<%
		pageContext.setAttribute("name", "ping");
	%>
	<br></br>
	<%@ include file="MyJsp.jsp"%>
	<table>
		<tr>
			<td><%=pageContext.getAttribute("name").toString()%></td>
			<td>aaa</td>
			<td>aaa</td>
			<td>aaa</td>
			<td>aaa</td>
		</tr>
		<tr>
			<td>aaa</td>
			<td>aaa</td>
			<td>aaa</td>
			<td>aaa</td>
			<td>aaa</td>
		</tr>
		<tr>
			<td>aaa</td>
			<td>aaa</td>
			<td>aaa</td>
			<td>aaa</td>
			<td>aaa</td>
		</tr>
		<tr>
			<td>aaa</td>
			<td>aaa</td>
			<td>aaa</td>
			<td>aaa</td>
			<td>aaa</td>
		</tr>
	</table>
</body>
</html>
