package Bai3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số tài khoản: ");
        String soTaiKhoan = sc.nextLine();

        System.out.print("Nhập tên chủ tài khoản: ");
        String chuTaiKhoan = sc.nextLine();

        System.out.print("Nhập số dư: ");
        double soDu = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Nhập mật khẩu: ");
        String matKhau = sc.nextLine();

        TaiKhoan tk = new TaiKhoan(soTaiKhoan, chuTaiKhoan, soDu, matKhau);

        System.out.println("\nThông tin tài khoản:");
        tk.hienThiThongTin();

        System.out.print("\nNhập mật khẩu cũ: ");
        String matKhauCu = sc.nextLine();

        System.out.print("Nhập mật khẩu mới: ");
        String matKhauMoi = sc.nextLine();

        if (tk.doiMatKhau(matKhauCu, matKhauMoi)) 
            System.out.println("Đổi mật khẩu thành công.");
        else 
            System.out.println("Mật khẩu cũ không chính xác.");
        

      
    }
}

