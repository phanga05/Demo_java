package Tuan4;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một số nguyên dương bất kỳ ");
		int n = sc.nextInt();
		int tg = 0;
		for(int i = 1 ; i <= n ; i++ )
			tg += i;
		System.out.println("Tổng dãy 1 đến "+ n +" là: " +tg);
	}
}

