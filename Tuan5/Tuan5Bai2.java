package Tuan5;

import java.util.Scanner;

public class Tuan5Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bạn muốn nhập mãng có bao nhiêu phần tử?");
		int n = sc.nextInt();
		int[] mang = new int[n];
		for(int i = 0; i < mang.length; i++) {
			System.out.print("Nhập phần tử thứ "+ i +" : ");
			mang[i] = sc.nextInt();
		}
		int i = 0;
		int j = mang.length - 1;
		while(j != i && j - i != 1) {
			int tg = mang[i];
			mang[i] = mang[j];
			mang[j] = tg;
			i++;
			j--;
		}
		System.out.println("Mãng sau khi được đảo ngược là: ");
		for (int i1 = 0;  i1 < mang.length; i1++) {
			System.out.println("Nhập phần tử thứ "+ i1 +" : "+ mang[i1]);
			
		}
	}
}
