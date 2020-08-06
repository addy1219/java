<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addCustomer">
   <input type="text" name="id"><br>
   <input type="text" name="firstName"><br>
   <input type="text" name="lastName"><br>
   <input type="text" name="dob"><br>
   <input type="text" name="email"><br>
   <input type="text" name="phone"><br>
   <input type="submit"><br>
</form>
<form action="getCustomer">
   <input type="text" name="id"><br>
   <input type="submit"><br>
</form>
</body>
</html>