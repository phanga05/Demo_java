/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan6_bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHUC AN
 */
public class DanhSachSV {
        
    private ArrayList<SinhVien> dssv = new ArrayList();
    private Scanner sc = new Scanner(System.in);
        
    public void themSinhVien()
    {
        String maSinhVien, tenSinhVien, ngaySinh;
        double diemTB;
        System.out.println("Nhap ma sinh vien: ");
        maSinhVien = sc.nextLine();
        System.out.println("Nhap ten sinh vien: ");
        tenSinhVien = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        diemTB = sc.nextDouble();
        dssv.add(new SinhVien(maSinhVien, tenSinhVien, ngaySinh, diemTB));
        sc.nextLine();
    }
    
     public void sort() {
        for (int i = 0; i < dssv.size() - 1; i++) 
        {
            for (int j = i + 1; j < dssv.size(); j++) 
            {
                if (dssv.get(i).getDiemTB()< dssv.get(j).getDiemTB()) 
                {
                    SinhVien tmp = dssv.get(i);
                    dssv.set(i, dssv.get(j));
                    dssv.set(j, tmp);
                }
            }
        }
        System.out.println("Sắp xếp thành công!");
    }
    
    public void Xuat() 
    {
        for(SinhVien x : dssv) 
        {
            x.Xuat();
        }
    }

}
