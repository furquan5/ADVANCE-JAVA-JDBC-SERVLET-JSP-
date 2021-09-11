<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="test.ProductBean"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
ProductBean pb = (ProductBean)request.getAttribute("pb");
application.setAttribute("pb",pb);
%>
<form action="update" method="post">
ProductPrice:<input type="text" name="pprice" value="<%=pb.getpPrice() %>"><br>
ProductQty:<input type="text" name="pqty" value="<%=pb.getpQty() %>"><br>
<input type="submit" value="UpdateProduct">
</form>
</body>
</html>
