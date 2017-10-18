<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/order/orderAdd" method="post">
<input  type="hidden"  name="userId" value="${sessionScope.userTe}"/>
<input  type="hidden"  name="carId"  value="${sessionScope.car.carId}"/>
<h1>车辆信息</h1>
<table border="1" style="width:800px;background: yellow;">
<tr>
<th>编号</th>
<th>乘坐人数</th>
<th>品牌</th>
<th>级别</th>
<th>型号</th>
<th>结构</th>
<th>排量</th>
<th>操纵杆</th>
</tr>
<tr>
<td><input type="text"   value="${requestScope.car.carId}"/></td>
<td><input type="text"   value="${requestScope.car.seat}"/></td>

<!--品牌  -->
<c:forEach items="${sessionScope.brandlist}" var="brand">
<c:if test="${requestScope.car.getBrandId() == brand.getBrandId()}">
<td><input type="text"   value="${brand.getBrandName()}"/></td>
</c:if>
</c:forEach>

<!-- 级别 -->
<c:forEach items="${sessionScope.levelslist}" var="levle">
<c:if test="${requestScope.car.getLevelId() == levle.getLevelId()}">
<td><input type="text"   value="${levle.getLevelName()}"/></td>
</c:if>
</c:forEach>

<!-- 车型 -->
<c:forEach items="${sessionScope.carTypelist}" var="carType">
<c:if test="${requestScope.car.getTypeId() == carType.getTypeId()}">
<th><input type="text"   value="${carType.getTypeName()}"/></th><br>
</c:if>
</c:forEach>

<!-- 变速箱-->
<c:forEach items="${sessionScope.strlist}" var="str">
<c:if test="${requestScope.car.getStrId() == str.getStrId()}">
<td><input type="text"   value="${str.getStrName()}"/></td>
</c:if>
</c:forEach> 


<!-- 排量 -->
<c:forEach items="${sessionScope.outputlist}" var="out">
<c:if test="${requestScope.car.getLevelId() == out.getOutId()}">
<td><input type="text"   value="${out.getOutName()}"/></td>
</c:if>
</c:forEach>

<!-- 手竿-->
<c:forEach items="${sessionScope.gearboxlist}" var="gear">
<c:if test="${requestScope.car.getGearId() == gear.getGearId()}">
<td><input type="text"   value="${gear.getGearName()}"/></td>
</c:if>
</c:forEach>
</tr>
</table>
<h1>订单如下</h1>
<table border="1" style="width:800px;background: green;">
<tr>
<th>取车时间</th>
<th>还车时间</th>
<th>取车地点</th>
<th>还车地点</th>
<th>订单租金</th>
</tr>
<tr>
<td><input type="text"         name="getCarTime"          /></td>
<td><input type="text"         name="returnCarTime"       /></td>
<td><input type="text"         name="getCarPlace"         /></td>
<td><input type="text"         name="returnCarPlace"       /></td>
<td><input type="text"         name="orderPrice"         /></td>
</tr>
<tr><td><input type="submit" value="提交订单"/></td></tr>
</table>
</form>
</body>
</html>