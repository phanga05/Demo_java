package Tuan5;

import java.util.Scanner;

public class Tuan5_Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử n trong mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Các phần tử trong mảng: ");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
	        // Tạo mảng đếm
	        int c[] = new int[a.length];
	        // Đếm số lần xuất hiện của mỗi phần tử
	        for (int i = 0; i < a.length; i++) {
	            c[a[i]]++;
	        }

	        // Tìm giá trị lớn nhất trong mảng đếm
	        int max = c[0];
	        int so = 0;
	        for (int i = 1; i < c.length; i++) {
	            if (c[i] > max) {
	                max = c[i];
	                so = i;
	            }
	        }

	        System.out.println("Phần tử xuất hiện nhiều nhất là: " + so + " với số lần xuất hiện là: " + max);
	     
	}

}
