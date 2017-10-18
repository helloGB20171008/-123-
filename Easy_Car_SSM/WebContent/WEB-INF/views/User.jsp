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
<h1 id='h1'>阳光租车管理系统</h1>
<form  id="f1" action="<%=request.getContextPath() %>/user/login" method="post">
<input type="hidden" name="flag" value="login">
电话：<input type="text" name="userTe"><br>
密码：<input type="password" name="userPw"><br>
<input type="submit" value="登录"/>
</form> 
</body>
</html>