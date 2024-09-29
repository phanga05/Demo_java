package Tuan3;

import java.util.Scanner;

public class Tuan3_bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dt;
		System.out.println("Nhập giá trị a, b, c trong phương trình y = ax^2 + bx = c");
		double a = sc.nextFloat();
		double b = sc.nextFloat();
		double c = sc.nextFloat();
		if(a == 0)
			if(b == 0)
				if(c == 0)
					System.out.println("Phương  trình vô số nghiệm");
				else 
					System.out.println("Phương trình vô nghiệm");
			else
			{
				System.out.println("Phương trình có một nghiệm X = " + -c/b);
			}
		else
		{
			dt = b*b - 4*a*c;
			if(dt < 0)
				System.out.println("Phương trình vô nghiệm");
			else
				if(dt == 0)
					System.out.println("Phương trình có nghiệm kép: X = " + -b/a );
				else
				{
					System.out.println("Phương trình có 2 nghiệm: X1 = " + (-b + Math.sqrt(dt)) + ",X2 = " + (-b - Math.sqrt(dt))  );
				}
		}
	}
}
