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
<h1>查询所有车辆信息</h1>
<form action="<%=request.getContextPath()%>/car/SelectAll" method="post">
<p>汽车品牌 
<select name="brandId">
<option value="0">---请选择---</option>
<c:forEach items="${sessionScope.brandlist}" var="brand">
<option value="${brand.brandId}">${brand.brandName}</option>
</c:forEach>
</select>
<input type="submit" value="提交"/>
</p>
</form>

<a href="<%=request.getContextPath() %>/car/nulladd">添加</a>
<table border="1" style="width:800px;background: yellow;">
<tr>
<th>图片</th>
<th>编号</th>
<th>品牌</th>
<th>级别</th>
<th>型号</th>
<th>结构</th>
<th>排量</th>
<th>变速箱</th>
<th>乘坐人数</th>
<th>原价</th>
<th>折扣</th>
<th>操作</th>
</tr>
<c:forEach items="${requestScope.carlist}" var="car" varStatus="a">
<tr> 
<!-- 图片-->
<td><input type="image" src="${pageContext.request.contextPath}/image/${car.image}.png"></td>
 <td>${car.carId}</td>
<!--<td>${car.getBrandId()}</td>
<td>${car.levelId}</td>
<td>${car.typeId}</td>
<td>${car.strId}</td>
 <td>${car.outId}</td> 
<td>${car.gearId}</td> -->

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


<!-- 结构 -->
<c:forEach items="${sessionScope.strlist}" var="str">
<c:if test="${car.getStrId() == str.getStrId()}">
<td>${str.getStrName()}</td>
</c:if>
</c:forEach> 


<!-- 排量 -->
<c:forEach items="${sessionScope.outputlist}" var="out">
<c:if test="${car.getOutId() == out.getOutId()}">
<td>${out.getOutName()}</td>
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
<%-- <td>${car.image}</td> --%>
<td><a href="../car/selectById?carId=${car.carId}">更新</a>
    <a href="../car/delete?carId=${car.carId}">删除</a></td>
</tr>
</c:forEach>
</table>
<a href="<%=request.getContextPath()%>/order/turntoAdminIndex">返回管理员主页 </a>
</body>
</html>