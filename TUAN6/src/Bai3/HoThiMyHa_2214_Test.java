package Bai3;

import java.util.Scanner;

public class HoThiMyHa_2214_Test {
    public static void main(String[] args) {
    
        HoThiMyHa_2214_TaiKhoan tk = new HoThiMyHa_2214_TaiKhoan("394715008", "Hồ Thị Mỹ Hà", 8000000, "myha2214");

        Scanner sc = new Scanner(System.in);
        
        boolean exit = false;

        while(!exit) {
            System.out.println("1. Gửi tiền");
            System.out.println("2. Rút tiền");
            System.out.println("3. Kiểm tra số dư");
            System.out.println("4. Đổi mật khẩu");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Nhập số tiền cần gửi: ");
                    double soTienGui = sc.nextDouble();
                    tk.guiTien(soTienGui);
                    break;
                case 2:
                    System.out.print("Nhập số tiền cần rút: ");
                    double soTienRut = sc.nextDouble();
                    tk.rutTien(soTienRut);
                    break;
                case 3:
                    tk.kiemTraSoDu();
                    break;
                case 4:
                    System.out.print("Nhập mật khẩu cũ: ");
                    String matKhauCu = sc.next();
                    System.out.print("Nhập mật khẩu mới: ");
                    String matKhauMoi = sc.next();
                    tk.doiMatKhau(matKhauCu, matKhauMoi);
                    break;
                    
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
            exit = true;
        }

        sc.close();
    }
}

