package Bai2V2;

import java.util.Scanner;

public class SinhVien implements Comparable<SinhVien>{
	public String msv;
	public String ten;
	public String ngaySinh;
	public double dtb;
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã sinh viên: ");
		msv = sc.nextLine();
		System.out.print("Nhập tên: ");
		ten = sc.nextLine();
		System.out.print("Nhập ngày sinh: ");
		ngaySinh = sc.nextLine();
		System.out.print("Nhập điểm trung bình: ");
		dtb = sc.nextDouble();
		System.out.println("\n");
	}
	
	public void Xuat() {
		System.out.print("Mã sinh viên: "+ msv +"\n");
		System.out.print("Tên: "+ ten +"\n");
		System.out.print("Ngày sinh: "+ ngaySinh +"\n");
		System.out.print("Điểm trung bình: "+ dtb +"\n");
		System.out.println("\n");
	}

	@Override
//	public int compareTo(SinhVien o) {
//		// TODO Auto-generated method stub
//		if(this.dtb < o.dtb)
//			return -1;
//		if(this.dtb > o.dtb)
//			return 1;
//		return 0;
//	}
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return this.ten.compareToIgnoreCase(ten);
	}
}
