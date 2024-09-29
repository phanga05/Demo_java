/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuan4;

import java.util.Scanner;

/**
 *
 * @author AMIN
 */
public class Tuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        bai1();
//        bai2();
//        bai3();
//        bai4();
//        bai5();
bai6();
    }

    public static void bai1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tổng từ 1 đến " + n + "= " + sum);
    }

    public static void bai2() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public static void bai3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên bất kì");
        int n = sc.nextInt();
        long gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.println("Giai thừa từ 1 đến " + n + " = " + gt);
    }

    public static void bai4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên bất kì");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Không phải là số nguyên tố");
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Không phải là số nguyên tố");
                return;
            }
        }
        System.out.println("Là số nguyên tố");
    }

    public static void bai5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 2 số nguyên bất kì");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = a * b;
        while (a > 0) {
            if (a >= b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("UCLN = " + b);
        System.out.println("BCNN = " + t / b);
    }

    public static void bai6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên bất kì");
        int a = sc.nextInt();

        int n = 10;
        while (a / n != 0) {
            n *= 10;
        }
        n /= 10;
        
        while(n > 0) {
            if(a / n != a % 10) {
                System.out.println("Số không đối xứng");
                return;
            }
            a %= n;
            n /= 100;
            a /= 10;
        }
        System.out.println("Số đối xứng");
    }
}
