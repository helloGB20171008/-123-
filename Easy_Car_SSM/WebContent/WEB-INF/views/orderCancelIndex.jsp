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
<h1>订单已取消成功</h1>

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
<table border="1" style="width:800px;background: yellow;">
<tr>
<th>取车时间</th>
<th>还车时间</th>
<th>取车地点</th>
<th>还车地点</th>
<th>租车资金</th>
<th>订单号</th>
<th>订单状态</th>
<th>用户编号</th>
<th>租期</th>
<th>用名</th>
</tr>
<tr>
<td><input type="text"   value="${requestScope.order1.getCarTime}"    name="getCarTime"/></td>
<td><input type="text"   value="${requestScope.order1.returnCarTime}" name="returnCarTime"/></td>
<td><input type="text"   value="${requestScope.order1.getCarPlace}"   name="getCarPlace" /></td>
<td><input type="text"   value="${requestScope.order1.returnCarPlace}" name="returnCarPlace" /></td>
<td><input type="text"   value="${requestScope.order1.orderPrice * requestScope.car.discount}"    name="orderPrice" /></td>
<%-- <td><input type="text"   value="${requestScope.order.orderId}" name="orderId"/></td> --%>
<td><input type="text"   value="${requestScope.order1.orderId}"       name="orderId" /></td>
<td><input type="text"   value="${requestScope.order1.orderState == 1? '成功' :requestScope.order1.orderState == 2? '未付款':'已取消'}"    name="orderState" /></td>
<td><input type="text"   value="${requestScope.order1.userId}"        name="userId" /></td>
<td><input type="text"   value="${requestScope.getDate1}"/></td>
<td><input type="text"   value="${sessionScope.name}"/></td>
</tr>
</table>
<a href="<%=request.getContextPath()%>/order/turntoorderIndex?orderId=${requestScope.order1.orderId}&userId=${requestScope.order1.userId}">返回个人订单中心主页</a>
<!--  web-inf里面任意两个jsp文件不允许直接互访,需要跳到底层-->
</body>
</html>