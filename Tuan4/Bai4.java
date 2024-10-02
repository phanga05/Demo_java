package Tuan4;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một số nguyên dương bất kỳ ");
		int n = sc.nextInt();
		for(int i = 2 ; i < n ; i++ ) {
			if(n % i == 0) {
				System.out.println("Số bạn vừa nhập không phải là số nguyên tố");
				return ;
			}
		}
		System.out.println("Số bạn vừa nhập là số nguyên tố");
	}
}
