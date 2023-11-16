package vu.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vu.com.entity.PhongCachLy;
import vu.com.entity.TTDoiTuong;
import vu.com.model.TTdoiTuongModel;
import vu.com.service.TTDoiTuongService;

@Controller
public class TTDoiTuongController {

	@Autowired
	TTDoiTuongService ttTuongService;

	@GetMapping(value = { "/", "/addPage" })
	public String indexPase(Model mode, @ModelAttribute(name = "TTdoiTuongModel") TTdoiTuongModel doTuongModel) {
		return "AddDoiTuong";
	}

	@PostMapping(value = { "/addDoiTuong" })
	public String addDoiTuong(Model mode, @ModelAttribute(name = "TTdoiTuong") TTDoiTuong doTuongModel,
			@RequestParam(name = "maPhong") int maPhong) {
		PhongCachLy pcl = ttTuongService.getByID(maPhong);
		doTuongModel.setPhongCachLy(pcl);
		ttTuongService.insert(doTuongModel);
		return "redirect:/tableDoiTuong";
	}

	@GetMapping(value = { "/tableDoiTuong" })
	public String tableDoiTuong(Model mode, @ModelAttribute(name = "TTdoiTuongModel") TTdoiTuongModel doTuongModel) {
		List<TTdoiTuongModel> listDoiTuong = ttTuongService.tableDoiTuong();
		mode.addAttribute("listDoiTuong", listDoiTuong);
		return "tablelist";
	}

	@GetMapping(value = { "/searchDoiTuong" })
	public String searchDoiTuong(Model mode, @ModelAttribute(name = "TTdoiTuongModel") TTdoiTuongModel doTuongModel,
			@RequestParam(name = "maTTCL") int maTTCL, @RequestParam(name = "hoTen") String hoTen) {
		List<TTdoiTuongModel> listDoiTuong = ttTuongService.searchDoiTuong(maTTCL, hoTen);
		mode.addAttribute("listSearchDoiTuong", listDoiTuong);
		doTuongModel.setHoTen("");
		doTuongModel.setMaTTCL(0);
		return "tablelist";
	}

	@GetMapping(value = { "/formUpdatehDoiTuong" })
	public String updateDoiTuong(Model mode, @ModelAttribute(name = "TTDoiTuong") TTDoiTuong doTuongModel) {
		int maDT = doTuongModel.getMaDT();
		List<TTDoiTuong> tdoiTuongModel = ttTuongService.updateDoiTuong(maDT);
		mode.addAttribute(tdoiTuongModel);
		return "updateForm";
	}

	@PostMapping(value = { "/UpdatehDoiTuong" })
	public String saveUpdateDoiTuong(Model model, @ModelAttribute(name = "TTdoiTuongModel") TTDoiTuong ttDoiTuong,
			@RequestParam(name = "ngayPhatBenh") String ngayPhatBenh, @RequestParam(name = "hoTen") String hoTen) {		
		ttTuongService.updateTTDoiTuong(hoTen,ngayPhatBenh);
		return "redirect:/tableDoiTuong";
	}

}
