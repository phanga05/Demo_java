package Tuan3;

import java.util.Scanner;

public class Tuan3_Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 2 số: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("Nhập vào phép toán: ");
		char pt = sc.next().charAt(0);
		float kqua = 0;
		switch(pt) 
		{
		case '+': kqua = a + b; break;
		case '-': kqua = a - b; break;
		case '*': kqua = a * b; break;
		case '/': kqua = a / b; break;
		default: System.out.println("Phép toán không hợp lệ!! Vui lòng nhập lại ");
		return;
		}
		System.out.println("Kết quả của phép toán: " + a+ pt + b + " = " + kqua);
	}

}
