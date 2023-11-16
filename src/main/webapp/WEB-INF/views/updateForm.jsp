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
	<form:form modelAttribute="TTDoiTuong" action="UpdatehDoiTuong"
		method="post" id="">
		<div class="container">
			<div class="row row1">
				<%@include file="header.jsp"%>
				<div
					style="background-size: cover; background-repeat: no-repeat; background-position: center; height: 70%; margin-top: 1%; margin-left: 1%; border: 1px solid rgb(203, 202, 202); color: rgb(8, 8, 8);"
					class="col-9">
					<div
						style="margin-top: 2%; border-bottom: 1px solid rgb(82, 77, 77);"
						class="row">
						<p>
							<a href="#" style="color: rgb(8, 8, 8);">Quản lý người dùng</a>
						</p>
					</div>
					<div style="color: rgb(8, 8, 8);" class="row">
						<h5>Update</h5>
					</div>
					<div class="row mb-4">
						<div class="form-outline">
							<label class="form-label" for="form6Example1">Họ Tên Bệnh Nhân</label>
							<form:input path="hoTen" cssClass="form-control "
								placeholder="Họ Tên Bệnh Nhân" name="hoTen" />
						</div>
					</div>


						<div class="form-outline mb-4">
						<label class="form-label" for="form6Example6">Ngày Phát Bệnh
							</label>
						<form:input path="ngayPhatBenh" cssClass="form-control "
							placeholder="Ngày Phát Bệnh" name="ngayPhatBenh" type="date" />

					</div>
					<div class="row">
						<div class="col-4">
							<a href="#" style="text-decoration: none;">
								<button name="ResetButton"
									style="background-color: rgb(207, 168, 28);" type="button"
									class="btn btn-primary btn-block mb-4">Reset</button>
							</a> <a href="#" style="text-decoration: none;">
								<button name="addButton"
									style="background-color: rgb(29, 156, 114);" type="submit"
									class="btn btn-primary btn-block mb-4">Add</button>
							</a>
						</div>
					</div>
				</div>
			</div>
			<!-- Submit button -->
		</div>
	</form:form>
</body>
</html>