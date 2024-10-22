package QuanLyTaiKhoanNganHang;

import java.util.Scanner;

public class TaiKhoanNganHang {
	private String soTaiKhoan;
	private String chuTaiKhoan;
	private double soDu;
	private String matKhau;
	
	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}
	public void setSoTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}
	public String getChuTaiKhoan() {
		return chuTaiKhoan;
	}
	public void setChuTaiKhoan(String chuTaiKhoan) {
		this.chuTaiKhoan = chuTaiKhoan;
	}
	public double getSoDu() {
		return soDu;
	}
	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public TaiKhoanNganHang() {	
	}
	public TaiKhoanNganHang(String soTaiKhoan, String chuTaiKhoan, String matKhau) {
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.chuTaiKhoan = chuTaiKhoan;
		this.soDu = 0;
		this.matKhau = matKhau;
	}
	public void GuiTien() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n<<Gửi tiền>>");
		System.out.print("Số tiền bạn muốn gửi là: ");
		float tienGui = sc.nextFloat();
		if(tienGui > 0)
		{
			this.soDu += tienGui;
			System.out.println("<<thành công>> Tài khoảng "+ this.soTaiKhoan +" | GD +"+ tienGui + "VND | Số dư :"+ this.soDu+"VND");
		}
		else 
			System.out.println("<<Thông báo>> Số tiền gửi không hợp lệ!!!");
	}
	public void RutTien() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n<<Rút tiền>>");
		System.out.print("\nSố tiền bạn muốn rút là: ");
		float tienRut = sc.nextFloat();
		if(tienRut <= this.soDu && tienRut > 0)
		{
			this.soDu -= tienRut;
			System.out.println("<<Thành công>> Tài khoảng "+ this.soTaiKhoan +" | GD -"+ tienRut + "VND | Số dư :"+ this.soDu+"VND");
		}
		else 
			{
			if(tienRut <= 0)
				System.out.println("<<Thông báo>> Số tiền Rủ không hợp lệ!!!");
			if(tienRut > soDu)
				System.out.println("<<Thông báo>> Số dư tài khoản của bạn không đủ!!!");
			}
		}
	public void kiemTraSoDu() {
		System.out.println("<<thành công>> Tài khoảng "+ this.soTaiKhoan +" | Số dư :"+ this.soDu +"VND");
	}
	public void rePassword() {
		Scanner sc = new Scanner(System.in);
		String mkc = null;
		int choice = 1;
		while(this.matKhau != mkc && choice != 0)
		{
			System.out.print("Nhập mật khẩu cũ: ");
			mkc = sc.nextLine();
			if(this.matKhau == mkc)
			{
				System.out.print("Nhập mật khẩu mới: ");
				String mkm = sc.nextLine();
				this.matKhau = mkm;
			}
			else
			{
				System.out.println("<<Thông báo>> Mật khẩu sai");
				System.out.println("Nhập 1 để nhập lại mật khẩu cũ hoặc nhập 0 để thoát");
				choice = sc.nextInt();
			}
				
		}
	}
}
