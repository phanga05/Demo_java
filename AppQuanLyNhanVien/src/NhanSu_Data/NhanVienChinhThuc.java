package NhanSu_Data;

import java.time.LocalDate;
import java.util.Date;

import Bank_Feature.ListAccount;


public class NhanVienChinhThuc extends NhanSu {

    protected double phuCap = 120000;
    protected LocalDate ngayBatDau;

	public NhanVienChinhThuc(String id, String matKhau, String hoTen, String ngaySinh, String soDienThoai, String email,
			String diaChi, String soTaiKhoanNganHang, String tenTaiKhoanNganHang, double luongCoBan, double heSoLuong,String tenGianHang, String phanQuyen, String ngayBatDau, double phuCap) {
		super(id, matKhau, hoTen, ngaySinh, soDienThoai, email, diaChi, soTaiKhoanNganHang, tenTaiKhoanNganHang, heSoLuong, tenGianHang,
				phanQuyen);
		// TODO Auto-generated constructor stub
		this.luongCoBan = luongCoBan;
		this.ngayBatDau = LocalDate.parse(ngayBatDau);
		this.phuCap = phuCap;
	}
	
	//constructor dùng để thay đổi chức vụ
	public NhanVienChinhThuc(NhanSu ns) {
		super(ns);
		// TODO Auto-generated constructor stub
		this.luongCoBan = 15000;
		this.phanQuyen = "NhanVien";
		this.ngayBatDau = LocalDate.now();
	}

	public NhanVienChinhThuc(String id, String matKhau, String hoTen, String ngaySinh, String email, String diaChi,
			String soTaiKhoanNganHang, String tenTaiKhoanNganHang, String ngayBatDau, double phuCap) {
		super(id, matKhau, hoTen, ngaySinh, email, diaChi, soTaiKhoanNganHang, tenTaiKhoanNganHang);
		// TODO Auto-generated constructor stub
		this.luongCoBan = 150000;
		this.phanQuyen = "NhanVien";
		this.ngayBatDau = LocalDate.now();
	}
	
	public NhanVienChinhThuc() {
		super();
		this.luongCoBan = 150000;
		this.phanQuyen = "NhanVien";
		this.ngayBatDau = LocalDate.now();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double TinhLuong(int soCaLam) {
		// TODO Auto-generated method stub
		return this.heSoLuong*this.luongCoBan*soCaLam + this.phuCap;
	}

	@Override
	public void hienThiThongTin() {
		// TODO Auto-generated method stub
		super.hienThiThongTin();
        System.out.println("Lương cơ bản: \t" + this.luongCoBan + "VND/Ca");
		System.out.println("Phụ cấp: \t" + phuCap + "VND");
        System.out.println("Ngày bắt đầu: \t" + ngayBatDau);
	}

	@Override
	public boolean Nhap(String sdt, ListAccount listPay) {
		// TODO Auto-generated method stub
		super.Nhap(sdt, listPay);
		return false;
	}
	
	

}
