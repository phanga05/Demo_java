/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author PHUC AN
 */
public class TaiKhoan {

    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;

    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        this.soDu += soTien;
        System.out.println("Đã nạp " + soTien + " vào tài khoản. Số dư hiện tại: " + this.soDu);
    }

    public void rutTien(double soTien) {
        if (soTien > this.soDu) {
            System.out.println("Số dư không đủ để rút.");
        } else {
            this.soDu -= soTien;
            System.out.println("Đã rút " + soTien + " từ tài khoản. Số dư hiện tại: " + this.soDu);
        }
    }

    public void hienThiThongTin() {
        System.out.println("Số tài khoản: " + this.soTaiKhoan + ", Chủ tài khoản: " + this.chuTaiKhoan + ", Số dư: " + this.soDu);
    }

    public double getSoDu() {
        return soDu;
    }
}
