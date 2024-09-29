/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tuan2_bai1;

import java.util.Scanner;

/**
 *
 * @author AMIN
 */
public class Tuan2_bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bai1();
    }
    
    public static void bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
