<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page   isELIgnored= "false" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h3 class="text-center">${Header}</h3>
    <p class="text-center">${Desc}</p>
   
<h1 style="color:green">${msg }</h1>
 	<h1> Welcome ${user.userName}</h1>
 	<h1>Your email is ${ user.email}</h1>
 	<h1>Your password is ${user.password} try to secure the password</h1>
</body>
</html>