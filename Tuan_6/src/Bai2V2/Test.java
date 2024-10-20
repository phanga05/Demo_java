package Bai2V2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();
		List.NhapList(listSinhVien);
		List.XuatList(listSinhVien);
//		List.SapXepList(listSinhVien);
		Collections.sort(listSinhVien);
		List.XuatList(listSinhVien);
	}
}
