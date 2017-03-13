<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑页面</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/insert" method="post"> 
		TITLE:<input type="text" name="title">
		DESCRIPTION:<input type="text" name="description">
		LANGUAGE:<input type="text" name="language">
		<input type="submit" value="确定" >
	</form>
</body>
</html>

