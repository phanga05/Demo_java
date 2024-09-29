/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuan3;

import java.util.Scanner;

/**
 *
 * @author AMIN
 */
public class Tuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bai 1: ");
        bai1();
        System.out.println("Bai 2: ");
        bai2();
        System.out.println("Bai 3: ");
        bai3();
        System.out.println("Bai 4: ");
        bai4();
        System.out.println("Bai 5: ");
        bai5();
        System.out.println("Bai 6: ");
        bai6();
    }

    public static void bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("n là số dương");
        } else if (n < 0) {
            System.out.println("n là số âm");
        } else {
            System.out.println("n là số 0");
        }
    }

    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm trung bình: ");
        double gpa = sc.nextDouble();
        if (gpa >= 8.5 && gpa <= 10) {
            System.out.println("Giỏi");
        } else if (gpa >= 7) {
            System.out.println("Khá");
        } else if (gpa >= 5) {
            System.out.println("Trung Bình");
        } else {
            System.out.println("Yếu");
        }
    }

    public static void bai3() {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhập hệ số a: ");
        a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        c = sc.nextDouble();

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm:");
            double x1 = ((-b) + Math.sqrt(delta)) / 2 * a;
            double x2 = ((-b) - Math.sqrt(delta)) / 2 * a;
            System.out.print("x1: " + x1);
            System.out.print("x2: " + x2);
        } else if (delta == 0) {
            System.out.println("Phương trình có 2 nghiệm kép:");
            double x = -b / (2 * a);
            System.out.println("x1 = x2 = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

    public static void bai4() {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhập số a: ");
        a = sc.nextDouble();
        System.out.print("Nhập số b: ");
        b = sc.nextDouble();
        System.out.print("Nhập số c: ");
        c = sc.nextDouble();

        double max = ((a < b) ? a : b) < c ? ((a < b) ? a : b) : c;
        System.out.println("Số nhỏ nhất: " + max);
    }

    public static void bai5() {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhập cạnh a: ");
        a = sc.nextDouble();
        System.out.print("Nhập cạnh b: ");
        b = sc.nextDouble();
        System.out.print("Nhập cạnh c: ");
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Tam giác vuông");
            } else if (a == b && b == c) {
                System.out.println("Tam giác đều");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tam giác cân");
            } else {
                System.out.println("Tam giác thường");
            }
        } else {
            System.out.println("Không phải là tam giác");
        }
    }

    public static void bai6() {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("Nhập a: ");
        a = sc.nextDouble();
        System.out.print("Nhập b: ");
        b = sc.nextDouble();
        System.out.println("Nhập phép toán: ");
        char c = sc.next().charAt(0);
        if (c == '+') {
            System.out.println("a + b = " + (a + b));
        } else if (c == '-') {
            System.out.println("a - b = " + (a - b));
        } else if (c == '*') {
            System.out.println("a * b = " + (a * b));
        } else if (c == '/' && b != 0) {
            System.out.println("a / b = " + (a / b));
        } else if (c == '%' && b != 0) {
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("Không thõa mãn!!!");
        }
    }
}
