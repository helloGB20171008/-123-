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
<h1>管理员订单中心</h1>
<table border="1" style="width:800px;background: yellow;">
<tr>
<th>订单号</th>
<th>车型</th>
<th>取车时间</th>
<th>还车时间</th>
<th>状态</th>
<th>操作</th>
<c:if test="order.getOrderState() ==2"><th>结算</th></c:if>
<tr/>

<c:forEach items="${requestScope.orderforAdminlist}" var="order" varStatus="a">
<tr>
 
<td>${order.getOrderId()}</td>


 <td>
<c:forEach items="${sessionScope.carlist}" var="car" >
 <c:if test="${order.getCarId() == car.getCarId()}"> 

 <!--品牌  -->
<c:forEach items="${sessionScope.brandlist}" var="brand">
<c:if test="${car.getBrandId() == brand.getBrandId()}">
${brand.getBrandName()}
</c:if>
</c:forEach>

<!-- 车型 -->
<c:forEach items="${sessionScope.carTypelist}" var="carType">
<c:if test="${car.getTypeId() == carType.getTypeId()}">
/${carType.getTypeName()}
</c:if>
</c:forEach>


<!-- 级别 -->
<c:forEach items="${sessionScope.levelslist}" var="levle">
<c:if test="${car.getLevelId() == levle.getLevelId()}">
/${levle.getLevelName()}
</c:if>
</c:forEach>

<!-- 排量 -->
<c:forEach items="${sessionScope.outputlist}" var="out">
<c:if test="${car.getLevelId() == out.getOutId()}">
/${out.getOutName()}
</c:if>
</c:forEach>


<!-- 变速箱-->
<c:forEach items="${sessionScope.gearboxlist}" var="gear">
<c:if test="${car.getGearId() == gear.getGearId()}">
/${gear.getGearName()}
</c:if>
</c:forEach>

<!--结构 -->
<c:forEach items="${sessionScope.strlist}" var="str">
<c:if test="${car.getStrId() == str.getStrId()}">
/${str.getStrName()}
</c:if>
</c:forEach> 
 
 </c:if> 
</c:forEach>
</td>

<td>${order.getGetCarTime()}</td>

<td>${order.getReturnCarTime()}</td>

<td>${order.getOrderState() == 1? "成功" :order.getOrderState() == 2? "未付款":"已取消"}</td>


<td>
<c:if test="${order.getOrderState() == 2}"> 
 <a href="<%=request.getContextPath()%>/order/check?orderId=${order.getOrderId()}">确认 </a>  
</c:if> 
</td>
</tr>
</c:forEach> 
</table>
<a href="<%=request.getContextPath()%>/order/turntoAdminIndex">返回管理员主页 </a>
</body>
</html>