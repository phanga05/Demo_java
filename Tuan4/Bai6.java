package Tuan4;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một nguyên dương bất kỳ ");
		int a = sc.nextInt();
		System.out.println();
		int n = 10;
		while(a / n != 0)
			n *= 10;
		n/=10;
		while(n > 1) {
			if(a / n != a % 10) {
				System.out.println("số bạn vừa nhập không đối xứng");
				return;
			}
			a %= n;
			n /= 100;
			a /=10;
		}
		System.out.println("Số bạn vừa nhập là số đối xứng");
	}
}
