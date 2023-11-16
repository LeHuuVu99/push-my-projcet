<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/bootstrap.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/fontawesome-free-6.4.0-web/css/all.min.css" />"
	rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="TTdoiTuongModel" action="searchDoiTuong" method="get">
		<div class="container">
			<div class="row ">
				<%@include file="header.jsp"%>
				<div class="row">
					<div class="col-6">
						<div class="form-outline mb-4">
							<label class="form-label" for="form6Example6">Tên Bệnh Nhân</label>
							<form:input path="hoTen" cssClass="form-control "
								placeholder="Tên Đối Tượng" name="hoTen" />
						</div>
					</div>
					<div class="col-6">
					<div class="form-outline mb-4">
						<label class="form-label" for="form6Example6">Mã Trung Tâm Cách Ly
							</label>
						<form:input path="maTTCL" cssClass="form-control "
							placeholder="Tên Lỗi Kỹ Thuật" name="maTTCL" />
					</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-8"></div>
				<div class="col-4">
					<button type="submit" class="btn btn-primary">Search</button>
				</div>
			</div>



			<table style="margin-top: 3%;" class="table table-bordered">
				<thead>
					<tr>
						<th>Họ Tên Bệnh Nhân</th>
						<th>Giới Tính</th>
						<th>Ngày Sinh</th>
						<th>Địa Chỉ</th>
						<th>Số Điện Thoại</th>
						<th>Ngày Tiếp Xúc F0</th>
						<th>Mã Phòng Cách Ly</th>
						<th>Ngày Bắt Đầu Cách Ly</th>
						<th>Ngày Dự Kiến Kết Thúc Cách Ly</th>
						<th>Chi Phí Thanh Toán</th>
						<th></th>
					</tr>
				</thead>
				<Tbody>
					<c:forEach items="${listDoiTuong}" var="ldt" varStatus="status">
						<tr>
							<td>${ldt.hoTen}</td>
							<td>${ldt.gioiTinh}</td>
							<td>${ldt.ngaySinh}</td>
							<td>${ldt.diaChi}</td>
							<td>${ldt.soDienThoai}</td>
							<td>${ldt.ngayTiepXucF0}</td>
							<td>${ldt.phongCachLy.maPhong}</td>
							<td>${ldt.ngayBDCL}</td>
							<td>${ldt.ngayKTCLDK}</td>
							<td>${ldt.CPThanhToanDK}</td>
							<td><a href="formUpdatehDoiTuong?maDT=${ldt.maDT}" class="edit-icon"><i
									class="fas fa-edit"></i></a> <a href="delete?maDT=${ldt.maDT}"
								class="delete-icon"><i class="fas fa-trash-alt"></i></a></td>
						</tr>
					</c:forEach>
				</Tbody>
		 	 <c:if test="${not empty listSearchDoiTuong}">
					<Tbody>
						<c:forEach items="${listSearchDoiTuong}" var="lsdt" varStatus="status">
						<tr>
							<td>${lsdt.hoTen}</td>
							<td>${lsdt.gioiTinh}</td>
							<td>${lsdt.ngaySinh}</td>
							<td>${lsdt.diaChi}</td>
							<td>${lsdt.soDienThoai}</td>
							<td>${lsdt.ngayTiepXucF0}</td>
							<td>${lsdt.phongCachLy.maPhong}</td>
							<td>${lsdt.ngayBDCL}</td>
							<td>${lsdt.ngayKTCLDK}</td>
							<td>${lsdt.CPThanhToanDK}</td>
							<td><a href="update?hoTen=${lsdt.maDT}" class="edit-icon"><i
									class="fas fa-edit"></i></a> <a href="delete?hoTen=${lsdt.maDT}"
								class="delete-icon"><i class="fas fa-trash-alt"></i></a></td>
						</tr>
						</c:forEach>			
							</Tbody>
							</c:if>   
			</table>
		</div>
		
	</form:form>
</body>
</html>