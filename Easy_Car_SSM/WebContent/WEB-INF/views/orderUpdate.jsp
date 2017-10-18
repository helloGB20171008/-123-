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
<h1>修改订单信息</h1>
<a href="<%=request.getContextPath()%>/order/orderCancel?orderId=${requestScope.order.orderId}">取消订单</a>
<form action="<%=request.getContextPath()%>/order/orderupdate" method="post">
<h2>车辆信息如下：</h2>
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
<th>原价</th>
<th>折扣</th>
<th>图片</th>
</tr>
<tr>
<td><input type="text"   value="${sessionScope.car.carId}"/></td>
<td><input type="text"   value="${requestScope.car.seat}"/></td>

<!--品牌  -->
<c:forEach items="${sessionScope.brandlist}" var="brand">
<c:if test="${sessionScope.car.getBrandId() == brand.getBrandId()}">
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
<td><input type="text"   value="${requestScope.car.original}"/></td>
        <td><input type="text"   value="${requestScope.car.discount}"/></td>
        <td><input type="text"   value="${requestScope.car.image}"/></td> 
</tr>
</table>
<h2>请根据需要修改如下信息</h2> 
<table border="1" style="width:800px;background: yellow;">
<tr>
<th>取车时间</th>
<th>还车时间</th>
<th>取车地点</th>
<th>还车地点</th>
<th>租车资金</th>
<th>订单号</th>
<th>租车人</th>
</tr>
<tr>
<td><input type="text"         name="getCarTime"          /></td>
<td><input type="text"         name="returnCarTime"       /></td>
<td><input type="text"         name="getCarPlace"         /></td>
<td><input type="text"         name="returnCarPlace"      /></td>
<td><input type="text"         name="orderPrice"          /></td>
<td><input type="text" name="orderId" value="${requestScope.order.orderId}"/></td>
<td><input type="text" value="${sessionScope.name}"/></td>
</tr>
</table>
<input  type="hidden" name="userId"  value="${sessionScope.userTe}"/>
<input  type="hidden"  name="carId"  value="${sessionScope.car.carId}"/>
<input type="submit" value="确认修改"/>
</form>
</body>
</html>