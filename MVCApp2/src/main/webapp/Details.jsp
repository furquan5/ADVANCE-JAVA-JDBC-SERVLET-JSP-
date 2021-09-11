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
%>
<form action="update" method="post">
Address:<input type="text" name="addr" value="<%=ub.getAddr()%>"><br>
PhoneNo:<input type="text" name="phno" value="<%=ub.getPhNo()%>"><br>
MailId:<input type="text" name="mid" value="<%=ub.getmId()%>"><br>
<input type="submit" value="UpdateProfile">
</form>
</body>
</html>
