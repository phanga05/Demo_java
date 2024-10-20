package Bai3;

public class Test {
	public static void main(String[] args) {
        // Tạo đối tượng HinhChuNhat bằng constructor không tham số
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.Nhap();
        hcn1.tinhDienTich();
        hcn1.tinhChuVi();

        // Tạo đối tượng HinhChuNhat bằng constructor có tham số
        HinhChuNhat hcn2 = new HinhChuNhat(5, 3);
        hcn2.tinhDienTich();
        hcn2.tinhChuVi();

        // Tạo đối tượng HinhChuNhat bằng constructor sao chép
        HinhChuNhat hcn3 = new HinhChuNhat(hcn2);
        hcn3.tinhDienTich();
        hcn3.tinhChuVi();
    }
}
