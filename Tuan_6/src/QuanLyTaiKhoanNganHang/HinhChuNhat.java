package QuanLyTaiKhoanNganHang;

import java.util.Scanner;

public class HinhChuNhat {
	protected float Dai;
	protected float Rong;
	
	public HinhChuNhat(float dai, float rong) {
		Dai = dai;
		Rong = rong;
	}
	
	public HinhChuNhat(HinhChuNhat hcn) {
		this.Dai = hcn.Dai;
		this.Rong = hcn.Rong;
	}
	
	public HinhChuNhat() {
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chiều dài :");
		this.Dai = sc.nextFloat();
		System.out.print("Nhập chiều rộng :");
		this.Rong = sc.nextFloat();
	}
	
	public void tinhDienTich() {
		System.out.println("Diện tích hình chữ nhật là: "+ this.Dai*this.Rong);
	}
	
	public void tinhChuVi() {
		System.out.println("Chu vi hình chữ nhật là: "+ (this.Dai+this.Rong)*2);
	}
}
