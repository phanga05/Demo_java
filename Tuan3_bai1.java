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
public class Tuan3_bai1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int so;
        so = sc.nextInt();
        if (so > 0)
            System.out.println(so+" la so duong");
        else if (so < 0)
            System.out.println(so+" la so am");
        else
            System.out.println("Bang khong");
    }
}
