package Bai2;

import java.util.Scanner;

public class SinhVien {
	public String msv;
	public String ten;
	public String ngaySinh;
	public double dtb;
	
	public void NhapThongTin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin sinh vien. Gom: \nMa sinh vien: ");
		msv = sc.nextLine();
		System.out.println("Ten sinh vien: ");
		ten = sc.nextLine();
		System.out.println("Ngay sinh: ");
		ngaySinh = sc.nextLine();
		System.out.println("Diem trung binh: ");
		dtb = sc.nextDouble();
	}
	
	public void InThongTin()
	{
		System.out.println("Ma sinh vien: " + msv);
		System.out.println("Ten sinh vien: " + ten);
		System.out.println("Ngay sinh: " + ngaySinh);
		System.out.println("Diem trung binh: " + dtb);
	}

	 public double DiemTrungBinh() {
	        return dtb;
	    }
}
