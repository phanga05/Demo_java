package Tuan_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tuan5Bai5 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("Bạn muốn tạo ra danh sách có bao nhiêu phần tử?");
		int n = sc.nextInt();
		Nhap(arr, n);
		Xuat(arr);
		Xoa(arr);
		Xuat(arr);
		ThayThe(arr);
		Xuat(arr);
	}
	public static void Nhap(ArrayList<Integer> a,int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("Nhập phần tử thứ "+i+": ");
			int y = sc.nextInt();
			a.add(y);
		}
	}
	public static void Xuat(ArrayList<Integer> a) {
		System.out.println("Mảng gồm có: ");
		for (int i = 0; i < a.size(); i++) {
			System.out.println("Phần tử thứ "+i+": " + a.get(i));
		}
	}
	public static void Xoa(ArrayList<Integer> a) {
		System.out.println("Bạn muốn xóa phần thử ở vị trí nào");
		int y = sc.nextInt();
		if(y < 0 || y >= a.size())
			System.out.println("Vị trí bạn chọn không tồn tại!!!");
		else
			a.remove(y);
	}
	public static void ThayThe(ArrayList<Integer> a) {
		System.out.println("Bạn muốn thay thế phần thử ở vị trí nào");
		int y = sc.nextInt();
		if(y < 0 || y >= a.size())
			System.out.println("Vị trí bạn chọn không tồn tại!!!");
		else {
			System.out.print("Nhập phần tử bạn muốn thay thế vào: ");
			int z =sc.nextInt();
			a.set(y, z);
		}
	}
}
