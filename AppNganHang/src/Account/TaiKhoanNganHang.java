package Account;

import java.text.ParseException;
import java.util.Scanner;

import Check.CheckInformation;
import Check.Choice;

public class TaiKhoanNganHang {
	Scanner sc = new Scanner(System.in);
	CheckInformation ck = new CheckInformation();
	Choice ch = new Choice();
	@Override
	public String toString() {
		return "Số tài khoản: " + soTaiKhoan + "\nChủ tài khoản: "+ tenChuTaiKhoan ;
	}

	protected String soTaiKhoan;
	protected String matKhau;
	protected String tenChuTaiKhoan;
	protected double soDu;
	protected String maPin;
	TaiKhoanTietKiem tktk;
	
	
	
	public TaiKhoanTietKiem getTktk() {
		return tktk;
	}

	public void setTktk(TaiKhoanTietKiem tktk) {
		this.tktk = tktk;
	}

	public void setSoTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
		this.tenChuTaiKhoan = tenChuTaiKhoan;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}

	public void setMaPin(String maPin) {
		this.maPin = maPin;
	}

	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public String getTenChuTaiKhoan() {
		return tenChuTaiKhoan;
	}

	public double getSoDu() {
		return soDu;
	}

	public String getMaPin() {
		return maPin;
	}

	public TaiKhoanNganHang() {
	}

	public TaiKhoanNganHang(String soTaiKhoan, String matKhau, String tenChuTaiKhoan, double soDu, String maPin) 
	{
		this.soTaiKhoan = soTaiKhoan;
		this.matKhau = matKhau;
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soDu = soDu;
		this.maPin = maPin;
	}

	public void CreatAccout()
	{
		soTaiKhoan = sc.nextLine();
		matKhau = sc.nextLine();
		tenChuTaiKhoan = sc.nextLine();
		soDu = sc.nextDouble();
		maPin = sc.nextLine();
	}
	
	public void CongTien(double x) 
	{
		if(x <= 0) 
		{
			System.out.println("Số tiền ko hợp lệ");
			return;
		}
		this.soDu += x;
		System.out.println("<<Thông báo>>\n Giao dịch thành công");
		System.out.println("Tài khoản " + soTaiKhoan + " - " + tenChuTaiKhoan);
		System.out.println("GD: +" + x + "VND");
	}
	
	public void TruTien(double x) 
	{
		if(x > this.soDu) 
		{
			System.out.println("Số tiền ko hợp lệ");
			return;
		}
		this.soDu += x;
		System.out.println("<<Thông báo>>\n Giao dịch thành công");
		System.out.println("Tài khoản " + soTaiKhoan + " - " + tenChuTaiKhoan);
		System.out.println("GD: -" + x + "VND");
	}
	
	public void TaiKhoanTietKiem() throws ParseException
	{
		int choice;
		if(this.tktk == null)
		{
			System.out.println("\n--------------------------------------------------");
			System.out.println("Bạn có muốn mở tài khoản tiết kiệm không?");
			System.out.println("1.Mở tài khoản tiết kiệm");
			System.out.println("0. thoát");
			System.out.println("---------");
			System.out.print("Nhập lựa chọn của bạn: ");
			choice = sc.nextInt();
			if(choice == 1)
			{
				System.out.println("\n--------------------------------------------------");
				System.out.println("<<Mở tài khoản tiết kiệm>>");
				System.out.print("Nhập mã pin cho tài khoản tiết kiệm: ");
				sc.nextLine();
				String maPIN = sc.nextLine();
				tktk = new TaiKhoanTietKiem(soTaiKhoan, matKhau, tenChuTaiKhoan, 0, maPIN);
				tktk.ChonKyHan();
				System.out.println("---------");
				System.out.println("Mở tài khoản thành công");
				System.out.println("Nhấn ENTER để tiếp tục");
				sc.nextLine();
			}
			else
				return;
		}
		if(tktk != null)
		{
			do
			{
				System.out.println("\n--------------------------------------------------");
				System.out.println("<<Tài khoản tiết kiệm>>");
				System.out.print("Nhâp mã PIN: ");
				String maPINp = sc.nextLine();
				if(ck.CheckMaPIN(this.tktk.maPin, maPINp))
				{
					do 
					{
						System.out.println("\n--------------------------------------------------");
						tktk.TinhLai();
						System.out.println("\n--------------------------------------------------");
						System.out.println("<<Tài khoản tiết kiệm>>");
						System.out.println("1. Nạp tiền");
						System.out.println("2. Rút tiền");
						System.out.println("3. Tính tổng tiền lãi");
						System.out.println("---------");
						System.out.print("Nhập lựa chọn của bạn: ");
						choice = sc.nextInt();
						switch(choice)
						{
							case 1: 
							{
								System.out.println("---------");
								System.out.println("Số dư tài khoản chính: "+ soDu + "VND");
								System.out.print("Nhập số tiền bạn muốn nạp từ tài khoản chính: ");
								double money = sc.nextDouble();
								do
								{
									System.out.print("Nhâp mã PIN của tài khoản chính: ");
									sc.nextLine();
									String maPINc = sc.nextLine();
									if(!ck.CheckMaPIN(this.maPin,maPINc))
									{
										System.out.println("Mã PIN sai!!!");
										if(!ch.Revert())
											return;
									}
									else
										break;
								}
								while(true);
								System.out.println("---------");
								System.out.println("Tài khoản chính");
								this.TruTien(money);
								System.out.println("---------");
								System.out.println("Tài khoản tiết kiệm");
								tktk.CongTien(money);
								System.out.println("Nhấn ENTER để tiếp tục");
								sc.nextLine();
							}break;
							case 2: 
							{
								System.out.println("---------");
								System.out.println("Số dư sổ tiết kiệm: "+ tktk.soDu + "VND");
								System.out.print("Nhập số tiền bạn muốn rút về tài khoản chính: ");
								double money = sc.nextDouble();
								do
								{
									System.out.print("Nhâp mã PIN của sổ tiết kiệm: ");
									sc.nextLine();
									maPINp = sc.nextLine();
									if(!ck.CheckMaPIN(tktk.maPin,maPINp))
									{
										System.out.println("Mã PIN sai!!!");
										if(!ch.Revert())
											return;
									}
									else
										break;
								}
								while(true);
								System.out.println("Tài khoản chính");
								this.CongTien(money);
								System.out.println("Tài khoản tiết kiệm");
								tktk.TruTien(money);
								System.out.println("Nhấn ENTER để tiếp tục");
								sc.nextLine();
							}break;
							case 3 : 
								System.out.println("---------");
								System.out.println("Tổng tiền lãi tính từ ngày "+ tktk.getNgayBdGui().getTime() + "đến ngày "+ tktk.getNgayTinhLai().getTime());
								System.out.println("Tổng tiền: "+ tktk.getTongTienLai()+ "VND");
								System.out.println("Nhấn ENTER để tiếp tục");
								sc.nextLine();
								sc.nextLine();
								break;
							case 0: return;
						}
					}
					while(true);
				}
				else
				{
					System.out.println("Mã PIN sai!!!");
					if(!ch.Revert())
						return;
				}
				
			}
			while(true);
		}
	}
	
	
}
