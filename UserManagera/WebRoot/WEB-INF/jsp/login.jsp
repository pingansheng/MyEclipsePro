<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>用户登录</title>

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
	<img width="100px" height="50px" src="imgs/hello.jpg" />
	<hr />

	<form action="/UserManager/LoginCheckServlet" method="post">

		<table style="width:100%;text-align:center">
			<tr>

				<td style="width:50%;text-align:center"></td>

				<td style="width:50%" align="center">
					<table cellspacing="0" cellpadding="0" border="0" width="200">
						<tbody>
							<tr>
								<td colspan="2" align="center" valign="top">
									<h1>用户登录</h1></td>
							</tr>
							<tr>
								<td>用户ID：</td>
								<td><input type="text" style="width: 100px;"
									value="${cookie.keepid.value}" name="userid"></td>
							</tr>
							<tr>
								<td>密 码：</td>
								<td><input type="password" style="width: 100px;"
									value="${cookie.keeppass.value }" name="password"></td>
							</tr>
							<tr>
								<td>验证码：</td>
								<td style="padding: 0px"><input type="text"
									style="vertical-align:middle;width: 40px;height:21px"
									name="code"><img style="vertical-align:middle"
									src="/UserManager/CreateCode"></td>
							</tr>
							<tr>
								<td>
									<%--判断是否有cookie --%> <input type="checkbox"
									${null!=cookie.keepid.value? 'checked=true
									':''}
										name="keeppass" />记住密码</td>
								<td align="center"><input type="submit" value="登录">
								</td>
							</tr>
						</tbody>
					</table></td>
			</tr>
		</table>
	</form>
	<c:out value="<font color=red> ${err}</font>" escapeXml="false"
		default=""></c:out>
	<hr />
	<img width="100px" height="50px" src="imgs/hello.jpg" />
</body>
</html>
