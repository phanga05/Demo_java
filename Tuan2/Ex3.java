package Tuan2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số thứ nhất : ");
		int a = sc.nextInt();
		System.out.println("Nhập số thứ hai : ");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập toán tử : ");
		char tt = sc.next().charAt(0);
		int kq = 0;
		switch (tt) {
		case '+': kq = a + b; break;
		case '-': kq = a - b; break;
		case '*': kq = a * b; break;
		case '/': kq = a / b; break;
		case 'x': kq = a * b; break;
		case ':': kq = a / b; break;
		default:
			System.out.println("Bạn đã nhập sai!!!");
			System.exit(0);
		}
		System.out.println(a+""+ tt +"" + b + '=' + kq);
	}
}
