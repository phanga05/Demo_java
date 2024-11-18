package quanGianHang;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;

import Bank_Feature.ListAccount;
import Check.Check;
import NhanSu_Data.NhanSu;
import NhanSu_Data.NhanVienChinhThuc;

public class DanhSachTaiKhoan {
	protected HashMap<String, NhanSu> danhSachTaiKhoan = new HashMap<String, NhanSu>();
	private Scanner sc = new Scanner(System.in);
	Check ck = new Check();
	
	public void DangKi(ListAccount listPay) throws ParseException 
	{
		System.out.println("<<ĐĂNG KÍ TÀI KHOẢN MỚI>>");
		System.out.print("Nhập tài khoản (số điện thoại): ");
		String soTaiKhoan = sc.nextLine();
		if (danhSachTaiKhoan.containsKey(soTaiKhoan)) 
		{
			System.out.println("Số điện thoại đã được đăng kí!!!.");
            if (ck.Choice()) 
                return;
			System.out.println("---------");
		}
		NhanSu ns = new NhanSu() {
			@Override
			public double TinhLuong(int soCaLam) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		if(ns.Nhap(soTaiKhoan, listPay))
			return;
		this.danhSachTaiKhoan.put(soTaiKhoan, ns);
		System.out.println("Tạo tài khoản thành công");
		System.out.println("Nhấn ENTER để tiếp tục");
		sc.nextLine();
	}

	public void dangNhap(DanhSachGianHang dsgh) {
		System.out.print("Nhập số tài khoản: ");
		String soTaiKhoan = sc.nextLine();
		System.out.print("Nhập mật khẩu: ");
		String matKhau = sc.nextLine();
		NhanSu NhanSu = danhSachTaiKhoan.get(soTaiKhoan);
		if (NhanSu == null || NhanSu.getMatKhau().equals(matKhau)) {
			System.out.println("Số tài khoản hoặc mật khẩu không đúng!!!");
			return;
		}
		if(NhanSu.getGianHang()==null)
			menu(dsgh, NhanSu);
		else
		{
			if(NhanSu.getPhanQuyen().equals("NhanVien"))
				dsgh.getDanhSachGianHang().get(NhanSu.getGianHang()).menuNhanVien(NhanSu);
			else
				if(NhanSu.getPhanQuyen().equals("QuanLi"))
					dsgh.getDanhSachGianHang().get(NhanSu.getGianHang()).menuQuanLi(NhanSu);
				
				
		}
		
	}

	public void menu(DanhSachGianHang dsgh, NhanSu ns)
	{
		
	}
}
