package Bai2V2;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
	public static void NhapList(ArrayList<SinhVien> st) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Số sinh viên bạn muốn nhập vào là? ");
		int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
			SinhVien sv = new SinhVien();
			System.out.println("Nhập thông tn sinh viên thứ "+ (i+1));
			sv.Nhap();
			st.add(sv);
			}
        }
	
	public static void XuatList(ArrayList<SinhVien> st) {
		System.out.println("Danh sách sinh viên :");
        for (int i = 0; i < st.size(); i++) {
        	System.out.println("Sinh viên thứ "+ (i+1));
        	st.get(i).Xuat();
			}
        }
	
	public static void SapXepList(ArrayList<SinhVien> st) {
		for (int i = 0; i < st.size(); i++) 
			for (int j = i+1; j < st.size(); j++) {
				SinhVien sv1 = st.get(i);
				SinhVien sv2 = st.get(j);
				if(sv1.dtb > sv2.dtb) {
					st.set(i, sv2);
					st.set(j, sv1);
				}
					
			}
	}
}
