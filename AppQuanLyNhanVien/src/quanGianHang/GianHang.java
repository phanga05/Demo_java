package quanGianHang;

import java.util.HashMap;
import java.util.Scanner;

import Check.Check;
import NhanSu_Data.NhanSu;
import NhanSu_Data.QuanLi;

public class GianHang {
	private String maGianHang;
	private String TenGianHang;
	private HashMap<String, NhanSu> danhSachChoDuyet = new HashMap<String, NhanSu>();
	private HashMap<String, NhanSu> danhSachNhanSu = new HashMap<String, NhanSu>();
	
	private Scanner sc = new Scanner(System.in);
	Check ck = new Check();

	public boolean Nhap(DanhSachTaiKhoan dstk, DanhSachGianHang dsgh) {
		while(true)
		{
			System.out.print("Nhập mã gian hàng: ");
			this.maGianHang = sc.nextLine();
			if(dsgh.danhSachGianHang.containsKey(this.maGianHang))
			{
				System.out.println("Gian hàng đa tồn tại!!!");
				if (ck.Choice()) 
	                return true;
				System.out.println("---------");
			}
			else 
				break;
			
		}
		System.out.println("Nhập tên gian hàng: ");
		this.TenGianHang = sc.nextLine();
		dsgh.danhSachGianHang.put(maGianHang, this);
		System.out.println("Tạo gian hàng thành công");
		System.out.println("Nhấn ENTER để tiếp tục");
		sc.nextLine();
		return false;
		}
	
	private void menu(NhanSu NhanSu) {
		while (true) {
			System.out.println("========Menu=======");
			System.out.println("\nChon chuc nang :");
			System.out.println("1. Hiển thị danh sách nhân sự");
			System.out.println("2. Tìm kiếm nhân sự");
			System.out.println("3. Xem lương của nhân sự");
			System.out.println("0. Thoat");
		}
	}

	private void timNhanSu(String soTaiKhoan) {
		NhanSu NhanSu = danhSachNhanSu.get(soTaiKhoan);
		if (NhanSu != null) {
			NhanSu.hienThiThongTin();
		} else {
			System.out.println("Khong tim thay tai khoan.");
		}
	}

	private void XoaTaiKhoan(String soTaiKhoan) {
		if (danhSachNhanSu.containsKey(soTaiKhoan)) {
			danhSachNhanSu.remove(soTaiKhoan);
			System.out.println("Da xoa thanh cong so tai khoan: " + soTaiKhoan);
		} else {
			System.out.println("Khong tim thay tai khoan co so tai khoan: " + soTaiKhoan);
		}

	}

	private double tinhLuong() {
		return 1;
	}

	private void chinhSuaThongTin() {

	}
	
	public void menuNhanVien(NhanSu nv)
	{
		
	}
	
	public void menuQuanLi(NhanSu ql)
	{
		
	}

}
