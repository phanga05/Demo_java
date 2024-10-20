/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan6_bai1;

/**
 *
 * @author PHUC AN
 */
public class test 
{
    public static void main(String[] args) 
    {
        HinhChuNhat hcnA = new HinhChuNhat();
        hcnA.chieuDai = 8.5;
        hcnA.chieuRong = 5;
        System.out.println("S = " + hcnA.DienTich());
        System.out.println("P = " + hcnA.ChuVi());
    }
}
