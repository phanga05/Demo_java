package Feature;

import java.text.ParseException;
import java.util.Scanner;

import Account.TaiKhoanThanhToan;
import Check.CheckInformation;
import Check.Choice;

public class User {
	Scanner sc = new Scanner(System.in);
	CheckInformation ck = new CheckInformation();
	Choice ch = new Choice();
	
	public void Pay(ListAccount list, String stk1)
	{
		String stk2;
		do
			{
			System.out.println("\n--------------------------------------------------");
			System.out.println("<<Chuyển tiền>>");
			System.out.println("---------");
			System.out.print("Nhập số tài khoản bạn muốn chuyển tiền đến: ");
			sc.nextLine();
			stk2 = sc.nextLine();
			if(!ck.CheckSdtAccount(list.list, stk2))
			{
				System.out.println("---------");
				System.out.println("Số tài khoản không tồn tại!!!");
				if(!ch.Revert())
					return;
			}
			else
			{
				System.out.println("---------");
				System.out.println("Mời kiểm tra lại thông tin người nhận:\n" + list.list.get(stk2));
				System.out.println("---------");
				System.out.println("1. Xác nhận");
				System.out.println("2. Nhập lại số tài khoản");
				System.out.println("0. Thoát");
				System.out.println("---------");
				System.out.print("Nhập lựa chọn của bạn: ");
				int check = sc.nextInt();
				if(check == 0)
					return;
				if(check == 1)
					break;
			}
		}
		while(true);
		System.out.println("---------");
		System.out.print("Nhập số tiền bạn muốn chuyển: ");
		double money = sc.nextDouble();
		sc.nextLine();
		do
		{
			System.out.print("Nhâp mã PIN: ");
			String maPIN = sc.nextLine();
			if(ck.CheckMaPIN(list.list.get(stk1).getMaPin(), maPIN))
				break;
			else 
			{
				System.out.println("Mã PIN sai!!!");
				if(!ch.Revert())
					return;
			}
		}
		while(true);
		System.out.println("---------");
		list.list.get(stk1).TruTien(money);
		list.list.get(stk2).CongTien(money);
		System.out.println("Nhấn ENTER để tiếp tục");
		sc.nextLine();
	}
	
	public void NapTien(ListAccount list, String stk1)
	{
		System.out.println("\n--------------------------------------------------");
		System.out.println("<<Nạp Tiền>>");
		do
		{
			System.out.print("Nhập mã địa điểm nạp tiền: ");
			sc.nextLine();
			String id = sc.nextLine();
			if(id.equals("123456"))
				break;
			else
			{
				System.out.println("Mã địa điểm không đúng!!!");
				if(!ch.Revert())
					return;
			}
		}
		while(true);
		System.out.print("Nhập số tiền bạn muốn nạp: ");
		double money = sc.nextDouble();
		do
		{
			System.out.print("Nhâp mã PIN: ");
			sc.nextLine();
			String maPIN = sc.nextLine();
			if(ck.CheckMaPIN(list.list.get(stk1).getMaPin(), maPIN))
				break;
			else 
			{
				System.out.println("Mã PIN sai!!!");
				if(!ch.Revert())
					return;
			}
		}
		while(true);
		list.list.get(stk1).CongTien(money);
		System.out.println("Nhấn ENTER để tiếp tục");
		sc.nextLine();
	}
	
	public void RutTien(ListAccount list, String stk1)
	{
		System.out.println("\n--------------------------------------------------");
		System.out.println("<<Rút Tiền>>");
		System.out.println("Số dư hiện tại: "+ list.list.get(stk1).getSoDu());
		do
		{
			System.out.print("Nhập mã địa điểm nạp tiền: ");
			sc.nextLine();
			String id = sc.nextLine();
			if(id.equals("123456"))
				break;
			else
			{
				System.out.println("Mã địa điểm không đúng!!!");
				if(!ch.Revert())
					return;
			}
		}
		while(true);
		System.out.println("Nhập số tiền bạn muốn rút: ");
		double money = sc.nextDouble();
		do
		{
			System.out.print("Nhâp mã PIN: ");
			String maPIN = sc.nextLine();
			if(ck.CheckMaPIN(list.list.get(stk1).getMaPin(), maPIN))
				break;
			else 
			{
				System.out.println("Mã PIN sai!!!");
				if(!ch.Revert())
					return;
			}
		}
		while(true);
		list.list.get(stk1).TruTien(money);
		System.out.println("Nhấn ENTER để tiếp tục");
		sc.nextLine();
	}
	
	public void ListFeatrueUser(ListAccount list, String stk) throws ParseException
	{
		do 
		{
			System.out.println("\n--------------------------------------------------");
			System.out.println("Số tài khoản: "+ list.list.get(stk).getSoTaiKhoan() +"\nChủ tài khoản: "+ list.list.get(stk).getTenChuTaiKhoan());
			System.out.println("---------");
			System.out.println("1. Chuyển khoản");
			System.out.println("2. Nạp tiền");
			System.out.println("3. Rút tiền");
			System.out.println("4. Đổi mật khẩu");
			System.out.println("5. Đổi mã PIN");
			System.out.println("6. Tài khoản tiết kiệm");
			System.out.println("0. Đăng xuất");
			System.out.println("---------");
			System.out.print("Nhập lựa chọn của bạn: ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 : Pay(list, stk);break;
				case 2 : NapTien(list, stk);break;
				case 3 : RutTien(list, stk);break;
				case 4 : break;
				case 5 : break;
				case 6 : list.list.get(stk).TaiKhoanTietKiem();break;
				case 0 : return;
			}
		}
		while(true);
	}
	
}
