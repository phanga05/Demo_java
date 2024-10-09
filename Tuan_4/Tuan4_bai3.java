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
public class Tuan4_bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,giaithua,i;
        giaithua = 1;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
            giaithua *= i;
        System.out.println("Giai thua: " + giaithua);
    }
}
