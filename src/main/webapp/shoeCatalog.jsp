<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.example.demo.model.Shoes"%>
            <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="pink"></body>
<%List<Shoes> s=(List<Shoes>)request.getAttribute("list"); %>

<table border="1">
<tr><th>Shoeid</th><th>Shoename</th><th>Shoeprice</th></tr>

<%for(Shoes s1:s){%>
<tr><td><%=s1.getShoeId() %></td><td><%=s1.getShoeName() %></td><td><%=s1.getShoePrice()%></td><td><a href="Buy.jsp">Buy</a></td></tr>
<%}%>
</table>
</body>
</html>