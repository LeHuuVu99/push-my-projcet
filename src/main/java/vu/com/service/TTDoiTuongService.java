package vu.com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vu.com.entity.PhongCachLy;
import vu.com.entity.TTDoiTuong;
import vu.com.model.TTdoiTuongModel;
import vu.com.repository.TTDoiTuongRepository;

@Service
public class TTDoiTuongService {

	@Autowired
	TTDoiTuongRepository doiTuongRepository;

	@Transactional
	public void insert(TTDoiTuong tModel) {
		doiTuongRepository.insert(tModel);
	}
	@Transactional
	public List<TTdoiTuongModel>tableDoiTuong(){
		return doiTuongRepository.tableDoiTuong();
	}
	@Transactional
	public List<TTdoiTuongModel>searchDoiTuong(int maTTCL, String hoTen){
		return doiTuongRepository.searchDoiTuong(maTTCL, hoTen);
	}
	@Transactional
	public List<TTDoiTuong> updateDoiTuong(int maDT) {
		return doiTuongRepository.updateDoiTuong(maDT);
	}
	@Transactional
	public void updateTTDoiTuong(String hoTen, String ngayPhatBenh) {
		doiTuongRepository.updateTTDoiTuong(hoTen,ngayPhatBenh);
	}
	@Transactional
	public PhongCachLy getByID(int maPhong) {
		return doiTuongRepository.getByID(maPhong);
	}
	@Transactional
	public TTDoiTuong getByIDDoiTuong(int maDT) {
		return doiTuongRepository.getByIDDoiTuong(maDT);
	}

}
