package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Account.TaiKhoanNganHang;
import Account.TaiKhoanThanhToan;
import Account.TaiKhoanTietKiem;
import Feature.ListAccount;

public class test {
	public static void main(String[] args) throws ParseException {
		ListAccount listPay = new ListAccount();
		
		//Nhập Liệu 
		TaiKhoanNganHang tk1 = new TaiKhoanThanhToan("0326143986", "Huy123456@", "TRAN DINH MANH HUY", 1540000, "220522");
		listPay.list.put(tk1.getSoTaiKhoan(), tk1);
		TaiKhoanTietKiem tktk1= new TaiKhoanTietKiem("0326143986", "Huy123456@", "TRAN DINH MANH HUY", 1000000, "123123", "1 Tháng", (float) 0.0025, "12/03/2023", "25/6/2024");
		tk1.setTktk(tktk1); 
		TaiKhoanNganHang tk2 = new TaiKhoanThanhToan("0326143987", "An123456@", "NGUYEN PHUC AN", 2034000, "220522");
		listPay.list.put(tk2.getSoTaiKhoan(), tk2);
		TaiKhoanTietKiem tktk2= new TaiKhoanTietKiem("0326143987", "An123456@", "NGUYEN PHUC AN", 1000000, "123123", "1 Tháng", (float) 0.0025, "12/08/2023", "25/10/2024");
		tk1.setTktk(tktk2); 
		TaiKhoanNganHang tk3 = new TaiKhoanThanhToan("0326143988", "Ha123456@", "NGUYEN CONG MINH", 1120000, "220522");
		listPay.list.put(tk3.getSoTaiKhoan(), tk3);
		TaiKhoanTietKiem tktk3= new TaiKhoanTietKiem("0326143988", "Ha123456@", "NGUYEN CONG MINH", 1000000, "123123", "1 Tháng", (float) 0.0025, "12/07/2023", "25/09/2024");
		tk1.setTktk(tktk3); 
		TaiKhoanNganHang tk4 = new TaiKhoanThanhToan("0326143989", "Minh123456@", "HO THI MY HA", 1000000, "220522");
		listPay.list.put(tk4.getSoTaiKhoan(), tk4);
		TaiKhoanTietKiem tktk4= new TaiKhoanTietKiem("0326143989", "Minh123456@", "HO THI MY HA", 1000000, "123123", "1 Tháng", (float) 0.0025, "12/08/2023", "25/08/2024");
		tk1.setTktk(tktk4); 
		
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		do
		{
			System.out.println("<<Trang Chủ>>");
			System.out.println("1. Đăng Nhập");
			System.out.println("2. Đăng ký");
			System.out.println("0. Thoát");
			System.out.println("---------");
			System.out.print("Nhập lựa chọn của bạn: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1 : listPay.LogIn();break;
			case 2 : listPay.SignIn();break;
			case 0 : return;
			}
		}
		while(true);
	}
}
