<%@ page language="java" import="java.util.*,com.pas.domain.*"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>My JSP 'c_choose.jsp' starting page</title>
</head>

<body>
	<%
		request.setAttribute("a", "helloa");
		request.setAttribute("age", 99);

		User u = new User();
		u.setId(12);
		u.setName("ping");
		request.setAttribute("user", u);
	%>
	<h1>c chooese</h1>
	<c:choose>
		<c:when test="${user.id<15 }">
			<font color="blue">id小于15</font>
		</c:when>
		<c:when test="${user.id<19 }">
			<font color="red">id小于19</font>
		</c:when>

		<c:otherwise>
			<font color="green">其他情况</font>
		</c:otherwise>
	</c:choose>
</body>
</html>
