/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;
import util.Tools;

/**
 *
 * @author ncm
 */
public class BankAccount {

    protected String phone;
    protected String name;
    protected String password;
    protected double balance = 0;

    public BankAccount(String phone, String name, String password) {
        this.phone = phone;
        this.name = name;
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "phone=" + phone + ", name=" + name + ", password=" + password + ", balance=" + balance + '}';
    }

    public void showInfo() {
        System.out.println("Số điện thoại: " + phone);
        System.out.println("Tên chủ tài khoản: " + name);
        System.out.println("Số dư tài khoản: " + balance);
    }

    public void napTien(double soTienCanNap) {
        if (soTienCanNap > 0 && soTienCanNap % 50000 == 0) {
            this.balance += soTienCanNap;
            System.out.println("Tài khoản: " + this.phone + " + " + soTienCanNap);
        } else {
            System.out.println("Số tiền không hợp lệ");
        }

    }

    public void rutTien(double soTienCanRut) {
        if (soTienCanRut >= 50000) {
            if (this.balance >= soTienCanRut && soTienCanRut % 50000 == 0) {
                this.balance -= soTienCanRut;
                System.out.println("Tài khoản: " + this.phone + " - " + soTienCanRut);
            } else {
                System.out.println("Tài khoản của quý khách không đủ!");
            }
        } else {
            System.out.println("Số tiền không hợp lệ");
        }
    }

    public void changePass(String oldPass, String newPass, String confirmPass) {
        Scanner sc = new Scanner(System.in);
        do {
            if (oldPass.equals(this.password)) {
                if (confirmPass.equals(newPass)) {
                    setPassword(newPass);
                    System.out.println("Đổi mật khẩu thành công!");
                    break;
                } else {
                    System.out.println("Xác nhận mật khẩu sai!");
                }
            } else {
                System.out.println("Mật khẩu cũ không đúng!");
            }
        } while (true);

    }

    public void banking(BankAccount acc) {
        double money;
        money = Tools.getADouble("Số tiền cần chuyển: ", "Số tiền không hợp lệ");
        if (!acc.phone.equals(this.phone)) {
            if (money <= this.balance) {
                this.rutTien(money);
                acc.napTien(money);
            }
            else System.out.println("Số dư tài khoản không đủ!");
        }
        else System.out.println("Số điện thoại không tồn tại!");

    }
}
