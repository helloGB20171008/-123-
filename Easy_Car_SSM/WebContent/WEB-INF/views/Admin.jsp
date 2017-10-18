<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
 #h1,#f1{
 text-align: center;
 color: blue;
 }
</style>
<body>
<h1 id='h1'>基于SSM的阳光汽车租赁管理系统</h1>
<form  id="f1" action="<%=request.getContextPath() %>/admin/login" method="post">
<input type="hidden" name="flag" value="login">
账户：<input type="text" name="adminUser"><br>
密码：<input type="password" name="adminPw"><br>
<input type="submit" value="登录"/>
</form> 
<a href="<%=request.getContextPath() %>/admin/noadd">注册</a>
</body>
</html>