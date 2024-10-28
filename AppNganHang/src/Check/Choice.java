package Check;

import java.util.Scanner;

public class Choice 
{
	public boolean Revert()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Quay lại bước trước đó");
		System.out.println("0. Thoát");
		System.out.print("Nhập lựa chọn của bạn: ");
		int choice = sc.nextInt();
		return (choice == 1);
	}
}
