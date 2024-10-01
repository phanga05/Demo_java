package Tuan5;

import java.util.Scanner;

public class Tuan5_Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử n trong mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Các phần tử trong mảng: ");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		System.out.println("Dãy số được sắp xếp tăng dần: ");
		SAPXEP(a);
		
		
		
	}
	public static void SAPXEP(int a[]) {
		int tam = a[0];
		for(int i=0; i<a.length-1; i++)
			for(int j=i+1; j<a.length; j++) 
				if(a[i]>a[j]) {
					tam = a[j];
					a[j] = a[i];
					a[i] = tam;
				}
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
			
	}

}
