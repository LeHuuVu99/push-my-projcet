<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/bootstrap.min.css" />"
	rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<%-- 	<form:form></form:form> --%>
		<div class="row">
			<h5>Please Sign In</h5>
		</div>
		<div class="row">
		<input placeholder="email"> 
			<%-- <form:input path="email" /> --%>
		</div>
		<div class="row">
			<input placeholder="password">
		<%-- 	<form:input path="password" /> --%>
		</div>
		<div class="form-check">
			<label class="form-check-label" for="form6Example8"> Active </label>
			<input name="Active" class="form-check-input me-2" type="checkbox"
				value="" id="form6Example8" checked />
		</div>
		<div class="row">
			<button name="loginButton"
				style="background-color: rgb(29, 156, 114);" type="submit"
				class="btn btn-primary btn-block mb-4">login</button>
		</div>
		<div class="row">
			<a href="register.jsp">click here to register</a>
		</div>

	</div>
</body>
</html>