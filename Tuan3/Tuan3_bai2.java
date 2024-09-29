package Tuan3;

import java.util.Scanner;

public class Tuan3_bai2 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập điểm trung bình của bạn : ");
	float tb = sc.nextInt();
	if(tb >= 8.0 && tb <= 10)
		System.out.println("Xếp loại Giỏi");
	else 
		if(tb >= 6.5)
			System.out.println("Xếp loại Khá");
		else 
			if(tb >= 4)
				System.out.println("Xếp loại trung bình");
			else 
				if(tb >= 0 && tb <= 4)
					System.out.println("Xếp loại yếu");
				else System.out.println("Bạn đã nhập sai !!!");
}
}
