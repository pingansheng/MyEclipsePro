<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'c_catch.jsp' starting page</title>
  </head>
  
  <body>
  <c:catch var="myex">
    	<% int i=9/0; %>
  </c:catch>

<c:out value="${myex}"></c:out>
  </body>
</html>
