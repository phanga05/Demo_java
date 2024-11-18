package NhanSu_Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import Bank_Feature.ListAccount;
import Check.Check;

public abstract class NhanSu {

    protected String id;
    protected String matKhau;
    protected String hoTen;
    protected LocalDate ngaySinh;
    protected String soDienThoai;
    protected String email;
    protected String diaChi;
    protected String soTaiKhoanNganHang;
    protected String tenTaiKhoanNganHang;
    protected double luongCoBan;
    protected double heSoLuong = 1;
    protected String GianHang;
    protected String phanQuyen;
    
    Scanner sc = new Scanner(System.in);
    Check ck = new Check();

	public NhanSu(String id, String matKhau, String hoTen, String ngaySinh, String soDienThoai, String email,
			String diaChi, String soTaiKhoanNganHang, String tenTaiKhoanNganHang, double heSoLuong,String tenGianHang,
			String phanQuyen) {
		super();
		this.id = id;
		this.matKhau = matKhau;
		this.hoTen = hoTen;
		this.ngaySinh = LocalDate.parse(ngaySinh);
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.diaChi = diaChi;
		this.soTaiKhoanNganHang = soTaiKhoanNganHang;
		this.tenTaiKhoanNganHang = tenTaiKhoanNganHang;
		this.heSoLuong = heSoLuong;
		this.GianHang = tenGianHang;
		this.phanQuyen = phanQuyen;
	}
	//constructor dùng để thay đổi chức vụ
	public NhanSu(NhanSu ns) {
		super();
		this.id = ns.id;
		this.matKhau = ns.matKhau;
		this.hoTen = ns.hoTen;
		this.ngaySinh = ns.ngaySinh;
		this.soDienThoai = ns.soDienThoai;
		this.email = ns.email;
		this.diaChi = ns.diaChi;
		this.soTaiKhoanNganHang = ns.soTaiKhoanNganHang;
		this.tenTaiKhoanNganHang = ns.tenTaiKhoanNganHang;
		this.heSoLuong = ns.heSoLuong;
		this.phanQuyen = ns.phanQuyen;
	}

	public NhanSu(String id, String matKhau, String hoTen, String ngaySinh, String email, String diaChi, String soTaiKhoanNganHang, String tenTaiKhoanNganHang){
        this.id = id;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh);
        this.email = email;
        this.diaChi = diaChi;
        this.soTaiKhoanNganHang = soTaiKhoanNganHang;
        this.tenTaiKhoanNganHang = tenTaiKhoanNganHang;
    }
	
    public NhanSu() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoTaiKhoanNganHang() {
		return soTaiKhoanNganHang;
	}

	public void setSoTaiKhoanNganHang(String soTaiKhoanNganHang) {
		this.soTaiKhoanNganHang = soTaiKhoanNganHang;
	}

	public String getTenTaiKhoanNganHang() {
		return tenTaiKhoanNganHang;
	}

	public void setTenTaiKhoanNganHang(String tenTaiKhoanNganHang) {
		this.tenTaiKhoanNganHang = tenTaiKhoanNganHang;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public String getPhanQuyen() {
		return phanQuyen;
	}

	public void setPhanQuyen(String phanQuyen) {
		this.phanQuyen = phanQuyen;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

    public String getGianHang() {
		return GianHang;
	}
	public void setGianHang(String tenGianHang) {
		this.GianHang = tenGianHang;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	
	public void hienThiThongTin()
    {
    	System.out.println("<<THÔNG TIN TÀI KHOẢN>>");
        System.out.println("Họ và tên: \t" + this.hoTen);
        System.out.println("Số điện thoại: \t" + this.soDienThoai);
        System.out.println("Enail: \t" + this.email);
        System.out.println("Địa chỉ: \t" + this.diaChi);
        System.out.println("Số tài khoản ngân hàng: \t"+ this.soTaiKhoanNganHang);
        System.out.println("Tên ngân hàng: \t"+ this.tenTaiKhoanNganHang);
        if (this instanceof NhanVienChinhThuc) 
        	System.out.println("Chức vụ: \tNhân viên chính thức");
        if (this instanceof NhanVienThoiVu) 
        	System.out.println("Chức vụ: \tNhân viên thời vụ");
        if (this instanceof QuanLi) 
        	System.out.println("Chức vụ: \tQuản lí");
    }
    
    public boolean Nhap(String sdt, ListAccount listPay) {
    	//số điện thoại được nhập ở hàm đăng kí để check 
    	this.soDienThoai = sdt;
    	try {
    		//nhập mật khẩu
            while (true) {
                System.out.print("Nhập mật khẩu: ");
                this.matKhau = sc.nextLine();
                System.out.print("Nhập lại mật khẩu: ");
                String matKhauNo = sc.nextLine();
                if (ck.CheckPassWord(this.matKhau)) 
                {
					System.out.println("---------");
                    System.out.println("Mật khẩu yếu");
                    System.out.println("Lưu ý: mật khẩu phải dài trên 8 kí tự, có chữ hoa, chữ thường, số, ký tự đặc biệt");
                    if (ck.Choice()) 
                        return true;
					System.out.println("---------");
                } 
                else
                	if(ck.CheckSringEqual(matKhauNo, this.matKhau))
                	{
						System.out.println("---------");
                		System.out.println("Mật khẩu không trùng khớp");
	                    if (ck.Choice()) 
	                        return true;
						System.out.println("---------");
                	}
                	else {
                		break;
                }
            }
            //nhập tên chủ tài khoản
            System.out.print("Nhập tên chủ tài khoản: ");
            this.hoTen = sc.nextLine();
            //nhập địa chỉ 
            System.out.print("Nhập địa chỉ: ");
            this.diaChi = sc.nextLine();
            //nhập email
            while(true)
    		{
                System.out.print("Nhập Email: ");
                this.email = sc.nextLine();
    			if(ck.FormatEmail(this.email))
    			{
    				System.out.println("---------");
    				System.out.println("Email không hợp lệ!!!");
    				if(ck.Choice())
    					return true;
    				System.out.println("---------");
    			}
    			else
    				break;
    		}
            //nhập số tài khoản ngân hàng
            while(true)
            {
            	System.out.print("Nhập số tài khoản ngân hàng: ");
            	this.email = sc.nextLine();
            	if(!listPay.list.containsKey(this.soTaiKhoanNganHang))
            	{
            		System.out.println("Tài khoản ngân hàng không tồn tại!!");
            		if(ck.Choice())
    					return true;
    				System.out.println("---------");
            	}
            	else
            		break;
            }
        } catch (Exception e) {
			System.out.println("---------");
            System.err.println("Đã xảy ra lỗi trong quá trình nhập dữ liệu: " + e.getMessage());
			if(ck.Choice())
				return true;
			sc.nextLine();
        }
    	return false;
    }
    
    public abstract double TinhLuong(int soCaLam);

}
