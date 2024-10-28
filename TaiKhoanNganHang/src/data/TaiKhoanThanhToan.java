/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author PHUC AN
 */
public class TaiKhoanThanhToan extends TaiKhoan {

    private double phiDichVu;

    public TaiKhoanThanhToan(String soTaiKhoan, String chuTaiKhoan, double soDu, double phiDichVu) {
        super(soTaiKhoan, chuTaiKhoan, soDu);
        this.phiDichVu = phiDichVu;
    }

    public void thanhToan(double soTien) {
        double tongTien = soTien + this.phiDichVu;
        if (tongTien > this.getSoDu()) {
            System.out.println("Số dư không đủ để thanh toán.");
        } else {
            this.rutTien(tongTien);
            System.out.println("Đã thanh toán " + soTien + ". Phí dịch vụ: " + this.phiDichVu + ". Số dư hiện tại: " + this.getSoDu());
        }
    }
}
