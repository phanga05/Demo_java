package Tuan4;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào hai nguyên dương bất kỳ ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int tich = a*b;
		while(a!=b)
			if(a>b)
				a -= b;
			else
				b -= a;
		System.out.println("Bội chung nhỏ nhất cảu hai số bạn vừa nhập là: "+ tich/a);
	}
}
