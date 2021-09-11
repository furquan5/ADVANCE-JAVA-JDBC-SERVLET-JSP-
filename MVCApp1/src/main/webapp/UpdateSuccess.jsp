<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
String fName = (String)request.getAttribute("fName");
out.println("Page of "+fName+"<br>");
out.println("Product Updated successfully...<br>");
%>
<jsp:include page="link2.html"/>
</body>
</html>
