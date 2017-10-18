<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>密码错误,请重新输入</h1>
<%request.getRequestDispatcher("WEB-INF/views/Admin.jsp").forward(request, response);%>
</body>
</html>