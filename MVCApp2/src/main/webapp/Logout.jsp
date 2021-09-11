<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
String msg = (String)request.getAttribute("msg");
out.println(msg+"<br>");
%>
<jsp:include page="login.html"/>
</body>
</html>