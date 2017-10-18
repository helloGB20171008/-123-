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
<h1>订单提交成功</h1>
<form action="<%=request.getContextPath()%>/order/orderAdd" method="post">
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
<h2>订单如下</h2>
<table border="1" style="width:800px;background: green;">
<tr>
<th>取车时间</th>
<th>还车时间</th>
<th>取车地点:</th>
<th>还车地点:</th>
<th>订单租金:</th>
<th>订单号 </th>
<th>订单状态</th>
<th>用户编号</th>
<th>租期</th>
<th>用户</th>
</tr>
<tr>
<td><input type="text"   value="${requestScope.order.getCarTime}"    name="getCarTime"/></td>
<td><input type="text"   value="${requestScope.order.returnCarTime}" name="returnCarTime"/></td>
<td><input type="text"   value="${requestScope.order.getCarPlace}"   name="getCarPlace" /></td>
<td><input type="text"   value="${requestScope.order.returnCarPlace}" name="returnCarPlace" /></td>
<td><input type="text"   value="${requestScope.order.orderPrice * requestScope.car.discount}"    name="orderPrice" /></td>
<td><input type="text"   value="${requestScope.order.orderId}"       name="orderId" /></td>
<td><input type="text"   value="${requestScope.order.orderState}"    name="orderState" /></td>
<td><input type="text"   value="${requestScope.order.userId}"        name="userId" /></td>
<td><input type="text"   value="${requestScope.getDate}"/></td>
<td><input type="text"   value="${sessionScope.name}"/></td>
</tr>
</table>

<h2>操作订单</h2>
<a href="<%=request.getContextPath()%>/order/orderSelectAll?userId=${requestScope.order.userId}">订单中心</a><br>
<a href="<%=request.getContextPath()%>/order/turnorderSelectById?orderId=${requestScope.order.orderId}">修改订单</a><br>
<a href="<%=request.getContextPath()%>/order/orderCancel1?userId=${requestScope.order.userId}&orderId=${requestScope.order.orderId}">取消订单</a><br>
<a href="<%=request.getContextPath()%>/order/turntoUserIndex">关闭订单</a><br>

</form>
</body>
</html>