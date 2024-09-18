package Tuan3;

import java.util.Scanner;

public class Tuan3_bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một số bất kì : ");
		int a = sc.nextInt();
		if(a > 0)
			System.out.println("Số bạn vừa nhập là số dương");
		else if(a < 0)
			System.out.println("Số bạn vừa nhập là số âm");
		else System.out.println("Số bạn vừa nhập bằng 0");
		}
}
