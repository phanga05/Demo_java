package Tuan4;

import java.util.Scanner;

public class Tuan4_Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một số nguyên n bất kỳ: ");
		int n = sc.nextInt();
		int dem = 0;
		for(int i=2; i<n; i++)
			if(n%i==0)
				dem++;
		if(dem==0)
			System.out.println("Đây là số nguyên tố. ");
		else
			System.out.println("Đây không phải là số nguyên tố. ");
	}

}
