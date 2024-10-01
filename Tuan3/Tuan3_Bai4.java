package Tuan3;

import java.util.Scanner;

public class Tuan3_Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 3 số bất kỳ: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float min = a < b ? (a < c ? a : c):(b < c ? b : c);
		System.out.println("Số nhỏ nhất trong 3 số là: " + min);
	}

}
