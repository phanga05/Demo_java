package Tuan5;

import java.util.Scanner;

public class Tuan5Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tg =0;
		System.out.println("Bạn muốn nhập mảng có bao nhiêu phần tử?");
		int n = sc.nextInt();
		int[] mang = new int[n];
		for(int i = 0; i < mang.length; i++) {
			System.out.print("Nhập phần tử thứ "+ i +" : ");
			mang[i] = sc.nextInt();
		}
		for (int i = 1; i < mang.length; i++) {
			tg += mang[i];
		}
		System.out.println("Tổng của mảng bạn vừa nhập là: "+ tg);
	}
}
