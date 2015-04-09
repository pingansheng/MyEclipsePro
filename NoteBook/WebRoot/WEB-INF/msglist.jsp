<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>My JSP 'msglist.jsp' starting page</title>

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
	<font size="4"><a href="${pageContext.request.contextPath }/route?toAction=postMsg">发布信息</a> </font>
	<font size="4"><a href="route?toAction=quit">退出系统</a> </font>
	<br> 欢迎
	<font color="blue">${userinfo.name}</font>,留言信息：
	<table cellspacing="0" width="500px" border="1" bordercolor="blue">
		<tr>
			<th>发送人</th>
			<th>发送时间</th>
			<th>接收人</th>
			<th>消息内容</th>
		</tr>
		<c:forEach items="${messagelist }" var="msg">
			<tr>
			<!-- 触发懒加载异常 -->
				<td>${msg.sender.name }</td>
				<td>${msg.msgtime }</td>
				<td>${msg.receiver.name }</td>
				<td>${msg.msgbody }</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>
