/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author AMIN
 */
public class SinhVien {
    
    private String maSv;
    private String ten;
    private String ngaySinh;
    
    
    private double dtb;
    
    public SinhVien(String maSv, String ten, String ngaySinh, double dtb) {
        this.maSv = maSv;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
    }
    
    public String getMaSv() {
        return maSv;
    }
    
    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
    
    public String getTen() {
        return ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public String getNgaySinh() {
        return ngaySinh;
    }
    
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public double getDtb() {
        return dtb;
    }
    
    public void setDtb(double dtb) {
        this.dtb = dtb;
    }
    
    public void xepLoai() {
        if (this.dtb >= 8 && this.dtb <= 10) {
            System.out.println("Giỏi");
        } else if (this.dtb >= 6.5) {
            System.out.println("Khá");
        } else if (this.dtb >= 5) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }
    }
    
}
