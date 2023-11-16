package vu.com.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vu.com.entity.PhongCachLy;
import vu.com.entity.TTDoiTuong;
import vu.com.entity.TrungTamCachLy;
import vu.com.model.TTdoiTuongModel;

@Repository
public class TTDoiTuongRepository {
	@Autowired
	SessionFactory sessionFactory;

	public void insert(TTDoiTuong tModel) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(tModel);
	}

	public PhongCachLy getByID(int maPhong) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(PhongCachLy.class, maPhong);
	}

	public List<TTdoiTuongModel> tableDoiTuong() {
		Session session = sessionFactory.getCurrentSession();
//		String hql = "select new vu.com.model.TTdoiTuongModel(ttcl.maTTCL,pcl.maPhong,ttd.maDT, ttd.hoTen, ttd.gioiTinh, ttd.ngaySinh, ttd.DiaChi,"
//				+ "			ttd.soDienThoai, ttd.ngayTiepXucF0, ttd.ngayBDCL, ttd.ngayKTCLDK, ttd.CPThanhToanDK)"
//				+ " from TrungTamCachLy ttcl join ttcl.phongCachLies pcl join pcl.ttDoiTuongs ttd";
		String hql = "from TTDoiTuong";
		Query query = session.createQuery(hql);
		List<TTdoiTuongModel> listMode = query.getResultList();

		return listMode;
	}

	public List<TTdoiTuongModel> searchDoiTuong(int maTTCL, String hoTen) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select ttd "
				+ " from TrungTamCachLy ttcl join ttcl.phongCachLies pcl join pcl.ttDoiTuongs ttd where ttd.hoTen = :hoTen or ttcl.maTTCL = :maTTCL";
		Query query = session.createQuery(hql);
		query.setParameter("hoTen", hoTen);
		query.setParameter("maTTCL", maTTCL);
		List<TTdoiTuongModel> listMode = query.getResultList();
		System.out.println(listMode.size());
		return listMode;
	}

	public List<TTDoiTuong> updateDoiTuong(int maDT) {
		Session session = sessionFactory.getCurrentSession();
//		String hql = "select new vu.com.model.TTdoiTuongModel(ttcl.maTTCL,pcl.maPhong,ttd.maDT, ttd.hoTen, ttd.gioiTinh, ttd.ngaySinh, ttd.DiaChi,"
//				+ "			ttd.soDienThoai, ttd.ngayTiepXucF0, ttd.ngayBDCL, ttd.ngayKTCLDK, ttd.CPThanhToanDK)"
//				+ " from TrungTamCachLy ttcl join ttcl.phongCachLies pcl join pcl.ttDoiTuongs ttd where ttd.maDT = :maDT";
		String hql = "from TTDoiTuong ttd where ttd.maDT = :maDT";
		Query query = session.createQuery(hql);
		query.setParameter("maDT", maDT);
		List<TTDoiTuong> Update = query.getResultList();
		return Update;

	}

	public TTDoiTuong getByIDDoiTuong(int maDT) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(TTDoiTuong.class, maDT);

	}

	public void updateTTDoiTuong(String hoTen, String ngayPhatBenh) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "update TTDoiTuong ttd set ttd.hoTen = :hoTen, ttd.ngayPhatBenh = :ngayPhatBenh, ttd.ngayKTCLTT = :ngayKTCLTT ";
		Query query = session.createQuery(hql);
		query.setParameter("hoTen", hoTen);
		query.setParameter("ngayPhatBenh", LocalDate.parse(ngayPhatBenh));
		query.setParameter("ngayKTCLTT", LocalDate.parse(ngayPhatBenh));
		query.executeUpdate();

	}
	
	public void updateDoiTuongInRoom(String maPhong) {

		Session session = sessionFactory.getCurrentSession();

		String hql = "UPDATE ThongTinDoiTuong tt SET tt.ngayKTCLDK =  DATEADD(DAY,14,tt.ngayKTCLDK)"

				+ " WHERE tt.phongCachLy.maPhong =: maPhong";

		Query query = session.createQuery(hql);

		query.setParameter("maPhong", maPhong);

		query.executeUpdate();

	}
}
