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
public class Tuan3_bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a + b < c || a + c < b || b + c < a)
            System.out.println("Ba canh a b c khong tao nen tam giac ");
        else
            if(a == b && a == c && b == c) 
               System.out.println("Tam giac deu ");
            else if(a == b || b == c || a == c)
                System.out.println("Tam giac can");
            else if (Math.sqrt(a*a+b*b) == c || Math.sqrt(c*c+b*b) == a || Math.sqrt(a*a+c*c) == b)
                System.out.println("Tam giac vuong");
            else
                System.out.println("Tam giac thuong");
            
    }
}
