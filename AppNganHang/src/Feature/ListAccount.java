package Feature;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;

import Account.TaiKhoanNganHang;
import Account.TaiKhoanThanhToan;
import Check.CheckInformation;
import Check.Choice;

public class ListAccount {
	public HashMap<String, TaiKhoanNganHang> list;
	Scanner sc = new Scanner(System.in);
	Choice ch = new Choice();
	CheckInformation ck = new CheckInformation();
	
	public ListAccount() 
	{
		this.list = new HashMap<String, TaiKhoanNganHang>();
	}

	public void SignIn()
	{
		
		String sdt;
		String maPIN;
		String tenChuTaiKhoan;
		String mk;

		System.out.println("\n--------------------------------------------------");
		System.out.println("<<Tạo Tài Khoản Mới>>");
		do
		{
			System.out.print("Nhập số điện thoai (Sẽ là số tài khoản đăng nhập của bạn): ");
			sdt = sc.nextLine();
			if(!ck.CheckFormatSdt(sdt))
			{
				System.out.println("Bạn đã nhập sai!!! Số điện thoai gồm 10 ký tự số phải bắt đầu bằng số 0 ");
				if(!ch.Revert())
					return;
			}
			else
				if(ck.CheckSdtAccount(list, sdt))
				{
					System.out.println("Số điện thoại đã được sử dụng!!!");
					if(!ch.Revert())
						return;
				}
				else
					break;
		}
		while(true);
		System.out.print("Nhập tên chủ tài khoản: ");
		tenChuTaiKhoan = sc.nextLine();
		do
		{
			do
			{
				System.out.println("Lưu ý: Mật khẩu phải có kí tự thường, kí tự hoa, kí tự số và kí tự đặc biệt!!!");
				System.out.print("Nhập mật khẩu của bạn : ");
				mk = sc.nextLine();

				if(!ck.CheckPassword(mk))
				{
					System.out.println("Mật khẩu yếu!!!");
					if(!ch.Revert())
						return;
				}
				else
					break;
			}
			while(true);
				System.out.print("Nhập lại mật khẩu của bạn : ");
				String mkxn = sc.nextLine();
				if(mk.equals(mkxn))
					break;
				else 
				{
					System.out.println("Mật khẩu xác nhận sai");
					if(!ch.Revert())
						return;
				}
		}
		while(true);
		do
		{
			System.out.print("Nhập mã PIN gồm 6 chữ số: ");
			maPIN = sc.nextLine();
			if(ck.CheckMaPIN(maPIN))
				break;
			else
			{
				System.out.println("Mã PIN không đúng yêu cầu!!!");
				if(!ch.Revert())
					return;
			}
		}
		while(true);
		TaiKhoanThanhToan tk = new TaiKhoanThanhToan(sdt, mk, tenChuTaiKhoan, 0, maPIN);
		list.put(sdt, tk);
		System.out.println("Tạo tài khoản thành công");
		System.out.println("Nhấn ENTER để tiếp tục");
		sc.nextLine();
	}
	
	public void LogIn() throws ParseException 
	{	
		System.out.println("\n--------------------------------------------------");
		System.out.println("<<Đăng Nhập>>");
		do 
		{
			System.out.println("---------");
			System.out.print("Số tài khoản: ");
			String Stk = sc.nextLine();
			System.out.print("Mật khẩu: ");
			String mk = sc.nextLine();
			if(!list.containsKey(Stk))
			{
				System.out.println("Số tài khoản chưa được đăng ký");
				if(!ch.Revert())
					return;
			}
			else
				if(!ck.CheckLogIn(this, Stk, mk))
				{
					System.out.println("---------");
					System.out.println("Mật khẩu sai!!!");
					if(!ch.Revert())
						return;
				}
				else
				{
					System.out.println("---------");
					System.out.println("Đăng nhập thành công");
					System.out.println("Nhấn ENTER để tiếp tục");
					sc.nextLine();
					User user = new User();
					user.ListFeatrueUser(this, Stk);
					return;
				}
			
		}
		while(true);
	}
	
}
