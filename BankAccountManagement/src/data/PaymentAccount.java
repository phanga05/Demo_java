/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ncm
 */
public class PaymentAccount extends BankAccount {

    public PaymentAccount(String phone, String name, String password) {
        super(phone, name, password);
    }
    
    @Override
    public void rutTien(double soTienCanRut) {
        if (soTienCanRut > 0) {
            if (this.balance >= soTienCanRut && soTienCanRut % 50000 == 0) {
                this.balance -= soTienCanRut;
                System.out.println("Tài khoản: " + this.phone + " - " + soTienCanRut);
            } else {
                System.out.println("Tài khoản của quý khách không đủ!");
            }
        } else {
            System.out.println("Số tiền không hợp lệ!");
        }
    }
    
    // có các phương thức thanh toán tiền điện, đặt vé máy bay, đặt vé xem phim
    // đặt xe taxi ...
}
