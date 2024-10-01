package Tuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tuan5_Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Tạo một danh sách số nguyên rỗng
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Nhập số lượng phần tử cần thêm vào danh sách
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        
        // Nhập các phần tử và thêm vào danh sách
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            int number = sc.nextInt();
            numbers.add(number);
        }
        
        // In các phần tử của danh sách
        System.out.println("Danh sách các số nguyên:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
	}

}
