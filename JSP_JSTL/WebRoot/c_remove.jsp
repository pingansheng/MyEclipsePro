<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'c_remove.jsp' starting page</title>
  </head>
  
  <body>
  <c:set var="abc" value="china" scope="request"></c:set>
  <!-- scope="request"不指定全部干掉 -->
  <c:remove var="abc" scope="request" />
  <c:out value="${abc }" default="novalue"></c:out>
  </body>
</html>
