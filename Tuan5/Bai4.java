package Tuan5;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bạn muốn nhập mãng có bao nhiêu phần tử?");
		int n = sc.nextInt();
		int[] mang = new int[n];
		for(int i = 0; i < mang.length; i++) {
			System.out.print("Nhập phần tử thứ "+ i +" : ");
			mang[i] = sc.nextInt();
		}
		int a = 1;
		int tg = mang[0];
		for (int i = 0; i < mang.length; i++) {
			int dem = 0;
			for (int j = 0; j < mang.length; j++) {
				if(mang[i] == mang[j])
					dem++;		
			}
			if(a < dem) {
				a = dem;
				tg = mang[i];
			}
		}
		System.out.println("Phần tử xuất hiện nhiều nhất trong mãng là: " + tg +"\n xuất hiện "+ a +" lần");
	}
}
