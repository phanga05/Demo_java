/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ncm
 */
public class SavingsAccount extends BankAccount {
    private double savings;

    public SavingsAccount(double savings, String phone, String name, String password) {
        super(phone, name, password);
        this.savings = savings;
    }
    
}
