package Tuan3;

import java.util.Scanner;

public class Tuan3_Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào độ dài 3 cạnh: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		if(a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a)
			if(a==b && b==c)
				System.out.println("Đây là tam giác đều ");
			else
				if(a==b || a==c || b==c)
					System.out.println("Đây là tam giác cân ");
				else 
					if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
						System.out.println("đây là tam giá vuông ");
					else 
						System.out.println("Đây là tam giác thường ");
		else
			System.out.println("Ba cạnh đã nhập không tạo thành một tam giác");
		
	}

}