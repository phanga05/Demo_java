/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author PHUC AN
 */
public class TaiKhoanTietKiem extends TaiKhoan{
    private double laiSuat;

    public TaiKhoanTietKiem(String soTaiKhoan, String chuTaiKhoan, double soDu, double laiSuat) {
        super(soTaiKhoan, chuTaiKhoan, soDu);
        this.laiSuat = laiSuat;
    }

    public void tinhLai() {
        double tienLai = this.getSoDu() * this.laiSuat/100;
        this.napTien(tienLai);
        System.out.println("Đã tính lãi " + tienLai + ". Số dư hiện tại: " + this.getSoDu());
    }
}
