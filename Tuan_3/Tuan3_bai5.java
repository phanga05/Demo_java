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
public class Tuan3_bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,min;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        min = a;
        if(min >= b)
            System.out.println(b);
        else if(min >= c)
            System.out.println(c);
        else 
            System.out.println(min);
        
    }
    
}
