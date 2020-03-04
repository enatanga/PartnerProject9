<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee</title>
</head>
<body>
<form action = "editEmployeeServlet" method="post">
Deportment: <input type ="text" name = "deportment" value= "${empToEdit.deportment}">
Employee: <input type = "text" name = "employee" value= "${empToEdit.employee}">
<input type = "hidden" name = "id" value="${empToEdit.id}">
<input type = "submit" value="Save Edited employee">
</form>
</body>
</html>