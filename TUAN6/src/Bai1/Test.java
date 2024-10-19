package Bai1;

public class Test {

	public static void main(String[] args) {
		HinhChuNhat hcnA = new HinhChuNhat();
		hcnA.chieuDai = 8.5;
		hcnA.chieuRong = 5;
		System.out.println("S = " + hcnA.DienTich());
		System.out.println("CV = " + hcnA.ChuVi());
		
	}

}
