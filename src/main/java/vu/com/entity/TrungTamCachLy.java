package vu.com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TrungTamCachLy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maTTCL;
    private String tenTTCL;
    private String diaChiTT;
    private String phiCachLy;
    
    @OneToMany(mappedBy = "tamCachLy",cascade = CascadeType.ALL)
    private List<PhongCachLy>phongCachLies;

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

	public List<PhongCachLy> getPhongCachLies() {
		return phongCachLies;
	}

	public void setPhongCachLies(List<PhongCachLy> phongCachLies) {
		this.phongCachLies = phongCachLies;
	}

	public TrungTamCachLy() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	
    
}
