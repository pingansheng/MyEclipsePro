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

<title>My JSP 'addemployee.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
     function validate(){
       var reg = new RegExp("^[0-9]*$");
       var obj = document.getElementById("grade");
       var salary=document.getElementById("salary");
       var test =obj.value+salary.value;
    if(!reg.test(test)){
        alert("薪水、级别请输入数字!");
        return false;
    }
    if(!/^[0-9]*$/.test(test)){
        alert("薪水、级别请输入数字!");
        return false;
    }
    return true;
  }
  </script>
<link rel="stylesheet" href="css/pure-min.css" type="text/css"></link>
</head>

<body>

	<c:choose>
		<c:when test="${emptoupdate==null}">
			<form
				action="${pageContext.request.contextPath }/employee?flag=addtoDB"
				method="post" class="pure-form pure-form-aligned"
				onsubmit="return validate();">
		</c:when>
		<c:otherwise>
			<form
				action="${pageContext.request.contextPath }/employee?flag=updatetodb"
				method="post" class="pure-form pure-form-aligned"
				onsubmit="return validate();">
		</c:otherwise>
	</c:choose>
	<fieldset>
	<input name="id" type="hidden" value="${emptoupdate.id}"/>
	<input name="hiredate" type="hidden" value="${emptoupdate.hiredate}"/>
		<div class="pure-control-group">
			<label for="department">部门</label> <select id="department"
				name="department">
				<c:forEach items="${deptlist }" var="dept">
					<option value="${dept.id}" ${emptoupdate.department.id==dept.id? 'selected=selected':'' }   >${dept.name}</option>
				</c:forEach>
			</select>
		</div>

		<div class="pure-control-group">
			<label for="name">姓名</label> <input id="name" name="name" type="text"
				value="${emptoupdate.name}" placeholder="请输入姓名" required>
		</div>

		<div class="pure-control-group">
			<label for="email">邮箱</label> <input id="email" name="email"
				type="email" value="${emptoupdate.email}" placeholder="请输入邮箱"
				required>
		</div>

		<div class="pure-control-group">
			<label for="password">密码</label> <input id="password" name="pwd"
				type="password" placeholder="请输入密码" required>
		</div>

		<div class="pure-control-group">
			<label for="grade">级别</label> <input id="grade" type="text"
				name="grade" value="${emptoupdate.grade}" placeholder="请输入级别"
				required>
		</div>

		<div class="pure-control-group">
			<label for="salary">薪水</label> <input id="salary" type="text"
				name="salary" value="${emptoupdate.salary}" placeholder="请输入薪水"
				required>
		</div>

		<div class="pure-controls">
			<c:choose>
				<c:when test="${emptoupdate==null}">
					<button type="submit" class="pure-button pure-button-primary">提交</button>
				</c:when>
				<c:otherwise>
					<button type="submit" class="pure-button pure-button-primary">更新</button>
				</c:otherwise>
			</c:choose>
			<button type="reset" class="pure-button pure-button-primary">重置</button>
		</div>
	</fieldset>
	</form>
</body>
</html>
