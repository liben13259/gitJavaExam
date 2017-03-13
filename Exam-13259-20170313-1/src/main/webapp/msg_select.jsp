<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息显示</title>
</head>
<body>
	<%
		out.println(request.getAttribute("msg"));
		response.setHeader("refresh", "3;URL=select.jsp");
	%>
</body>
</html>