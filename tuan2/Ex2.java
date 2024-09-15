package tuan2;

import java.io.InputStream;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Họ Và Tên :");
		String HoVaTen = sc.nextLine();
		System.out.println("Tuổi: ");
		int Tuoi = sc.nextInt();
		System.out.println("Chiều Cao: ");
		int ChieuCao = sc.nextInt();
		sc.nextLine();
		System.out.println("Bạn có thích lập trình không? ");
		String Ans = sc.nextLine();
		System.out.println("Họ Và Tên :" + HoVaTen);
		System.out.println("Tuổi: " + Tuoi);
		System.out.println("Chiều Cao: " + ChieuCao);
		System.out.println("Bạn có thích lập trình không? : " +Ans );
	}
}
