<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

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
	<!-- struts2标签不需要.action -->
	<s:form action="login" method="post">
		<s:textfield name="userid" label="用户ID"></s:textfield>
		<s:password name="password" label="密　码"></s:password>
		<s:submit label="提交"></s:submit>
	</s:form>
	<s:fielderror></s:fielderror>
</body>
</html>