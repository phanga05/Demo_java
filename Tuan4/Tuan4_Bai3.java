package Tuan4;

import java.util.Scanner;

public class Tuan4_Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một số nguyên n bất kỳ: ");
		int n = sc.nextInt();
		int gthua = 1;
		for(int i=2; i<=n; i++)
			gthua = gthua*i;
		System.out.println("Giai thừa của " + n + " là: " + n + "! = " + gthua);
	}

}
