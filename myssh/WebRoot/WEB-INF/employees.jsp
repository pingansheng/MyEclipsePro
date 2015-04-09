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

<title>My JSP 'employees.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


<link rel="stylesheet" href="css/pure-min.css" type="text/css"></link>
<script type="text/javascript" src="js/jquery-1.3.1.js"></script>
<script type="text/javascript" src="js/myjs.js"></script>

</head>

<body>
	<table class="pure-table">
		<thead>
			<tr>
				<th>ID</th>
				<th>姓名</th>
				<th>邮件</th>
				<th>薪水</th>
				<th>雇用日期</th>
				<th>级别</th>
				<th>所属部门</th>
				<th>修改用户</th>
				<th>删除用户</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${emplist}" var="emp">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.email}</td>
					<td>${emp.salary}</td>
					<td>${emp.hiredate}</td>
					<td>${emp.grade}</td>
					<td>${emp.department.name}</td>
					<td><a class="pure-button"
						href="${pageContext.request.contextPath }/employee?flag=update_${emp.id}">修改用户</a>
					</td>
					<td><a class="pure-button del"
						href="${pageContext.request.contextPath }/employee?flag=del_${emp.id}">删除用户</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<ul class="pure-paginator">
		<c:forEach var="i" begin="1" end="${pageCount }">
			<li><a class="pure-button"
				href="${pageContext.request.contextPath }/employee?flag=showEmployee&pagenow=${i}">${i}</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>
