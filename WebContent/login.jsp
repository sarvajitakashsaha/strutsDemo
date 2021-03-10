<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
 <h1> Please Login </h1>
</center> 
</body>
</html>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<center>
<h:form action="/login">
	<h:text property="username"></h:text>
	<h:password property="password"></h:password>
	<h:submit />
	<hr />
</h:form>
</center>
