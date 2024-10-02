package Tuan5;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bạn muốn nhập mãng có bao nhiêu phần tử?");
		int n = sc.nextInt();
		int[] mang = new int[n];
		for(int i = 0; i < mang.length; i++) {
			System.out.print("Nhập phần tử thứ "+ i +" : ");
			mang[i] = sc.nextInt();
		}
		for (int i = 0; i < mang.length; i++) {
			for (int j = i + 1; j < mang.length; j++) {
				if(mang[i] > mang[j])
				{
					int tg = mang[i];
					mang[i] = mang[j];
					mang[j] = tg;					
				}
			}
		}
		System.out.println("Mãng sau khi được sắp xếp là: ");
		for (int i = 0;  i < mang.length; i++) {
			System.out.println("Nhập phần tử thứ "+ i +" : "+ mang[i]);
			
		}
	}
}
