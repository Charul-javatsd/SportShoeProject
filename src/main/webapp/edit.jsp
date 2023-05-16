<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
Updated Shoeid: <input type="text" name="shoeId">
Updated Shoename: <input type="text" name="shoeName">
Updated Shoeprice: <input type="text"  name="shoePrice">
<input type="hidden" name="shoeId" value=<%=request.getParameter("shoeId") %>>
<input type="submit" value="Edit Now">
</form>
</body>
</html>