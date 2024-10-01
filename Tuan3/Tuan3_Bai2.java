package Tuan3;

import java.util.Scanner;

public class Tuan3_Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập điểm trung bình: ");
		float dtb = sc.nextFloat();
		if(dtb>8.0)
			System.out.println("Học sinh xếp loại Giỏi");
		else
			if(dtb>6.5)
				System.out.println("Học sinh xếp loại Khá");
			else
				if(dtb>5.0)
					System.out.println("Học sinh xếp loại Trung bình");
				else
					System.out.println("Học sinh xếp loại Yếu");
	}

}
