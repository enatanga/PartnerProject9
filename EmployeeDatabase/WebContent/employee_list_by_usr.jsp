<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<form method = "post" action = "listNavigationServlet">
<table>
<c:forEach items="${requestScope.allEmps}" var="currentlist">
<tr>
   <td><input type="radio" name="id" value="${currentlist.id}"></td>
   <td><h2>${currentlist.listName}</h2></td></tr>
   <tr><td colspan="3">Hired Date: ${currentlist.hireDate}</td></tr>
   <tr><td colspan="3">Department: ${currentlist.emp.deportmentName}</td></tr>
   <c:forEach var = "listVal" items = "${currentlist.listOfEmployees}">
            <tr><td></td><td colspan="3">
                ${listVal.department}, ${listVal.employee}
                </td>
            </tr>
  </c:forEach>
</c:forEach>
</table>
<input type = "submit" value = "edit" name="doThisToEmployee">
<input type = "submit" value = "delete" name="doThisEmployee">
<input type="submit" value = "add" name = "doThisToEmployee">
</form>
<a href="addEmployeeForListServlet">Create a new Deportment</a>
<br>
<a href="index.html">Insert a new Employee</a>
</body>
</html>