package Tuan5;

import java.util.Scanner;

public class Tuan5_Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử n trong mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Các phần tử trong mảng: ");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		for(int i=0; i<n/2; i++) {
			int tam = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = tam;
		}
		System.out.println("Mảng sau khi đảo ngược: ");
		for(int i=0; i<n; i++)
			System.out.println(a[i]);
			
	}

}
