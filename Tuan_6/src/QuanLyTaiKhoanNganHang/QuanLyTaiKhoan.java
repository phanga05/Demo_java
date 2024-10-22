package QuanLyTaiKhoanNganHang;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTaiKhoan {
	public static void dangKyTaiKhoan(ArrayList<TaiKhoanNganHang> list) {
		System.out.println("\n<<Đăng ký tài khoản>>");
		Scanner sc = new Scanner(System.in);
		int check = 1;
		int i;
		String soTaiKhoan = null;
		String mk1;
		while(check == 1) 
		{
		System.out.print("Nhập số tài khoản: ");
		soTaiKhoan = sc.nextLine();
		for (i = 0; i < list.size(); i++) 
			if(list.get(i).getSoTaiKhoan().equals(soTaiKhoan))
			{
				System.out.println("<<Thông báo>> Số tài khoản đã tồn tại!!!\n");
				System.out.println("1: Nhập lại số tài khoản  \n0: Thoát");
		 		check = sc.nextInt();
		 		break;
			}
		if(check == 0)
			return;
		if(i == list.size() || list.size() == 0)
			break;
		sc.nextLine();
		}
		System.out.print("Nhập tên chủ tài khoản: ");
		String chuTaiKhoan = sc.nextLine();
		while(check == 1) 
		{
			System.out.print("Nhập mật khẩu: ");
			mk1 = sc.nextLine();
			System.out.print("Nhập lại mật khẩu: ");
			String mk2 = sc.nextLine();
			if( mk1.equals(mk2)) 
			{
				TaiKhoanNganHang newAccout = new TaiKhoanNganHang(soTaiKhoan, chuTaiKhoan, mk1);
				list.add(newAccout);
				System.out.println("\n<<Hoàn thành>> Tạo tài khoản thành công");
				break;
			}
			else
			{
				System.out.println("\n<<Thông báo>> Mật khẩu xác nhận sai");
				System.out.println("1: Nhập lại mật khẩu  \n0: Thoát");
				check = sc.nextInt();
				sc.nextLine();
			}
		}
		if(check == 0)
			return;
	}
	public static void xoaTaiKhoan(ArrayList<TaiKhoanNganHang> list, TaiKhoanNganHang tk) 
	{
		Scanner sc = new Scanner(System.in);
		int check = 1;
		System.out.println("Bạn muốn xóa tài khoản?");
		System.out.println("1: Xác nhận xóa tài khoản  \n0: Thoát");
		check = sc.nextInt();
		sc.nextLine();
		if(check == 0)
			return;
		for (int i = 0; i < list.size(); i++) 
			if(list.get(i).getSoTaiKhoan().equals(tk.getSoTaiKhoan()))
			{
				while(check == 1)
				{
					System.out.println("Mật khẩu xác nhận: ");
					String mk = sc.nextLine();
					if(mk.equals(tk.getMatKhau()))
					{
						list.remove(i);
						System.out.println("Xóa tài khoản thành công");
						return;
					}
					else
					{
						System.out.println("<>Thông báo>> Mật khẩu sai\n");
						System.out.println("1: Nhập lại mật khẩu  \n0: Thoát");
						check = sc.nextInt();
						sc.nextLine();
					}
					if(check == 0)
						return;
				}
			}
	}
	public static void DangNhap(ArrayList<TaiKhoanNganHang> list) {
		Scanner sc = new Scanner(System.in);
		if(list.size() == 0)
		{
			System.out.println("<<Thông báo>> Chưa có tài khoản nào được tạo");
			return;
		}
		System.out.println("\n<<Đăng nhập>>");
		int check = 1;
		int i;
		while(check == 1)
		{
			System.out.print("Nhập số tài khoản: ");
			String soTaiKhoan = sc.nextLine();
			for (i = 0; i < list.size(); i++)
			{
				if(list.get(i).getSoTaiKhoan().equals(soTaiKhoan))
				{
					while(check == 1)
					{
						System.out.println("Mật khẩu: ");
						String mk = sc.nextLine();
						if(mk.equals(list.get(i).getMatKhau()))
						{
							System.out.println("\n<<Đăng nhập thành công>>");
							quyenTaiKhoan(list, list.get(i));
							return;
						}
						else
						{
							System.out.println("\n<<Thông báo>> Mật khẩu sai");
							System.out.println("1: Nhập lại mật khẩu  \n0: Thoát");
							check = sc.nextInt();
							sc.nextLine();
						}
						if(check == 0)
							return;
					}		
				}
			}
			if(i == list.size())
			{
				System.out.println("<<Thông báo>> Tài khoản không tồn tài");
				System.out.println("1: Nhập lại số tài khoản  \n0: Thoát");
				check = sc.nextInt();
				sc.nextLine();
				if(check == 0)
					return;
			}
		}
	}
	public static void quyenTaiKhoan(ArrayList<TaiKhoanNganHang> list, TaiKhoanNganHang tk) {
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		while(choice != 0) {
			System.out.println("\n<<Tên Tài Khoản: "+ tk.getChuTaiKhoan() +">>");
			System.out.println("1: Kiểm tra số dư");
			System.out.println("2: Gửi tiền");
			System.out.println("3: Rút tiền");
			System.out.println("4: Xóa tài khoản");
			System.out.println("0: Đăng xuất");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: tk.kiemTraSoDu();
					System.out.println("nhấn phím ENTER để thoát");
					sc.nextLine();
					sc.nextLine();
					break;
			case 2: tk.GuiTien();
					System.out.println("nhấn phím ENTER để thoát");
					sc.nextLine();
					sc.nextLine();
					break;
			case 3: tk.RutTien();
					System.out.println("nhấn phím ENTER để thoát");
					sc.nextLine();
					sc.nextLine();
					break;
			case 4: xoaTaiKhoan(list, tk); return;
			case 0: return;
			}
		}
	}
}
