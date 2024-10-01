package Tuan3;

import java.util.Scanner;

public class Tuan3_Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một số bất kỳ: ");
		int n = sc.nextInt();
		if(n>0)
			System.out.println("Số " + n + " là số dương");
		else
			if(n<0)
				System.out.println("Số " + n + " là số âm");
			else
				System.out.println("Số " + n + " bằng 0");
		
	}

}
