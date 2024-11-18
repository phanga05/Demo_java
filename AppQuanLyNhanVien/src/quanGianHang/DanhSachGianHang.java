package quanGianHang;

import java.util.HashMap;

import NhanSu_Data.NhanSu;
import NhanSu_Data.QuanLi;

public class DanhSachGianHang {
	HashMap<String, GianHang> danhSachGianHang = new HashMap<String, GianHang>();

	public HashMap<String, GianHang> getDanhSachGianHang() {
		return danhSachGianHang;
	}

	public void setDanhSachGianHang(HashMap<String, GianHang> danhSachGianHang) {
		danhSachGianHang = danhSachGianHang;
	}

	public void TaoGianHang(DanhSachTaiKhoan dstk, NhanSu ns) {
		GianHang gh = new GianHang();
		if(gh.Nhap(dstk, this))
			return;
		NhanSu nsNew = new QuanLi(ns);
		dstk.danhSachTaiKhoan.remove(ns.getSoDienThoai());
		dstk.danhSachTaiKhoan.put(nsNew.getSoDienThoai(), nsNew);
	}
	

}
