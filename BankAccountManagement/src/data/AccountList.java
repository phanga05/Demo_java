/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import static java.lang.System.exit;
import java.util.HashMap;
import java.util.Scanner;
import util.Tools;

/**
 *
 * @author ncm
 */
public class AccountList {

    private HashMap<String, BankAccount> hm = new HashMap();
    private Scanner sc = new Scanner(System.in);

    public void signUp() {
        String phone, name, password;
        boolean check = false; // kiểm tra số điện thoại đã đăng kí tài khoản chưa
        do {
            phone = Tools.getPhone("Nhập số điện thoại của bạn: ",
                    "Số điện thoại không hợp lệ: ", "^0\\d{9}$");
            if (hm.containsKey(phone)) {
                check = true;
                System.out.println("Số điện thoại đã tồn tại");
            }
        } while (check);

        // lấy otp để tiếp tục đăng kí
        Tools.getOTP();
        // phần giấy tờ tùy thân
        System.out.println("Thông tin giấy tờ tùy thân");
        name = Tools.getString("Họ và tên: ",
                "Thông tin này không được để trống!").toUpperCase();
        password = Tools.getPassword("Mật khẩu mới: ", "Mật khẩu yếu!");
        // comfirm password
        String comfirmPassword;
        do {
            comfirmPassword = Tools.getString("Xác nhận lại mật khẩu: ",
                    "Vui lòng nhập mật khẩu!");
        } while (!comfirmPassword.equals(password));

        hm.put(phone, new BankAccount(phone, name, password));
        System.out.println("Tạo tài khoản thành công!");
        this.menu();
    }

    public void logIn() {
        String logInName, password;
        int n = 6; // nhập sai mật khẩu không quá 5 lần
        while (n > 0) {
            logInName = Tools.getPhone("Nhập tên đăng nhập (số điện thoại mà bạn đăng kí): ",
                    "Tên đăng nhập không tồn tại\n", "^\\d{10}$");
            password = Tools.getString("Nhập mật khẩu: ", "Mật không được để trống");
            BankAccount acc = hm.get(logInName);
            if (acc != null) {
                if (password.equals(acc.getPassword())) {
                    System.out.println("Đăng nhập thành công");
                    this.action(acc);
                    break;
                } else {
                    n--;
                    System.out.printf("Số điện thoại hoặc mật khẩu không đúng!\n"
                            + "Bạn còn tối đa %d lần nhập\n", n);
                    int choice; // chức năng quên mật khẩu
                    System.out.println(" 1. Tiếp tục");
                    System.out.println(" 2. Quên mật khẩu");
                    System.out.print("Nhập lựa chọn: ");
                    choice = sc.nextInt();
                    if (choice == 2) {
                        forgotpassword();
                        System.out.println("Đổi mật khẩu thành công!");
                        this.menu();
                        break;
                    }
                }
            } else {
                System.out.println("Số điện thoại không tồn tại");
            }
        }

    }

    // chức năng quên mật khẩu
    public void forgotpassword() {
        String name, phone, password, comfirmPassword;
        name = Tools.getString("Họ và tên: ",
                "Thông tin này không được để trống!").toUpperCase();
        phone = Tools.getPhone("Nhập số điện thoại của bạn: ",
                "Số điện thoại không hợp lệ: ", "^0\\d{9}$");
        Tools.getOTP();
        password = Tools.getPassword("Mật khẩu mới: ", "Mật khẩu yếu!");
        do {
            comfirmPassword = Tools.getString("Xác nhận lại mật khẩu: ",
                    "Vui lòng nhập mật khẩu!");
        } while (!comfirmPassword.equals(password));
        hm.get(phone).setPassword(password);
    }

    public void menu() {
        System.out.println("-----------------------------");
        System.out.println("1. Đăng kí");
        System.out.println("2. Đăng nhập");
        System.out.println("0. Thoát");
        System.out.println("-----------------------------");
        int choice;
        System.out.print("Lựa chọn của bạn: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                this.signUp();
                break;
            case 2:
                this.logIn();
                break;
            default:
                exit(0);
        }
    }

    public void action(BankAccount acc) {
        int choice;
        do {
            System.out.println("1. Xem thông tin");
            System.out.println("2. Nạp tiền");
            System.out.println("3. Rút tiền");
            System.out.println("4. Đổi mật khẩu");
            System.out.println("5. Chuyển tiền");
            System.out.println("6. Đăng xuất");
            System.out.println("---------------------------------");
            System.out.print("Nhập lựa chọn: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("----------------------------");
                    System.out.println("Thông tin người dùng");
                    acc.showInfo();
                    System.out.println("----------------------------");
                    break;
                case 2:
                    System.out.println("----------------------------");
                    System.out.println("Nạp tiền");
                    double soTienCanNap;
                    soTienCanNap = Tools.getADouble("Nhập số tiền cần nạp(phải chia hết cho 50000): ", 
                            "Số tiền không hợp lệ");
                    acc.napTien(soTienCanNap);
                    System.out.println("----------------------------");
                    break;
                case 3:
                    System.out.println("----------------------------");
                    double soTienCanRut = Tools.getADouble("Nhập Số tiền Cần rút: "
                            + "(phải chia hết cho 50000): ", "Số tiền cần rút không hợp lệ!");
                    System.out.println("Rút tiền");
                    acc.rutTien(soTienCanRut);
                    System.out.println("----------------------------");
                    break;
                case 4:
                    System.out.println("----------------------------");
                    String oldPass = Tools.getString("Nhập mật khẩu củ: ", 
                            "Vui lòng nhập mật khẩu!");
                    String newPass = Tools.getPassword("Nhập mật khẩu mới: ", 
                            "Mật khẩu yếu!");
                    System.out.print("Xác nhận lại mật khẩu mới: ");
                    String confirmPass = sc.nextLine();
                    System.out.println("Đổi mật khẩu");
                    acc.changePass(oldPass, newPass, confirmPass);
                    System.out.println("----------------------------");
                    break;
                case 5:
                    System.out.println("----------------------------");
                    String phone;
                    phone = Tools.getString("Số điện thoại cần chuyển: ", 
                            "Số điện thoại không hợp lệ!");
                    BankAccount acc1 = hm.get(phone);
                    if (acc1 != null) {
                        acc.banking(acc1);
                    }
                    else System.out.println("Sô điện thoại này không tồn tại!");
                    System.out.println("----------------------------");
                    break;
                case 6:
                    System.out.println("----------------------------");
                    System.out.println("Đăng xuất thành công");
                    this.menu();
            }
        } while (choice != 0);
    }
}
