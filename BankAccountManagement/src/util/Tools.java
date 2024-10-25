/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ncm
 */
public class Tools {

    private static Scanner sc = new Scanner(System.in);

    public static String getPhone(String inputMsg, String errorMsg, String format) {
        String msg;
        boolean match;
        while (true) {
            System.out.print(inputMsg);
            msg = sc.nextLine().trim();
            match = msg.matches(format);
            if (msg.isEmpty() || match == false) {
                System.out.print(errorMsg);
            } else {
                return msg;
            }
        }
    }

    public static String getString(String inputMsg, String errorMsg) {
        String msg;
        while (true) {
            System.out.print(inputMsg);
            msg = sc.nextLine().trim();
            if (msg.isEmpty()) {
                System.out.println(errorMsg);
            } else {
                return msg;
            }
        }
    }

    public static String getPassword(String inputMsg, String errorMsg) {
        String pw;
        boolean isDigit = false, isUpc = false, isLc = false, isSpecial = false;
        while (true) {
            System.out.print(inputMsg);
            pw = sc.nextLine().trim();
            for (char c : pw.toCharArray()) {
                if (Character.isDigit(c)) {
                    isDigit = true;
                } else if (Character.isUpperCase(c)) {
                    isUpc = true;
                } else if (Character.isLowerCase(c)) {
                    isLc = true;
                } else if (String.valueOf(c).matches("[^a-zA-Z0-9\\s]")) {
                    isSpecial = true;
                }
            }
            if (isDigit == true && isUpc == true && isLc == true && isSpecial == true) {
                return pw;
            } else {
                System.out.println(errorMsg);
            }
        }
    }

    public static double getADouble(String inputMsg, String errorMsg) {
        double d;
        while (true) {
            try {
                System.out.print(inputMsg);
                d = Double.parseDouble(sc.nextLine());
                return d;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static void getOTP() {
        int otp; // biến nhập otp để tiếp tục nạp tiền
        int rd; // biến lưu otp gửi về số điện thoại
        do {
            Random random = new Random();
            rd = 100000 + random.nextInt(900000); // tạo otp bằng cách random số có 6 chữ số
            System.out.println("Mã OTP để đăng kí tài khoản: " + rd);
            System.out.print("Nhập otp đăng kí được gửi về số điện thoại: ");
            otp = Integer.parseInt(sc.nextLine());
            if (otp != rd) {
                System.out.println("OTP không đúng!");
            }
        } while (otp != rd);
    }
}
