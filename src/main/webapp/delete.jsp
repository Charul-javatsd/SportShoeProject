<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="delete">
<input type="hidden" name="shoeId" value=<%=request.getParameter("shoeId") %>>
<input type="submit" value="Delete Now">
</form>

</body>
</html>