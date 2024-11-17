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
public class NhanSu {

    String id;
    String matKhau;
    String hoTen;
    Date ngaySinh;
    String soDienThoai;
    String Email;
    String diaChi;
    String soTaiKhoanNganHang;
    String tenTaiKhoanNganHang;
    double luongCoBan;
    double heSoLuong;
    String phanQuyen;

    public NhanSu(String id, String matKhau, Date ngaySinh, String hoTen, String soDienThoai, String Email, String diaChi) {
        this.id = id;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.Email = Email;
        this.diaChi = diaChi;
        this.soTaiKhoanNganHang = soTaiKhoanNganHang;
        this.tenTaiKhoanNganHang = tenTaiKhoanNganHang;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.phanQuyen = phanQuyen;
    }
    
    public NhanSu(String id, String matKhau, String hoTen, Date ngaySinh, String Email, String diaChi, String soTaiKhoanNganHang, String tenTaiKhoanNganHang){
        this.id = id;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.ngaySinh = this.ngaySinh;
        this.Email = Email;
        this.diaChi = diaChi;
        this.soTaiKhoanNganHang = soTaiKhoanNganHang;
        this.tenTaiKhoanNganHang = tenTaiKhoanNganHang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getPhanQuyen() {
        return phanQuyen;
    }

    public void setPhanQuyen(String phanQuyen) {
        this.phanQuyen = phanQuyen;
    }

    public String getSoTaiKhoanNganHang() {
        return soTaiKhoanNganHang;
    }

    public void setSoTaiKhoanNganHang(String soTaiKhoanNganHang) {
        this.soTaiKhoanNganHang = soTaiKhoanNganHang;
    }

    public String getTenTaiKhoanNganHang() {
        return tenTaiKhoanNganHang;
    }

    public void setTenTaiKhoanNganHang(String tenTaiKhoanNganHang) {
        this.tenTaiKhoanNganHang = tenTaiKhoanNganHang;
    }

    @Override
    public String toString() {
        return "NhanSu{" + "id=" + id + ", matKhau=" + matKhau + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", soDienThoai=" + soDienThoai + ", Email=" + Email + ", diaChi=" + diaChi + ", soTaiKhoanNganHang=" + soTaiKhoanNganHang + ", tenTaiKhoanNganHang=" + tenTaiKhoanNganHang + ", luongCoBan=" + luongCoBan + ", heSoLuong=" + heSoLuong + ", phanQuyen=" + phanQuyen + '}';
    }
    
    public void hienThiThongTin()
    {
        System.out.println("Số tài khoản: " + this.soDienThoai);
        System.out.println("Họ và tên: " + this.hoTen);
        System.out.println("Địa chỉ: " + this.diaChi);
        System.out.println("Enail: " + this.Email);
    }

}
