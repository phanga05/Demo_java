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

public class Tuan4_bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum,i;
        System.out.println("Nhap n: ");  
        n = sc.nextInt();
        sum = 0;
        for(i = 1; i <= n; i++)
            sum+=i;
        System.out.println("Tong cua cac phan tu tu mot den " + n + " la: " + sum);
        
        
    }
}
