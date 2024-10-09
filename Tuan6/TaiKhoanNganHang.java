package Tuan6;

import java.util.Scanner;

public class TaiKhoanNganHang {
	protected int soTaiKhoan;
	protected String chuTaiKhoan;
	protected double soDu;

	public TaiKhoanNganHang(int soTaiKhoan, String chuTaiKhoan, double soDu) {
		this.soTaiKhoan = soTaiKhoan;
		this.chuTaiKhoan = chuTaiKhoan;
		this.soDu = soDu;
	}
	public TaiKhoanNganHang(TaiKhoanNganHang tk) {
		this.soTaiKhoan = tk.soTaiKhoan;
		this.chuTaiKhoan = tk.chuTaiKhoan;
		this.soDu = tk.soDu;
	}
	public TaiKhoanNganHang() {	
	}
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số tài khoản: ");
		this.soTaiKhoan = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập tên chủ tài khoản: ");
		this.chuTaiKhoan = sc.nextLine();
		System.out.print("Nhập số dư: ");
		this.soDu = sc.nextDouble();
	}
	public void GuiTien(double tienGui) {
		this.soDu += tienGui;
		System.out.println("Tài khoảng "+ this.soTaiKhoan +" | GD +"+ tienGui + "VND | Số dư :"+ this.soDu+"VND");
	}
	public void rutTien(double tienRut) {
		this.soDu -= tienRut;
		System.out.println("Tài khoảng "+ this.soTaiKhoan +" | GD -"+ tienRut + "VND | Số dư :"+ this.soDu+"VND");
	}
	public void kiemTraSoDu() {
		System.out.println("Tài khoảng "+ this.soTaiKhoan +" | Số dư :"+ this.soDu +"VND");
	}
}
