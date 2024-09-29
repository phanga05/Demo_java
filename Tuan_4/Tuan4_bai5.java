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
public class Tuan4_bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,x,y;
        a = sc.nextInt();
        b = sc.nextInt();
        x = a;
        y = b;
        while(x != y)
            if(x > y)
                x = x - y;
            else    
                y = y - x;
        
        System.out.println("Uoc chung lon nhat: " + x);
        System.out.println("BCNN: " + a/x*b);
        

    }
}
