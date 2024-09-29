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
public class Tuan3_bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char toanTu;
        int a,b;
        System.out.println("Nhap 2 so a va b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap toan tu can thuc hien: ");
        toanTu = sc.nextLine().charAt(0);
        if(toanTu == '+')
            System.out.println(a + b);
        if(toanTu == '-')
            System.out.println(a - b);
        if(toanTu == '*')
            System.out.println(a * b);
        if(toanTu == '/')
            System.out.println((float)a / b);
            
    }
}
