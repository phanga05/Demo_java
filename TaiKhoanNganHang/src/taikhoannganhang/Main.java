/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taikhoannganhang;

import data.NguoiDung;
import data.QuanLyNguoiDung;
import data.TaiKhoan;
import data.TaiKhoanThanhToan;
import data.TaiKhoanTietKiem;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author PHUC AN
 */
public class Main {

    private static QuanLyNguoiDung quanLyNguoiDung = new QuanLyNguoiDung();
    private static Scanner sc = new Scanner(System.in);
    private static NguoiDung nguoiDungHienTai;

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Đăng ký");
            System.out.println("2. Đăng nhập");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    dangKy();
                    break;
                case 2:
                    dangNhap();
                    break;
                case 3:
                    System.out.println("Tạm biệt!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static void dangKy() {
        try {
            System.out.print("Tên đăng nhập: ");
            String tenDangNhap = sc.nextLine();
            System.out.print("Mật khẩu: ");
            String matKhau = sc.nextLine();

            while (!kiemTraMatKhau(matKhau)) {
                System.out.println("Mật khẩu phải có ít nhất một ký tự hoa, một ký tự thường và một chữ số.");
                System.out.print("Nhập lại mật khẩu: ");
                matKhau = sc.nextLine();
            }

            TaiKhoan taiKhoan = taoTaiKhoan();

            if (quanLyNguoiDung.dangKy(tenDangNhap, matKhau, taiKhoan)) {
                System.out.println("Đăng ký thành công!");
            } else {
                System.out.println("Tên đăng nhập đã tồn tại.");
            }
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi khi đăng ký: " + e.getMessage());
        }
    }

    private static boolean kiemTraMatKhau(String matKhau) {
        boolean coChuHoa = false;
        boolean coChuThuong = false;
        boolean coChuSo = false;

        for (char c : matKhau.toCharArray()) {
            if (Character.isUpperCase(c)) {
                coChuHoa = true;
            } else if (Character.isLowerCase(c)) {
                coChuThuong = true;
            } else if (Character.isDigit(c)) {
                coChuSo = true;
            }
        }

        return coChuHoa && coChuThuong && coChuSo;
    }

    private static void dangNhap() {
        try {
            System.out.print("Tên đăng nhập: ");
            String tenDangNhap = sc.nextLine();
            System.out.print("Mật khẩu: ");
            String matKhau = sc.nextLine();
            nguoiDungHienTai = quanLyNguoiDung.dangNhap(tenDangNhap, matKhau);
            if (nguoiDungHienTai != null) {
                System.out.println("Đăng nhập thành công! Chào mừng " + nguoiDungHienTai.getTenDangNhap());
                menuNguoiDung();
            } else {
                System.out.println("Tên đăng nhập hoặc mật khẩu không đúng.");
            }
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi khi đăng nhập: " + e.getMessage());
        }
    }

    private static void menuNguoiDung() {
        while (true) {
            System.out.println("1. Rút tiền");
            System.out.println("2. Nạp tiền");
            System.out.println("3. Đổi mật khẩu");
            System.out.println("4. Thanh toán");
            System.out.println("5. Gửi tiết kiệm");
            System.out.println("6. Xem thông tin tài khoản");
            System.out.println("7. Đăng xuất");

            System.out.print("Lựa chọn của bạn: ");
            try {
                int choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        rutTien();
                        break;
                    case 2:
                        napTien();
                        break;
                    case 3:
                        doiMatKhau();
                        break;
                    case 4:
                        thanhToan();
                        break;
                    case 5:
                        guiTietKiem();
                        break;
                    case 6:
                        hienThiThongTin();
                        break;
                    case 7:
                        System.out.println("Đã đăng xuất.");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập số.");
                sc.nextLine(); 
            }
        }
    }

    private static void rutTien() {
        System.out.print("Nhập số tiền muốn rút: ");
        double soTien = sc.nextDouble();
        nguoiDungHienTai.getTaiKhoan().rutTien(soTien);
    }

    private static void napTien() {
        System.out.print("Nhập số tiền muốn nạp: ");
        double soTien = sc.nextDouble();
        nguoiDungHienTai.getTaiKhoan().napTien(soTien);
    }

    private static void hienThiThongTin() {
        nguoiDungHienTai.getTaiKhoan().hienThiThongTin();
    }

    private static void doiMatKhau() {
        try {
            System.out.print("Nhập mật khẩu cũ: ");
            String matKhauCu = sc.nextLine();
            System.out.print("Nhập mật khẩu mới: ");
            String matKhauMoi = sc.nextLine();
            System.out.print("Xác nhận mật khẩu mới: ");
            String xacNhanMatKhauMoi = sc.nextLine();

            nguoiDungHienTai.doiMatKhau(matKhauCu, matKhauMoi, xacNhanMatKhauMoi);
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi khi đổi mật khẩu: " + e.getMessage());
        }
    }

    private static void thanhToan() {
        System.out.print("Nhập số tiền muốn thanh toán: ");
        double soTien = sc.nextDouble();
        if (nguoiDungHienTai.getTaiKhoan() instanceof TaiKhoanThanhToan) {
            ((TaiKhoanThanhToan) nguoiDungHienTai.getTaiKhoan()).thanhToan(soTien);
        } else {
            System.out.println("Tài khoản không hỗ trợ thanh toán.");
        }
    }

    private static void guiTietKiem() {
        if (nguoiDungHienTai.getTaiKhoan() instanceof TaiKhoanTietKiem) {
            ((TaiKhoanTietKiem) nguoiDungHienTai.getTaiKhoan()).tinhLai();
        } else {
            System.out.println("Tài khoản không hỗ trợ gửi tiết kiệm.");
        }
    }

    private static TaiKhoan taoTaiKhoan() {
        System.out.println("Chọn loại tài khoản:");
        System.out.println("1. Tài khoản tiết kiệm");
        System.out.println("2. Tài khoản thanh toán");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập số tài khoản: ");
        String soTaiKhoan = sc.nextLine();
        System.out.print("Nhập chủ tài khoản: ");
        String chuTaiKhoan = sc.nextLine();
        System.out.print("Nhập số dư ban đầu: ");
        double soDu = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.print("Nhập lãi suất( ? %): ");
                double laiSuat = sc.nextDouble();
                return new TaiKhoanTietKiem(soTaiKhoan, chuTaiKhoan, soDu, laiSuat);
            case 2:
                System.out.print("Nhập phí dịch vụ: ");
                double phiDichVu = sc.nextDouble();
                return new TaiKhoanThanhToan(soTaiKhoan, chuTaiKhoan, soDu, phiDichVu);
            default:
                System.out.println("Lựa chọn không hợp lệ. Tạo tài khoản thanh toán mặc định.");
                return new TaiKhoanThanhToan(soTaiKhoan, chuTaiKhoan, soDu, 0);
        }
    }

}
