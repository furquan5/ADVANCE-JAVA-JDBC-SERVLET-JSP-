<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,test.ProductBean"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
  <%
String fName = (String)request.getAttribute("fName");
out.println("Page of "+fName+"<br>");  
ArrayList<ProductBean> al = (ArrayList<ProductBean>)request.getAttribute("al");
if(al.size()==0){
	out.println("NotProducts available...");
}else{
	Iterator<ProductBean> it = al.iterator();
	while(it.hasNext()){
	ProductBean pb = (ProductBean)it.next();
	out.println("<br>"+pb.getpCode()+"&nbsp"+pb.getpName()+"&nbsp"+pb.getpPrice()+"&nbsp"
	+pb.getpQty()+"<br>");
	}
}
String s1 = (String)application.getAttribute("s1");
if(s1.equals("AdminLogin")){
	%>
	<br>
	<jsp:include page="link2.html"/>
	<%
}else{
	%>
  <jsp:include page="link.html"/>
	<%
}
  %>
  <br>
  <br>
</body>
</html>