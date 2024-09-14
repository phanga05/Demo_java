/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThucHanh;

/**
 *
 * @author PHUC AN
 */
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
            // Tạo đối tượng Scanner để nhận input từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập số tiền gửi
        System.out.print("Nhap so tien gui (VND): ");
        double principal = scanner.nextDouble();

        // Nhập lãi suất hàng năm
        System.out.print("Nhập lãi suất hàng năm (%): ");
        double annualInterestRate = scanner.nextDouble();

        // Nhập số tháng gửi
        System.out.print("Nhập số tháng gửi: ");
        int months = scanner.nextInt();

        // Tính số tiền lãi
        double monthlyInterestRate = annualInterestRate / 100 / 12; // Chuyển đổi lãi suất hàng năm sang hàng tháng
        double interest = principal * monthlyInterestRate * months;

        // Tính số tiền gốc cuối kỳ
        double totalAmount = principal + interest;

        // In kết quả ra màn hình
        System.out.printf("Số tiền lãi: %.2f VND%n", interest);
        System.out.printf("Số tiền gốc cuối kỳ: %.2f VND%n", totalAmount);
    }


}
