/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author PHUC AN
 */
import java.util.HashMap;
import java.util.Map;

public class QuanLyNguoiDung {

    private Map<String, NguoiDung> danhSachNguoiDung = new HashMap<>();

    public boolean dangKy(String tenDangNhap, String matKhau, TaiKhoan taiKhoan) {
        if (danhSachNguoiDung.containsKey(tenDangNhap)) {
            return false; 
        }
        danhSachNguoiDung.put(tenDangNhap, new NguoiDung(tenDangNhap, matKhau, taiKhoan));
        return true;
    }

    public NguoiDung dangNhap(String tenDangNhap, String matKhau) {
        NguoiDung nguoiDung = danhSachNguoiDung.get(tenDangNhap);
        if (nguoiDung != null && nguoiDung.kiemTraMatKhau(matKhau)) {
            return nguoiDung;
        }
        return null; 
    }
}
