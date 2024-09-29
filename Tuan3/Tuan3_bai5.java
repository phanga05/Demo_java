package Tuan3;

import java.util.Scanner;

public class Tuan3_bai5{
	public static void main(String[] args) {
	float a, b, c;
	System.out.println("Nhap vao ba so: ");
	Scanner sc = new Scanner(System.in);
	a = sc.nextFloat();
	b = sc.nextFloat();
	c = sc.nextFloat();
	if(a>0 && b>0 && c>0) {
		if(a+b>c && b+c>a && a+c>b) {
			if(a==b && a != c || b==c && a != c || a==c && a != b ) {
				if(a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a){
				System.out.println("Ba giá trị tạo ra tam giác vuông cân");
				}else System.out.println("Ba giá trị nhập vào tạo thành tam giác cân");
			}
			else if(a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a) {
				System.out.println("Ba giá trị nhập vào tạo thành tam giác vuông");
				}
				else if(a == b && b == c) {
					System.out.println("Ba giá trị tạo thành tam giác đều");
				}
				else System.out.println("Ba giá trị tạo thành tam giác thường");
		}
		else System.out.println("Ba giá trị khong tạo thành một tam giác");
	}
	else System.out.println("Ba giá trị đều phái lớn hơn 0");
}
}
