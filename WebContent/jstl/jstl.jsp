<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("count", 10);
	
	%>
	<!-- jstl标签经常会和el表达式配合使用 -->
	<!-- test 代表的返回一个boolean的表达式 -->
	<c:if test="${count == 9 }">
	xxxxxx
	</c:if>
	<!-- forEach模拟 
		for（int i = 0 ;i<+5;i++）{
			sout(i)
		}
	
	-->
	<c:forEach begin="0" end="5" var="i" >
		${i }</br>
	</c:forEach>
	<!-- 模拟增强for
		for(Product product : productList){
			sout(product.getPanme());
		}
		
	 -->
	 <!-- items:表示一个集合或数组 -->
	 <c:forEach items="${productList }" var="product">
	 	${product.pName }
	 
	 </c:forEach>
</body>
</html>