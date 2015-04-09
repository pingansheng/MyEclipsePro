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

			<script type="text/javascript">
				function validate() {
					var username = document.getElementById("username").value
							.trim();
					var pass1 = document.getElementById("pass1").value.trim();
					var pass2 = document.getElementById("pass2").value.trim();
					if (username.length == 0) {
						alert("请输入用户名");

					} else if (pass1.length == 0 || pass2.length == 0) {
						alert("密码为空");
					} else if (pass1 != pass2) {
						alert("两次密码输入不一致");
					} else {
						return true;
					}
					return false;
				}

			</script>
</head>

<body>
	<s:debug></s:debug>
	<s:fielderror cssStyle="color:blue"></s:fielderror>


	<s:form action="reg" method="post" theme="simple" id="sf1">
		<table border="1" style="border-collapse: collapse">
			<tr>
				<td>用户名：</td>
				<td><s:textfield name="username" id="username" />
				</td>
			</tr>
			<tr>
				<td>密 码：</td>
				<td><s:password name="password" id="pass1" />
				</td>
			</tr>
			<tr>
				<td>再次输入：</td>
				<td><s:password name="repass" id="pass2" />
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
		<s:submit value="提交" onclick="return validate();"></s:submit>
	</s:form>
</body>
</html>
