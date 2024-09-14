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
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,tong,hieu,tich,soDu;
        float thuong;
        System.out.println("Nhap vao hai so nguyen a va b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        tong = a + b;
        hieu = a - b;
        tich = a * b;
        thuong = (float)a/b;
        soDu = a % b;
        System.out.println("Tong la: " + tong);
        System.out.println("Hieu la: " + hieu);
        System.out.println("Tich la: " + tich);
        System.out.println("Thuong la: " +thuong);
        System.out.println("So du la: " + soDu);
        
    }
}
