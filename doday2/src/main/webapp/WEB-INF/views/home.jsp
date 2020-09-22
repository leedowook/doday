<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<form method="get" action="/user/passwordTest">
	비번:<input id="password" name="password" type="password">
	<input type="submit" value="띠용">

</form>
</body>
</html>
