Valid.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
String fName = (String)session.getAttribute("fName");
out.println("Welcome "+fName+"<br>");
%>
<jsp:include page="link.html"/>
</body>
</html>
