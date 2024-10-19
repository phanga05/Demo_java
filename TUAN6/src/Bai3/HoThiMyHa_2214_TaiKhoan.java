package Bai3;

import java.util.Scanner;

public class HoThiMyHa_2214_TaiKhoan {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    private String matKhau;

    public HoThiMyHa_2214_TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.matKhau = matKhau;
    }
    
	public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gửi thành công " + soTien + " VND vào tài khoản. Số dư hiện tại là: " + soDu + " VND");
        } 
        else 
            System.out.println("Số tiền gửi phải lớn hơn 0.");
    }
   
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút thành công " + soTien + " VND từ tài khoản. Số dư còn lại là: " + soDu + " VND");
        } 
        else 
            System.out.println("Số tiền rút không hợp lệ hoặc vượt quá số dư.");
    }
    
    public void kiemTraSoDu() {
        System.out.println("Số dư hiện tại là: " + soDu);
    }
    
    public void doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (!this.matKhau.equals(matKhauCu)) {
            System.out.println("Mật khẩu cũ không chính xác.");
        } else {
            this.matKhau = matKhauMoi;
            System.out.println("Đổi mật khẩu thành công thành "+ matKhauMoi);
        }
    }
 
    
   
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }

	public String getMatKhau() {
		return matKhau;
	}
    
}
