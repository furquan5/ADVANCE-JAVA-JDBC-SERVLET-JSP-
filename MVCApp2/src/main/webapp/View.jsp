<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="test.UserBean"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
String fName = (String)session.getAttribute("fName");
UserBean ub = (UserBean)session.getAttribute("ub");
out.println("Page of "+fName+"<br>");
out.println(ub.getfName()+"&nbsp&nbsp"+ub.getlName()+"&nbsp&nbsp"+
ub.getAddr()+"&nbsp&nbsp"+ub.getPhNo()+"&nbsp&nbsp"+ub.getmId()+"<br>");
%>
<jsp:include page="link.html"/>
</body>
</html>
