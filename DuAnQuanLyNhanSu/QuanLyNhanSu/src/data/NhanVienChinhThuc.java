/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author PHUC AN
 */
public class NhanVienChinhThuc extends NhanSu {

    double phuCap;

    public NhanVienChinhThuc(double phuCap, String id, String matKhau, String hoTen, Date ngaySinh, String soDienThoai, String Email, String diaChi, String soTaiKhoanNganHang, String tenTaiKhoanNganHang, double luongCoBan, double heSoLuong, String phanQuyen) {
        super(id, matKhau, ngaySinh, hoTen, soDienThoai, Email, diaChi);
        this.phuCap = phuCap;
    }

    

}
