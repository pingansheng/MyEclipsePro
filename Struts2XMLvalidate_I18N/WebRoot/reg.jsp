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
		function validate()
		{
			var username=document.getElementById("username").value.trim();
			var pass1=document.getElementById("pass1").value.trim();
			var pass2=document.getElementById("pass2").value.trim();
			if(username.length==0)
			{
				alert("请输入用户名");
				
			}
			else if(pass1.length==0||pass2.length==0)
			{
				alert("密码为空");
			}
			else if(pass1!=pass2)
			{
				alert("两次密码输入不一致");
			}
			else
			{
				return true;
			}
			return false;
		}
		</script>
</head>

<body>
	<s:debug></s:debug>
	Field ERR:
	<s:fielderror cssStyle="color:blue"></s:fielderror>
	<br> Action ERR: <s:actionerror />
	 <s:form action="/register"
			method="post" theme="simple" onsubmit="return validate();">
			<!-- 防止重复提交 -->
			<s:token></s:token>
			<!-- JSP页面国际化 -->
			<!-- i18n标签 可指定资源文件, name为basename -->
			<!--tem_en_US.properties存在src根目录下-->
			<s:i18n name="tem">
				<s:text name="add_user">
					<!-- 穿参数 -->
					<s:param>参数名</s:param>
				</s:text>
			</s:i18n>
			<!-- 第一种方式  Struts标签-->
			<s:text name="add_user"></s:text>

			<table border="1" style="border-collapse: collapse">
				<tr>
					<td>用户名：</td>
					<td><s:textfield name="username" id="username" /></td>
					<td>
					<!-- 自定义错误信息位置 -->
						<s:fielderror>
							<s:param>username</s:param>
						</s:fielderror>
					</td>
				</tr>
				<tr>
					<td>密 码：</td>
					<td><s:password name="password" id="pass1" /></td>
				</tr>
				<tr>
					<td>再次输入：</td>
					<td><s:password name="repass" id="pass2" /></td>
				</tr>
				<tr>
					<td>年龄：</td>
					<td><s:textfield name="age" /></td>
				</tr>
				<tr>
					<td>时间：</td>
					<td><s:textfield name="date" /></td>
				</tr>
			</table>
			<s:submit value="提交"></s:submit>
		</s:form>
</body>
</html>
