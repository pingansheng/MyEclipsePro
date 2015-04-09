<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>My JSP 'reg.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
</head>

<body>
	<form action="register" method="post">
	<s:actionerror cssStyle="color:red"/>
	<hr>
	<s:fielderror cssStyle="color:blue"></s:fielderror>
		
	
	<s:form action="register"  method="post" theme="simple">
	<table border="1">
			<tr>
				<td>用户名：</td>
				<td><s:textfield name="username"/>
				</td>
			</tr>
			<tr>
				<td>密 码：</td>
				<td><s:textfield name="password" />
				</td>
			</tr>
			<tr>
				<td>再次输入：</td>
				<td><s:textfield name="repass" />
				</td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><s:textfield name="age" />
				</td>
			</tr>
			<tr>
				<td>时间：</td>
				<td><s:textfield name="date" />
				</td>
			</tr>
		</table>
		<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>
