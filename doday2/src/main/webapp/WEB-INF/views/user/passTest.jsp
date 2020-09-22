<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<script type="text/javascript">
	var info = "${info}";
	console.log(info)//그냥 일반적으로 받아옴
	var password = "${info.password}";
	console.log(password)//그냥 일반적으로 받아온것의 인수하나

	var obj= {
			id: "${info.id}",
			password: "${info.password}"
		} 
	console.log(obj);
	var info_json = JSON.stringify(obj);
	console.log(info_json);
</script>
<body>
${info.password}
${info.id} 


비번은 이것이다!
</body>
</html>
