<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List,JDBCEntity.FilmLanguage,java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示页面</title>
</head>
<body>
	<table border="1" cellspacing="0" cellpadding="0" width="99%">
		<tr>
			<th>电影编号</th>
			<th>语言编号</th>
			<th>主题</th>
			<th>描述</th>
			<th>语言</th>
			<th>操作</th>
			<th>编辑</th>
		</tr>
		<% 
			List<FilmLanguage> list = (List)request.getAttribute("list");
			Iterator<FilmLanguage> it = list.iterator();
			while(it.hasNext()){
				FilmLanguage fl = (FilmLanguage)it.next();
				request.setAttribute("filmId", fl.getFilmId());
		%>
			<tr>
				<td><%=fl.getFilmId() %></td>
				<td><%=fl.getLanguageId() %></td>
				<td><%=fl.getTitle() %></td>
				<td><%=fl.getDescription() %></td>
				<td><%=fl.getName() %></td>
				<td><form action="/delete" method="post"><input type="submit" value="删除"></form></td>
				<td><a href="select.jsp">编辑</a></td>
			</tr>
		<% }%>
	</table>
</body>
</html>