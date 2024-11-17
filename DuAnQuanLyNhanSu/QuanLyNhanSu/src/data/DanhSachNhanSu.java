/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author PHUC AN
 */
public class DanhSachNhanSu {

    private HashMap<String, NhanSu> danhSachNhanSu = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void DangKi() throws ParseException {
        System.out.print("Nhập tài khoản (số điện thoại của you đó): ");
        String soTaiKhoan = sc.nextLine();

        if (danhSachNhanSu.containsKey(soTaiKhoan)) {
            System.out.println("So tai khoan da ton tai.");
            return;
        }
        System.out.print("Nhập mật khẩu:");
        String matKhau = sc.nextLine();

        System.out.print("Nhập họ tên: ");
        String tenChuTaiKhoan = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
        Date ngaySinh = d.parse(sc.nextLine());

        System.out.print("Nhập Email: ");
        String email = sc.nextLine();
        System.out.print("Nhập địa chỉ (Tỉnh Thành): ");
        String diaChi = sc.nextLine();
        System.out.print("Nhập tên ngân hàng: ");
        String tenNganHang = sc.nextLine();

        System.out.print("Nhập số tài khoản ngân hàng: ");
        String soTaiKhoanNganHang = sc.nextLine();

        NhanSu NhanSu = new NhanSu(soTaiKhoan, matKhau, ngaySinh, email, soTaiKhoan, email, diaChi);

        danhSachNhanSu.put(soTaiKhoan, NhanSu);

    }

    public void dangNhap() {
        System.out.print("Nhap so tai khoan: ");
        String soTaiKhoan = sc.nextLine();
        System.out.print("Nhap mat khau: ");
        String matKhau = sc.nextLine();

        NhanSu NhanSu = danhSachNhanSu.get(soTaiKhoan);

        if (NhanSu == null || NhanSu.getMatKhau().equals(matKhau)) {
            System.out.println("So tai khoan hoac mat khau khong dung.");
            return;
        }

    }

    private void menu(NhanSu NhanSu) {
        while (true) {
            System.out.println("========Menu=======");
            System.out.println("\nChon chuc nang :");
            System.out.println("1. Hiển thị danh sách nhân sự");
            System.out.println("2. Tìm kiếm nhân sự");
            System.out.println("3. Xem lương của nhân sự");
            System.out.println("0. Thoat");
        }
    }

    private void timNhanSu(String soTaiKhoan) {
        NhanSu NhanSu = danhSachNhanSu.get(soTaiKhoan);
        if (NhanSu != null) {
            NhanSu.hienThiThongTin();
        } else {
            System.out.println("Khong tim thay tai khoan.");
        }
    }

    private void XoaTaiKhoan(String soTaiKhoan) {
        if (danhSachNhanSu.containsKey(soTaiKhoan)) {
            danhSachNhanSu.remove(soTaiKhoan);
            System.out.println("Da xoa thanh cong so tai khoan: " + soTaiKhoan);
        } else {
            System.out.println("Khong tim thay tai khoan co so tai khoan: " + soTaiKhoan);
        }

    }
    
    private double tinhLuong(){
        return 1;
    }
    
    private void chinhSuaThongTin()
    {
        
    }
    
    
    
    

}
