<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
 #p1, #p2, #p3, #p4, #p5, #p6, #p7, #p8, #p9, #p10{
 text-align: center;
 color: blue;
 }
</style>
<body>
<form action="<%=request.getContextPath()%>/car/add" method="post">

<p id="p1">品牌 &nbsp; &nbsp; &nbsp;
<select name="brandId">
<c:forEach items="${sessionScope.brandlist}" var="brand">
<option  value="${brand.brandId}" >
${brand.brandName}</option>
</c:forEach>
</select>
</p>

<p id="p2">级别 &nbsp; &nbsp; &nbsp;
<select name="levelId">
<c:forEach items="${sessionScope.levelslist}" var="level">
<option  value="${level.levelId }" >
${level.levelName}</option>
</c:forEach>
</select>
</p>


<p id="p3">型号 &nbsp; &nbsp; &nbsp;
<select name="typeId">
<c:forEach items="${sessionScope.carTypelist}" var="carType">
<option  value="${carType.typeId}" >
${carType.typeName}</option>
</c:forEach>
</select>
</p>


<p id="p4">结构 &nbsp; &nbsp; &nbsp;
<select name="strId">

<c:forEach items="${sessionScope.strlist}" var="structure">
<option  value="${structure.strId}" >
${structure.strName}</option>
</c:forEach>
</select>
</p>

<p id="p5">排量 &nbsp; &nbsp; &nbsp;
<select name="outId">

<c:forEach items="${sessionScope.outputlist}" var="output">
<option  value="${output.outId}" >
${output.outName}</option>
</c:forEach>
</select>
</p>


<p id="p6">变速箱 &nbsp; &nbsp; &nbsp;
<select name="gearId">

<c:forEach items="${sessionScope.gearboxlist}" var="gear">
<option  value="${gear.gearId}" >
${gear.gearName}</option>
</c:forEach>
</select>
</p>

<p id="p7">乘坐人数 &nbsp; &nbsp; &nbsp;
<input type="text" name="seat" />
</p>
<p id="p8">原价 &nbsp; &nbsp; &nbsp;
<input type="text" name="original" />
</p>
<p id="p9">折扣 &nbsp; &nbsp; &nbsp;
<input type="text" name="discount" />
</p>
<p id="p10">图片 &nbsp; &nbsp; &nbsp;
<input type="text" name="image" />
</p>
<input   type="submit" value="提交" />
</form>
</body>
</html>