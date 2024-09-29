/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuan5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AMIN
 */
public class Tuan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        bai1();
//        bai2();
//        bai3();
//        bai4();
//        bai5();
        bai6();
    }

    public static void bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của n: ");
        int n = sc.nextInt();
        int m[] = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += m[i];
        }
        System.out.println("Tổng các phần tử trong mảng m = " + sum);
    }

    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của n: ");
        int n = sc.nextInt();
        int m[] = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }

        System.out.println("Mảng sau khi đổi ngược là:");

        int l = 0;
        int r = n - 1;

        while (l < r) {
            int tmp = m[l];
            m[l] = m[r];
            m[r] = tmp;
            l++;
            r--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
    }

    public static int swap(int y, int x) {
        return y;
    }

    public static int lomuto(int m[], int l, int r) {
        int pivot = m[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (m[j] <= pivot) {
                i++;
                m[i] = swap(m[j], m[j] = m[i]);
            }
        }
        // đưa chốt về giữa
        i++;
        m[i] = swap(m[r], m[r] = m[i]);
        return i;
    }

    public static void quickSort(int m[], int l, int r) {
        if (l >= r) {
            return;
        }
        int p = lomuto(m, l, r);
        quickSort(m, l, p - 1);
        quickSort(m, p + 1, r);
    }

    public static void bai3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của n: ");
        int n = sc.nextInt();
        int m[] = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }

        quickSort(m, 0, n - 1);
        System.out.println("Mảng sau khi sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
    }

    public static void bai4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của n: ");
        int n = sc.nextInt();
        int m[] = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }

        int cnt[] = new int[10001];
        for (int i = 0; i < n; i++) {
            cnt[m[i]]++;
        }

        int max = -1, res = 0;
        for (int i = 0; i < 10001; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                res = i;
            }

        }

        System.out.println("Phần tử xuât hiện nhiều nhất là: " + res);
    }

    public static void bai5() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    public static void bai6() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.print("Thêm phần tử tại vị trí: ");
        int a = sc.nextInt();
        System.out.print("Phần tử muốn thêm: ");
        int n = sc.nextInt();
        list.add(n);
        
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.print("Xóa phần tử tại vị trí: ");
        int r = sc.nextInt();
        list.remove(r);
        
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
