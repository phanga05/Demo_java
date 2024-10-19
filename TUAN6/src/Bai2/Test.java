package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVien> DanhSachSV = new ArrayList<>();
		
		System.out.println("Nhập vào số sinh viên: ");
		int n = sc.nextInt();
		sc.nextLine();
		SinhVien sv = new SinhVien();
		for(int i=0; i<n;i++) {
			
			System.out.println("\nNhập vào sinh viên thứ " + (i+1) + ": ");
			sv.NhapThongTin();
			DanhSachSV.add(sv);	
			sv.InThongTin();
		}
		
		
		
		
		
		
		/*for(int i=0; i<n;i++) {
			DanhSachSV[i].InThongTin();
		}
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if (danhsachSsv.InThongTin();)
			}
		}*/

	}

}
