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

<title>My JSP 'postMsg.jsp' starting page</title>

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
	<font size="6"><a href="route?toAction=msglist">查看信息</a>
	</font>
	<font size="6"><a href="route?toAction=quit">退出系统</a>
	</font>
	<form
		action="${pageContext.request.contextPath }/postmsg"
		method="post">
		<table>
			<tr>
				<td>接收人</td>
				<td><input type="text" name="receiver" />
				</td>
			</tr>
			<tr>
				<td>发送内容</td>
				<td><textarea name="content" rows="5" cols="20">请输入内容</textarea>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="发布" />
				</td>
				<td><input type="reset" value="重新填写" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
