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
public class Tuan3_bai2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float dtb;
        System.out.println("Nhap diem trung binh: ");
        dtb = sc.nextFloat();
        if(dtb >= 8.0)
            System.out.println("Gioi");
        else if(dtb >= 6.5)
            System.out.println("Kha");
        else if(dtb >= 5.0)
            System.out.println("Trung Binh");
        else 
            System.out.println("Yeu");                                      
    }
}
