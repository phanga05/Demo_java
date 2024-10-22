package Bai2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        String maSinhVien = sc.nextLine();
 
        System.out.print("Nhập tên sinh viên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        String ngaySinh = sc.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = sc.nextDouble();

        SinhVien sv = new SinhVien(maSinhVien, ten, ngaySinh, diemTrungBinh);
        sv.hienThiThongTin();

       
    }
}
