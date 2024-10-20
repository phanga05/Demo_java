/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan6_bai3;


class TaiKhoan 
{
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    private String matKhau;


    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) 
    {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.matKhau = matKhau;
    }

    
    public String getSoTaiKhoan() 
    {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) 
    {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getChuTaiKhoan() 
    {
        return chuTaiKhoan;
    }

    public void setChuTaiKhoan(String chuTaiKhoan) 
    {
        this.chuTaiKhoan = chuTaiKhoan;
    }

    public double getSoDu() 
    {
        return soDu;
    }

    public void setSoDu(double soDu)  
    {
        this.soDu = soDu;
    }

    public String getMatKhau() 
    {
        return matKhau;
    }

    public void setMatKhau(String matKhau) 
    {
        this.matKhau = matKhau;
    }
    
    
    public void guiTien(double soTien) 
    {
        if (soTien > 0) 
        {
            soDu += soTien;
            System.out.println("Gửi tiền thành công. Số dư hiện tại: " + soDu);
        }
        else 
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        
    }


    public void rutTien(double soTien) 
    {
        while(true)
            if (soTien > 0 && soTien <= soDu) 
            {
                soDu -= soTien;
                System.out.println("Rút tiền thành công. Số dư hiện tại: " + soDu);
                break;
            } 
            else 
                System.out.println("Số tiền rút không hợp lệ. Mời bạn nhập lại số tiền cần rút: ");
    }

    public void kiemTraSoDu() 
    {
        System.out.println("Số dư hiện tại: " + soDu);
    }
    
    public void doiMatKhau(String matKhauCu, String matKhauMoi) 
    {
        if (this.matKhau.equals(matKhauCu)) 
        {
            this.matKhau = matKhauMoi;
            System.out.println("Đổi mật khẩu thành công.");
        } 
        else 
            System.out.println("Mật khẩu cũ không đúng.");
    }
    

}