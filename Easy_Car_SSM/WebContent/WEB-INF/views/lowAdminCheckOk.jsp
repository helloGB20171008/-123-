<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="text" value="欢迎用户：${requestScope.name }" style="color: red;background: green;"/>
<a href="<%=request.getContextPath()%>/car/SelectAll" >查询所有车辆信息</a>
</body>
</html>