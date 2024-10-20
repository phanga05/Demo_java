/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan6_bai2;

import java.util.Scanner;

/**
 *
 * @author PHUC AN
 */
public class SinhVien {
    public String maSinhVien;
    public String tenSinhVien;
    public String ngaySinh;
    public double diemTB;

    public SinhVien(String maSinhVien, String tenSinhVien, String ngaySinh, double diemTB) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }


    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
        public void Xuat()
    {
        System.out.print("\nMa sinh vien: " + maSinhVien);
        System.out.print("\nTen sinh vien: " + tenSinhVien);
        System.out.print("\nNgay Sinh: " + ngaySinh);
        System.out.print("\nDiem trung binh: " + diemTB);
    }

    
}
