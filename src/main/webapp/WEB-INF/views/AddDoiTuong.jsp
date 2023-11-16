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
<script src="resources/code.jquery.com_jquery-3.7.0.min.js"></script>
<script
	src="resources/cdnjs.cloudflare.com_ajax_libs_jquery-validate_1.19.3_jquery.validate.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="TTdoiTuongModel" action="addDoiTuong" method="post" id="add">
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
						<h5>Quản Lý Cách Ly</h5>
					</div>
					<div class="row mb-4">
						<div class="form-outline">
							<label class="form-label" for="form6Example1">Họ Tên Bệnh
								Nhân</label>
							<form:input path="hoTen" cssClass="form-control "
								placeholder="Họ Tên Bệnh Nhân" name="hoTen" />
						</div>
					</div>
					<!-- 2 column grid layout with text inputs for the first and last names -->
					<div class="form-group">
						<label for=>Giới Tính</label> <br>
						<form:radiobutton path="gioiTinh" value="Nam" label="Nam" />
						<form:radiobutton path="gioiTinh" value="Nu" label="Nu" />
					</div>

					<div class="form-outline mb-4">
						<label class="form-label" for="form6Example6">Ngày Sinh
							</label>
						<form:input path="ngaySinh" cssClass="form-control "
							placeholder="Ngày Sinh" name="ngaySinh" type="date" />

					</div>


					<!-- Text input -->
					<div class="form-outline mb-4">
						<label class="form-label" for="form6Example3">Địa Chỉ
							</label>
						<form:input path="DiaChi" cssClass="form-control "
							placeholder="Địa Chỉ" name="DiaChi" />
					</div>



					<div class="form-outline mb-4">
						<label class="form-label" for="form6Example6">Số Điện Thoại
							</label>
						<form:input path="soDienThoai" cssClass="form-control "
							placeholder="Số Điện Thoại" name="soDienThoai" />
					</div>
					<div class="form-outline mb-4">
						<label class="form-label" for="form6Example6">Ngày Tiếp Xúc F0
							</label>
						<form:input path="ngayTiepXucF0" cssClass="form-control "
							placeholder="Ngày Tiếp Xúc F0" name="ngayTiepXucF0"
							type="date" />
					</div>

					<!-- Number input -->
					<div class="form-outline mb-4">
						<label class="form-label" for="form6Example6">Mã Phòng Cách Ly</label>
						<form:input path="maPhong" cssClass="form-control "
							placeholder="Mã Phòng Cách Ly" name="maPhong" />

					</div>
						<div class="form-outline mb-4">
						<label class="form-label" for="form6Example6">Ngày Bắt Đầu Cách Ly
							</label>
						<form:input path="ngayBDCL" cssClass="form-control "
							placeholder="Ngày Bắt Đầu Cách Ly" name="ngayBDCL"
							type="date" />
					</div>

				<div class="form-outline mb-4">
						<label class="form-label" for="form6Example6">Ngày Dự Kiến Kết Thúc Cách Ly
							</label>
						<form:input path="ngayKTCLDK" cssClass="form-control "
							placeholder="Ngày Dự Kiến Kết Thúc Cách Ly" name="ngayKTCLDK"
							type="date" />
					</div>

					<div class="form-outline mb-4">
						<label class="form-label" for="form6Example6">Chi Phí Thanh Toán</label>
						<form:input path="CPThanhToanDK" cssClass="form-control "
							placeholder="Chi Phí Thanh Toán" name="CPThanhToanDK" />

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