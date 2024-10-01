package Tuan5;

import java.util.Scanner;

public class Tuan5_Bai1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử n trong mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Các phần tử trong mảng: ");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		int tong = 0;
		for(int i=0; i<n; i++)
			tong = tong + a[i];
		System.out.println("Tổng các phần tử trong mảng là: " + tong);
	}

}
