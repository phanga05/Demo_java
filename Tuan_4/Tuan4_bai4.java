/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThucHanh;

import java.util.Scanner;

/**
 *
 * @author PHUC AN
 */
public class Tuan4_bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,dem;
        dem = 0;
        System.out.println("Nhap so can kiem tra: ");
        n = sc.nextInt();
        for(i = 2; i < n; i++)
            if(n % i == 0)
                dem++;
        if(dem == 0)
            System.out.println(n + " La so nguyen to");
        else
            System.out.println(n + " Khong phai la so nguyen to");
        
    }
}
