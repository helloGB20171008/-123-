<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<body>
<input type="text" value="欢迎用户：${requestScope.name }" style="color: red;background: green;"/>
<h1 id="h1">管理员界面</h1>
<a href="check/" id="a1">订单中心</a>
<a href="<%=request.getContextPath()%>/car/SelectBrand" id="a2">查看车辆信息</a>
</body>
</html>