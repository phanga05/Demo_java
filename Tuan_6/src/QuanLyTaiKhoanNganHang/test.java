package QuanLyTaiKhoanNganHang;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		ArrayList<TaiKhoanNganHang> listAccout = new ArrayList<TaiKhoanNganHang>();
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		while(choice != 0) {
			System.out.println("\n<<Trang Chủ>>");
			System.out.println("1: Đăng ký");
			System.out.println("2: Đăng nhập");
			System.out.println("0: Thoát");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: QuanLyTaiKhoan.dangKyTaiKhoan(listAccout);;break;
			case 2: QuanLyTaiKhoan.DangNhap(listAccout);;break;
			case 0: return;
			}
		}
	}
}
