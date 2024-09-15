package Tuan2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Tổng a và b là: " + (a + b));
		System.out.println("Hiệu a và b là: " + (a - b));
		System.out.println("Tích a và b là: " + (a * b));
		System.out.println("Thương a và b là: " + (a / b));
		System.out.println("Phần dư của a và b là: " + (a % b));
	}
}
