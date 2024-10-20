/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan6_bai3;

import java.util.Scanner;

/**
 *
 * @author PHUC AN
 */
public class test 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        TaiKhoan tk = new TaiKhoan("111","An", 0,"NguyenPhucAn");
        double soTienGui, soTienRut;      
        String matKhauHienTai, matKhauMoi, soTaiKhoan;
        int dem = 0;
        boolean check = false;

        while(true)
        {
            System.out.println("Nhập số tài khoản : ");
            soTaiKhoan = sc.nextLine();
            if(soTaiKhoan.equals(tk.getSoTaiKhoan()))
            {
                while(dem < 5)
                {   
                    System.out.println("Nhập mật khẩu hiện tại: ");
                    matKhauHienTai = sc.nextLine();
                    if(matKhauHienTai.equals(tk.getMatKhau()))
                    {
                        System.out.println("Nhập mật khẩu mới: ");
                        matKhauMoi = sc.nextLine();
                        tk.doiMatKhau(matKhauHienTai,matKhauMoi);
                        System.out.println("Mật khẩu sau khi đã thay đổi là: ");
                        System.out.println(tk.getMatKhau());
                        check = true;
                        while(true)
                        {                           
                            System.out.print("Nhập số tiền cần gửi: ");
                            soTienGui = sc.nextDouble();
                            if(soTienGui > 0)
                            {
                                tk.guiTien(soTienGui);
                                break;
                            }
                            else
                                System.out.println("Số tiền gửi phải lớn hơn 0, mời bạn nhập lại: ");
                        }
                        while(true)
                        {
                            System.out.print("Nhập số tiền cần rút: ");
                            soTienRut = sc.nextDouble();
                            if(soTienRut <= tk.getSoDu() && soTienRut > 0)
                            {
                                tk.rutTien(soTienRut);
                                break;
                            }
                            else
                                System.out.println("Số tiền rút không hợp lệ, mời bạn nhập lại: ");
                        }
                        tk.kiemTraSoDu();
                        break;
                    }
                    else
                    {
                        System.out.println("Bạn đã nhập sai mật khẩu hiện tại");
                        dem++;
                    }
                    
                }
                if(check == true)
                    break;
                if(dem == 5)
                {
                    System.out.println("Bạn đã nhập sai mật khẩu quá 5 lần");  
                    break;
                } 
            }
            else
                System.out.println("Số tài khoản sai, mời bạn nhập lại ");
        }
        

    }
}
