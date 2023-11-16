package vu.com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PhongCachLy {
	@Id
	private int maPhong;
	private String tenPhong;

	@ManyToOne
	@JoinColumn(name = "maTTCL")
	private TrungTamCachLy tamCachLy;

	@OneToMany(mappedBy = "maDT", cascade = CascadeType.ALL)
	private List<TTDoiTuong> ttDoiTuongs;

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

	public TrungTamCachLy getTamCachLy() {
		return tamCachLy;
	}

	public void setTamCachLy(TrungTamCachLy tamCachLy) {
		this.tamCachLy = tamCachLy;
	}

	public List<TTDoiTuong> getTtDoiTuongs() {
		return ttDoiTuongs;
	}

	public void setTtDoiTuongs(List<TTDoiTuong> ttDoiTuongs) {
		this.ttDoiTuongs = ttDoiTuongs;
	}

	public PhongCachLy() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
