package Tuan6_bai2;


import Tuan6_bai2.DanhSachSV;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSV dssv = new DanhSachSV();
        int n;
        System.out.println("Bạn muốn nhập bao nhiêu sinh viên: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++)            
             dssv.themSinhVien();
        
        System.out.println("Danh sach sinh vien sau khi da sap xep: ");
        dssv.sort();
        dssv.Xuat();
        
        
    }
}
