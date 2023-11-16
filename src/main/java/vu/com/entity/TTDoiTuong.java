package vu.com.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class TTDoiTuong {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@ManyToOne
	@JoinColumn(name = "maPhong")
	private PhongCachLy phongCachLy;
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
	public PhongCachLy getPhongCachLy() {
		return phongCachLy;
	}
	public void setPhongCachLy(PhongCachLy phongCachLy) {
		this.phongCachLy = phongCachLy;
	}
	public TTDoiTuong() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
