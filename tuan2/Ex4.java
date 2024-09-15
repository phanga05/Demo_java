package tuan2;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		float TongTien, Lai;
		Scanner sc = new Scanner(System.in);
		System.out.print("NHập số tiền gửi (đơn vị VND): ");
		float Tgoc = sc.nextFloat();
		System.out.print("Nhập lãi xuất trong 1 năm (đơn vị %): ");
		float Lxuat = sc.nextFloat();
		System.out.print("Nhập số tháng muốn gửi : ");
		int Thang = sc.nextInt();
		Lai = Tgoc * (Lxuat/1200) * Thang;
		TongTien = Tgoc + Lai;
		System.out.println("số tiền lãi là: " + Lai +"VND");
		System.out.println("Tổng tiền ở cuối kỳ là: " + TongTien +"VND");
	}
}
