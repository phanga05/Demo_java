package Tuan6;

public class test {
	public static void main(String[] args) {
		
//		bài 1 hình chữ nhật
		
//		HinhChuNhat hcn1 = new HinhChuNhat();
//		hcn1.Nhap();
//		hcn1.tinhChuVi();
//		hcn1.tinhDienTich();
//		
//		bài 3 tài khoản ngân hàng
		
		TaiKhoanNganHang tk1 = new TaiKhoanNganHang();
		tk1.Nhap();
		tk1.GuiTien(500030);
		tk1.rutTien(12000);
		tk1.kiemTraSoDu();
		TaiKhoanNganHang tk2 = new TaiKhoanNganHang(43562746, "Trần đình mạnh huy", 54453783);
		tk2.kiemTraSoDu();
		TaiKhoanNganHang tk3 = new TaiKhoanNganHang(tk1);
		tk3.kiemTraSoDu();
		

	}
}
