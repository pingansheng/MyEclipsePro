<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>更新用户</title>

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
	<c:if test="${ User==null}">
		<c:out
			value="<script type='text/javascript'>window.alert('参数错误，请重新登录')</script>"
			escapeXml="false"></c:out>
	</c:if>
	<form action="/UserManagerStruts/userCTL.do?type=modify" method="post">
		<table border="1" bordercolor="green" cellspacing="0">
			<tr>
				<td>用户ID：</td>
				<td><input type="text" name="id" value="${UserUpdate.id }"
					readonly="readonly" />
				</td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="name" value="${UserUpdate.name }" />
				</td>
			</tr>
			<tr>
				<td>电子邮件：</td>
				<td><input type="text" name="email" value="${UserUpdate.email }" />
				</td>
			</tr>
			<tr>
				<td>用户级别：</td>
				<td><input type="text" name="grade" value="${UserUpdate.grade }" />
				</td>
			</tr>
			<tr>
				<td>用户密码：</td>
				<td><input type="text" name="pwd" value="${UserUpdate.pwd }" />
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="修改用户">
				</td>
				<td><a href="/UserManagerStruts/userCTL.do?type=showusers">返回主界面</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
