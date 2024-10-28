/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author PHUC AN
 */
public class NguoiDung {

    private String tenDangNhap;
    private String matKhau;
    private TaiKhoan taiKhoan;
    private int soLanDangNhapSai = 0;

    public NguoiDung(String tenDangNhap, String matKhau, TaiKhoan taiKhoan) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.taiKhoan = taiKhoan;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public boolean kiemTraMatKhau(String matKhau) {
        return this.matKhau.equals(matKhau);
    }

    public void doiMatKhau(String matKhauCu, String matKhauMoi, String xacNhanMatKhauMoi) {
        if (!this.matKhau.equals(matKhauCu)) {
            System.out.println("Mật khẩu cũ không đúng.");
            return;
        }
        if (!matKhauMoi.equals(xacNhanMatKhauMoi)) {
            System.out.println("Mật khẩu mới và xác nhận mật khẩu mới không khớp.");
            return;
        }

        this.matKhau = matKhauMoi;
        System.out.println("Đổi mật khẩu thành công!");
    }


    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

}