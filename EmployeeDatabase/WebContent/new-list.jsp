<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "createNewListServlet" method="post">
Deportment Name: <input type ="text" name = "listName"><br />
Hired date: <input type ="text" name = "month" placeholder="mm" size="4"> <input type ="text" name = "day" placeholder="dd" size="4">, <input type ="text" name = "year" placeholder="yyyy" size="4">
Employee Name: <input type = "text" name = "deportmentName"><br />

 Employee in the list :<br />

<select name="allIEmpToAdd" multiple size="6">
<c:forEach items="${requestScope.allEmps}" var="currentemp">
   <option value = "${currentemp.id}">${currentemp.deportment} | ${currentemp.employee}</option>
</c:forEach>
</select>
<br />
<input type = "submit" value="Create List and Add Employees">
</form>
<a href = "index.html">add new employee instead.</a>
</body>
</html>