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
<h1 id='h1'>用户注册</h1>
<form  id="f1" action="<%=request.getContextPath() %>/user/Adduser" method="post">
<input type="hidden" name="flag" value="add">
电话：<input type="text" name="userTe"><br>
账户：<input type="text" name="userName"><br>
密码：<input type="text" name="userPw"><br>
类型：<input type="text" name="userType"><br>
<input type="submit" value="注册"/>
</form> 
</body>
</html>