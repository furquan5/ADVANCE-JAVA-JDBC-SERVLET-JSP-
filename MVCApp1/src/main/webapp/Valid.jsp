<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="javax.servlet.http.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fName = (String)application.getAttribute("fName");
out.println("WELCOME : "+fName+"<br>");
String s1 = (String)application.getAttribute("s1");
if(s1.equals("AdminLogin")){
	%>
	<jsp:include page="link2.html"/>
	<%
}else{
	%>
	<jsp:include page="link.html"/>
	
	<%
}
%>
</body>
</html>
