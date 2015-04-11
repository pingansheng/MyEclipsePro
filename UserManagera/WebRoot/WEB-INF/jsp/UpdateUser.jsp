<%@ page language="java" import="java.util.*,com.pas.domain.User"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
	<form action="/UserManager/UserCTLServlet?type=modify" method="post">
		<table border="1" bordercolor="green" cellspacing="0">
			<tr>
				<td>用户ID：</td>
				<td><input type="text" name="UserID" value="${User.id }"
					readonly="readonly" />
				</td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="UserName" value="${User.name }" />
				</td>
			</tr>
			<tr>
				<td>电子邮件：</td>
				<td><input type="text" name="UserEmail" value="${User.email }" />
				</td>
			</tr>
			<tr>
				<td>用户级别：</td>
				<td><input type="text" name="UserGrade" value="${User.grade }" />
				</td>
			</tr>
			<tr>
				<td>用户密码：</td>
				<td><input type="text" name="UserPassWD" value="${User.pwd }" />
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="修改用户">
				</td>
				<td><a href="/UserManager/RouteCTL?path=user">返回主界面</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
