<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<%-- 	<form:form></form:form> --%>
		<div class="row">
			<h5>Please Sign In</h5>
		</div>
		<div class="row">
		<input placeholder="user name"> 
			<%-- <form:input path="email" /> --%>
		</div>
			<div class="row">
		<input placeholder="email"> 
			<%-- <form:input path="email" /> --%>
		</div>
			<div class="row">
		<input placeholder="password"> 
			<%-- <form:input path="email" /> --%>
		</div>
		<div class="row">
			<input placeholder="re password">
		<%-- 	<form:input path="password" /> --%>
		</div>
		<div class="row">
			<button name="registerButton"
				style="background-color: rgb(29, 156, 114);" type="submit"
				class="btn btn-primary btn-block mb-4">register</button>
		</div>
		<div class="row">
			<a href="login.jsp">click here to login</a>
		</div>


	</div>
</body>
</html>