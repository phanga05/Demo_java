package Tuan2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên của bạn: ");
		String ten = sc.nextLine();
		System.out.println("Nhập tuổi của bạn: ");
		int tuoi = sc.nextInt();
		System.out.println("Nhập chiều cao của bạn: ");
		double cc =  sc.nextDouble();
		sc.nextLine();
		System.out.println("Ban có thích lập trình ko? ");
		String ans = sc.nextLine();
		System.out.println("Tên: " + ten);
		System.out.println("Tuổi: " + tuoi);
		System.out.println("Chiều cao: " + cc);
		System.out.println("Tôi " + ans + " thích lập trình");
	}
}
