<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 id='h1'>管理员注册</h1>
<form  id="f1" action="<%=request.getContextPath() %>/admin/AddAdmin" method="post">
<input type="hidden" name="flag" value="add">
编号：<input type="text" name="adminNo"><br>
账户：<input type="text" name="adminUser"><br>
密码：<input type="text" name="adminPw"><br>
类型：<input type="text" name="adminType"><br>
<input type="submit" value="注册"/>
</form> 
</body>
</html>