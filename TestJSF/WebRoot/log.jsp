<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

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

<title>My JSF 'log.jsp' starting page</title>

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
	<f:view>
		<h1>Login</h1>
		<h:outputText value="#{userBean.message }"></h:outputText>
		<h:form>
			<h:outputText value="username"></h:outputText>
			<h:inputText value="#{userBean.username}"></h:inputText>
			<br>
			<h:outputText value="password"></h:outputText>
			<h:inputSecret value="#{userBean.password}"></h:inputSecret>

			<h:commandButton value="Login" action="#{userBean.checkUser }"></h:commandButton>
		</h:form>
	</f:view>
</body>
</html>