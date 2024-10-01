package Tuan4;

import java.util.Scanner;

public class Tuan4_Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một số nguyên n bất kỳ: ");
		int n = sc.nextInt();
		int tong = 0;
		for(int i=1; i<=n; i++)
			tong = tong + i;
		System.out.println("Tổng các số từ 1 đến " + n + " là: " + tong);
	}

}
