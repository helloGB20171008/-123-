
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>阳光租车系统</title>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
	font-family: cursive;
}

</style>
</head>
<body>
<div style="background-color: silver;">
<input type="text" value="欢迎用户：${sessionScope.name}" style="color: red;background: green;"/>
</div>
<h1>查询所有车辆信息</h1>
<c:if test="${sessionScope.userTe == null}">
<a href="<%=request.getContextPath() %>/user/nologin">用户登录</a>
<a href="<%=request.getContextPath() %>/user/noadduser">用户注册</a>
</c:if>
<table border="1" style="width:800px;background: yellow;">
<tr>
<th>图片</th>
<th>编号</th>
<th>品牌</th>
<th>级别</th>
<th>型号</th>
<th>排量</th>
<th>结构</th>
<th>变速箱</th>
<th>乘坐人数</th>
<th>原价</th>
<th>折扣</th>
<c:if test="${requestScope.userTe != null}"><th>操作</th></c:if>
</tr>
<c:forEach items="${requestScope.carlist1}" var="car" varStatus="a">
<tr> 
<!-- 图片-->
<td><input type="image" src="${pageContext.request.contextPath}/image/${car.image}.png"></td>
<td>${car.carId}</td>
 <!--品牌  -->
<c:forEach items="${sessionScope.brandlist}" var="brand">
<c:if test="${car.getBrandId() == brand.getBrandId()}">
<td>${brand.getBrandName()}</td>
</c:if>
</c:forEach>


<!-- 级别 -->
<c:forEach items="${sessionScope.levelslist}" var="levle">
<c:if test="${car.getLevelId() == levle.getLevelId()}">
<td>${levle.getLevelName()}</td>
</c:if>
</c:forEach>

<!-- 车型 -->
<c:forEach items="${sessionScope.carTypelist}" var="carType">
<c:if test="${car.getTypeId() == carType.getTypeId()}">
<td>${carType.getTypeName()}</td>
</c:if>
</c:forEach>

<!-- 排量 -->
<c:forEach items="${sessionScope.outputlist}" var="out">
<c:if test="${car.getLevelId() == out.getOutId()}">
<td>${out.getOutName()}</td>
</c:if>
</c:forEach>

<!-- 变速箱-->
<c:forEach items="${sessionScope.strlist}" var="str">
<c:if test="${car.getStrId() == str.getStrId()}">
<td>${str.getStrName()}</td>
</c:if>
</c:forEach> 


<!-- 变速箱-->
<c:forEach items="${sessionScope.gearboxlist}" var="gear">
<c:if test="${car.getGearId() == gear.getGearId()}">
<td>${gear.getGearName()}</td>
</c:if>
</c:forEach>

<td>${car.seat}</td>
<td>${car.original}</td>
<td>${car.discount}</td>
<td>
<c:if test="${sessionScope.userTe != null}"><a href="../order/nulladd?carId=${car.carId}">租车</a></c:if>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>