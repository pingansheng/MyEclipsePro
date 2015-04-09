<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

<title>My JSP 'sel.jsp' starting page</title>

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
	<s:form action="viewResult" theme="simple">
		<div style="text-align: center">
			<H1>请选择喜欢的科目</H1>
			计算机：
			<s:checkbox name="study" label="计算机" fieldValue="computer"></s:checkbox>
			<br> 数学
			<s:checkbox name="study" label="数学" fieldValue="math"></s:checkbox>
			<br> 英语
			<s:checkbox name="study" label="英语" fieldValue="english"></s:checkbox>
			<br> 历史
			<s:checkbox name="study" label="历史" fieldValue="history"></s:checkbox>
			<br>

			<!-- <s:checkboxlist list="#{'computer':'计算机','math':'数学','english':'英语','history':'历史'}" name="sports" label="运动">
  	</s:checkboxlist> -->
			<s:submit value="提交"></s:submit>
		</div>

	</s:form>
</body>
</html>
