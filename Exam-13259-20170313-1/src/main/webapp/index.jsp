<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
	<a href="login.jsp">登录页面</a><br>
	<form action="<%=request.getContextPath()%>/show" method="post">
		<input type="submit" value="显示页面">
	</form>
	<a href="select.jsp">编辑页面</a><br>
</body>
</html>
