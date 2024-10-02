package Tuan4;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một số nguyên dương bất kỳ ");
		int n = sc.nextInt();
		int gt = 1;
		for(int i = 1 ; i <= n ; i++ ) {
			gt *= i;
		}
		System.out.println("Giai thừa của "+ n +" là: " +gt);
	}
}
