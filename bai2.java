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
public class bai2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int tuoi,n;
        float chieuCao;
        boolean check;
        char[] ten = {'N', 'g', 'u', 'y', 'e', 'n', ' ', 'P', 'h', 'u', 'c', ' ', 'A', 'n'};
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.println("Nhap chieu cao theo don vi do la m: ");
        chieuCao = sc.nextFloat();      
        System.out.println("Neu ban yeu lap trinh nhap 1, con khong thi nhap 0");
        n = sc.nextInt();
        if(n==1)
            check = true;
        else 
            check = false;
        System.out.println(ten);
        System.out.println("Tuoi : " + tuoi);
        System.out.println("Chieu cao: " + chieuCao + " cm");
        if(check)
            System.out.println("Co yeu thich lap trinh");
        else    
            System.out.println("Khong yeu thich lap trinh");
        
                
        
    }
    
}
