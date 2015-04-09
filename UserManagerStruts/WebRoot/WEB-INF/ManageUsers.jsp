<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>用户管理</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function gotoPage(){
		var pagenow=pageNum.value;
		if(isNaN(pagenow)||pagenow>${pagecount}||pagenow<0)
			{
				window.alert("参数错误");
				return false;
			}
		window.open('/UserManagerStruts/userCTL.do?type=showusers&pageNow='+pagenow,'_self');
		}
	function confirmDel(){ return window.confirm('确认删除该用户？'); 
	}

</script>
</head>

<body>
	<c:if test="${ User==null}">
		<c:out
			value="<script type='text/javascript'>window.alert('参数错误，请重新登录')</script>"
			escapeXml="false"></c:out>
	</c:if>
	<div>
		<img width="100px" height="50px" src="imgs/hello.jpg" alt="" /> 欢迎用户：${User.name }登录
		<a href="/UserManagerStruts/route.do?path=main">返回主界面</a> <a
			href="/UserManagerStruts/">安全退出</a>
	</div>
	<hr />



	<div style="width: 100%; text-align: center; margin: 0 auto">
		<h1>管理用户</h1>
		<table align="center" border="1" bordercolor="green" cellspacing="0">
			<tr>
				<th>用户ID</th>
				<th>用户名</th>
				<th>用户级别</th>
				<th>电子邮件</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
			<%--循环显示用户信息--%>
			<c:forEach items="${pageusers }" var="u">
				<tr>
				<td>${u.id }</td>
				<td>${u.name }</td>
				<td>${u.grade }</td>
				<td>${u.email }</td>
				<td><a
					href="/UserManagerStruts/userCTL.do?id=${u.id }&type=update">修改用户</a>
				</td>
				<td><a onClick="return confirmDel()"
					href="/UserManagerStruts/userCTL.do?id=${u.id }&type=del">删除用户</a>
				</td>
			</tr>
			</c:forEach>
			<%--循环结束 --%>
		</table>

		<%--分页选项 --%>
		<c:choose>
			<c:when test="${pageNow!=1 && pageNow>0}">
				<c:choose>
					<c:when test="${pageNow==pageStartIndex }">
						<a
							href="/UserManagerStruts/userCTL.do?type=showusers&pageNow=${ pageNow - 1}&pageStartIndex=${pageStartIndex - 1}">
							<上一页>
						</a>
					</c:when>
					<c:otherwise>
						<a
							href="/UserManagerStruts/userCTL.do?type=showusers&pageNow=${ pageNow - 1}&pageStartIndex=${pageStartIndex}">
							<上一页>
						</a>
					</c:otherwise>
				</c:choose>
			</c:when>
		</c:choose>
		<%--分页选项结束 --%>
		
		<%--分页信息 --%>
		<c:forEach var="i" begin="${pageStartIndex }" end="${ pageStartIndex+9}">
			<c:if test="${i<=pagecount }">
				<a
					href="/UserManagerStruts/userCTL.do?type=showusers&pageNow=${i }&pageStartIndex=${pageStartIndex}">
					<font ${i==pageNow? 'color="red"':'' }><${i}></font>
				</a>
			</c:if>
		</c:forEach>
		<%--分页信息 结束--%>
		
		<%--分页选项 --%>
		<c:choose>
			<c:when test="${pageNow != pagecount && pageNow > 0}">
				<c:choose>
					<c:when test="${pageNow == pageStartIndex + 9}">
						<a
							href="/UserManagerStruts/userCTL.do?type=showusers&pageNow=${ pageNow + 1}&pageStartIndex=${pageStartIndex + 1}">
							<下一页>
						</a>
					</c:when>
					<c:otherwise>
						<a
							href="/UserManagerStruts/userCTL.do?type=showusers&pageNow=${ pageNow + 1}&pageStartIndex=${pageStartIndex}">
							<下一页>
						</a>
					</c:otherwise>
				</c:choose>
			</c:when>
		</c:choose>
		<%--分页选项结束 --%>
		<br>
		<%--大翻页选项 --%>

		<c:choose>
			<c:when test="${pageStartIndex - 10 > 0}">
				<a
					href="/UserManagerStruts/userCTL.do?type=showusers&pageNow=
					${pageStartIndex - 10}&pageStartIndex=
					${pageStartIndex - 10}"><<</a>
			</c:when>
			<c:otherwise>
				<a
					href="/UserManagerStruts/userCTL.do?type=showusers&pageNow=1
					&pageStartIndex=1"><<</a>
			</c:otherwise>
		</c:choose>

		<c:choose>
			<c:when test="${pageStartIndex + 10 < pagecount}">
				<a
					href="/UserManagerStruts/userCTL.do?type=showusers&pageNow=
					${pageStartIndex + 10}&pageStartIndex=
					${pageStartIndex + 10}">>></a>
			</c:when>
			<c:otherwise>
				<a
					href="/UserManagerStruts/userCTL.do?type=showusers&pageNow=${pageNow }
			&pageStartIndex=${pageStartIndex}">>></a>
			</c:otherwise>
		</c:choose>


		<%--大翻页选项结束 --%>
		
		跳转到：<input type="text" style="width: 30px; height: 20px" id="pageNum" />
		<input type="button" onclick="return gotoPage()" value="go" />
		&nbsp;&nbsp;&nbsp;当前页${pageNow }/总页数
		${pagecount }
	</div>
	<hr />
	<img width="100px" height="50px" src="imgs/hello.jpg" alt="" />

</body>
</html>

