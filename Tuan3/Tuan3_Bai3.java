package Tuan3;

import java.util.Scanner;

public class Tuan3_Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào hệ số a: ");
		float a = sc.nextFloat();
		System.out.println("Nhập vào hệ số b: ");
		float b = sc.nextFloat();
		System.out.println("Nhập vào hệ số c: ");
		float c = sc.nextFloat();
		float delta, x1, x2;
		delta = b*b - 4*a*c;
		if(a==0)
			if(b==0)
				if(c==0)
					System.out.println("Phương trình vô số nghiệm");
				else
					System.out.println("Phương trình vô nghiệm");
			else
				System.out.println("Phương trình có một nghiệm x = " + (-c/b));
		else
			if(delta<0)
				System.out.println("Phương trình không có nghiệm");
			else
				if(delta==0)
					System.out.println("Phương trình có nghiệm kép x = " + (-b/2*a));
				else
				{
					x1 = (-b + (float)Math.sqrt(delta))/(2*a);
					x2 = (-b - (float)Math.sqrt(delta))/(2*a);
					System.out.println("Phương trình có hai nghiệm x1= " + x1 + " và x2= " + x2);
				}
			
	}

}
