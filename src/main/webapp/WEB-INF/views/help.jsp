<%@ page import="java.time.LocalDateTime" %>
<%@page   isELIgnored= "false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help</title>
</head>
<body>

	<%-- <%String name=(String)request.getAttribute("name"); 
	Integer roll=(Integer)request.getAttribute("roll"); 
	LocalDateTime time=(LocalDateTime)request.getAttribute("time");
	
	%> --%>
<h1>help page</h1>
<h1>this is
	${name }
<%--  <%=name %> --%>

 
 </h1>
<h1>Roll 

	${roll }
<%-- <%=roll %> --%>

</h1>

<h1>Time :
	${time }
	<%-- 	<%=time.toString() %> --%>


</h1>
<hr>
			 <c:forEach var="item" items="${marks} ">
			 <h1>${item } </h1>
			 
			 </c:forEach>
	

	<%-- <h1>marks: ${marks }</h1>
 --%>
</body>
</html>