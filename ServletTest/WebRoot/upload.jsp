<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'upload.jsp' starting page</title>

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
<!-- 默认值enctype="application/x-www-form-urlencoded" 此方式提交方式为字符串 需改为multiple-->
	<form action="/ServletTest/Upload" method="post" enctype="multipart/form-data">
		信息：<input type="text" name="info" /><br>
		文件：<input type="file" name="file" /><br>
		<input type="submit" name="submit" value="submit"/>
	</form>
</body>
</html>
