package Tuan4;

import java.util.Scanner;

public class Tuan4_Bai5 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Nhập vào hai số nguyên : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int du;
		while(a%b != 0) {
			du = a%b;
			a = b;
			b = du;
		}
		int ucln = b;
		
		System.out.println("Ước chung lớn nhất là: " + ucln);
		System.out.println("Bội chung nhỏ nhất là: " + (a*b)/ucln);
				
	}

}
