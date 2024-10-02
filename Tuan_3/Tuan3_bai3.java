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
public class Tuan3_bai3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float a,b,c,x,x1,x2,delta;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        if(a == 0)
            if(b == 0)
                if (c == 0)
                    System.out.println("Vo So nghiem");
                else
                    System.out.println("Vo nghiem");
            else
            {
                x = -c/b;
                System.out.println("Phuong trinh co nghiem x = "+ x);
            } 
        else
        {
            delta = b*b - 4*a*c;
            if(delta < 0)
                System.out.println("Vo nghiem");
            else if (delta > 0)
            {
                x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
                x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
                System.out.println("Phuong trinh co 2 nghiem phan biet la: x1 = "+x1 + "\n" + "x2 = "+x2);
            }
            else
                System.out.println("phuong trinh co nghiem kep: x = "+ -b/(2*a));
                        
        }
                
    }

}
