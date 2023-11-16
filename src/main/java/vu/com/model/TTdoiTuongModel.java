package vu.com.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class TTdoiTuongModel {

	private int maTTCL;
	private String tenTTCL;
	private String diaChiTT;
	private String phiCachLy;

	private int maPhong;
	private String tenPhong;
	private int maDT;
	private String hoTen;
	private String gioiTinh;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngaySinh;
	private String DiaChi;
	private String soDienThoai;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayTiepXucF0;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayBDCL;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayKTCLDK;
	private int CPThanhToanDK;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayPhatBenh;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayKTCLTT;

	public int getMaTTCL() {
		return maTTCL;
	}

	public void setMaTTCL(int maTTCL) {
		this.maTTCL = maTTCL;
	}

	public String getTenTTCL() {
		return tenTTCL;
	}

	public void setTenTTCL(String tenTTCL) {
		this.tenTTCL = tenTTCL;
	}

	public String getDiaChiTT() {
		return diaChiTT;
	}

	public void setDiaChiTT(String diaChiTT) {
		this.diaChiTT = diaChiTT;
	}

	public String getPhiCachLy() {
		return phiCachLy;
	}

	public void setPhiCachLy(String phiCachLy) {
		this.phiCachLy = phiCachLy;
	}

	public int getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public int getMaDT() {
		return maDT;
	}

	public void setMaDT(int maDT) {
		this.maDT = maDT;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public LocalDate getNgayTiepXucF0() {
		return ngayTiepXucF0;
	}

	public void setNgayTiepXucF0(LocalDate ngayTiepXucF0) {
		this.ngayTiepXucF0 = ngayTiepXucF0;
	}

	public LocalDate getNgayBDCL() {
		return ngayBDCL;
	}

	public void setNgayBDCL(LocalDate ngayBDCL) {
		this.ngayBDCL = ngayBDCL;
	}

	public LocalDate getNgayKTCLDK() {
		return ngayKTCLDK;
	}

	public void setNgayKTCLDK(LocalDate ngayKTCLDK) {
		this.ngayKTCLDK = ngayKTCLDK;
	}

	public int getCPThanhToanDK() {
		return CPThanhToanDK;
	}

	public void setCPThanhToanDK(int cPThanhToanDK) {
		CPThanhToanDK = cPThanhToanDK;
	}

	public LocalDate getNgayPhatBenh() {
		return ngayPhatBenh;
	}

	public void setNgayPhatBenh(LocalDate ngayPhatBenh) {
		this.ngayPhatBenh = ngayPhatBenh;
	}

	public LocalDate getNgayKTCLTT() {
		return ngayKTCLTT;
	}

	public void setNgayKTCLTT(LocalDate ngayKTCLTT) {
		this.ngayKTCLTT = ngayKTCLTT;
	}

	public TTdoiTuongModel() {
		super();
		// TODO Auto-generated constructor stub
	}




	public TTdoiTuongModel(int maTTCL, int maPhong, int maDT, String hoTen, String gioiTinh, LocalDate ngaySinh,
			String diaChi, String soDienThoai, LocalDate ngayTiepXucF0, LocalDate ngayBDCL, LocalDate ngayKTCLDK,
			int cPThanhToanDK) {
		super();
		this.maTTCL = maTTCL;
		this.maPhong = maPhong;
		this.maDT = maDT;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		DiaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.ngayTiepXucF0 = ngayTiepXucF0;
		this.ngayBDCL = ngayBDCL;
		this.ngayKTCLDK = ngayKTCLDK;
		CPThanhToanDK = cPThanhToanDK;
	}

	
	
	
	

}
