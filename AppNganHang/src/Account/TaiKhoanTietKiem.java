package Account;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import Check.Choice;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{
	private Calendar ngayBdGui = new GregorianCalendar();
	private Calendar ngayTinhLai = new GregorianCalendar();
	private double tongTienLai = 0;
	private String kyHan;
	private float laiXuat;
	
	public Calendar getNgayBdGui() {
		return ngayBdGui;
	}


	public Calendar getNgayTinhLai() {
		return ngayTinhLai;
	}


	public double getTongTienLai() {
		return tongTienLai;
	}


	public String getKyHan() {
		return kyHan;
	}


	public float getLaiXuat() {
		return laiXuat;
	}


	public TaiKhoanTietKiem() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public TaiKhoanTietKiem(String soTaiKhoan, String matKhau, String tenChuTaiKhoan, double soDu, String maPin, String kyHan, float laiXuat, String ngayBdGui, String ngayTinhLai) throws ParseException {
	    super(soTaiKhoan, matKhau, tenChuTaiKhoan, soDu, maPin);
		SimpleDateFormat day = new SimpleDateFormat("dd/MM/yyyy");
		this.kyHan = kyHan;
		this.laiXuat = laiXuat;
	    this.ngayBdGui.setTime(day.parse(ngayBdGui));
	    this.ngayTinhLai.setTime(day.parse(ngayTinhLai));
	    // TODO Auto-generated constructor stub
	}
	
	public TaiKhoanTietKiem(String soTaiKhoan, String matKhau, String tenChuTaiKhoan , double soDu, String maPin) throws ParseException {
	    this.soTaiKhoan = soTaiKhoan;
	    this.tenChuTaiKhoan = tenChuTaiKhoan;
	    this.matKhau = matKhau;
	    this.maPin = maPin;
	    this.ngayBdGui.setTime(Calendar.getInstance().getTime());
	    this.ngayTinhLai.setTime(Calendar.getInstance().getTime());
	    // TODO Auto-generated constructor stub
	}

	@Override
	public void CreatAccout() {
		// TODO Auto-generated method stub
		super.CreatAccout();
		ngayBdGui = Calendar.getInstance();
		ngayTinhLai = Calendar.getInstance();
	}

	@Override
	public void CongTien(double x) {
		// TODO Auto-generated method stub
		super.CongTien(x);
	}

	@Override
	public void TruTien(double x) {
		// TODO Auto-generated method stub
		super.TruTien(x);
	}
	
	public void ChonKyHan()
	{
		do 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Bạn muốn gửi tiết kiệm theo kỳ hạn nào?");
			System.out.println("1. Kỳ hạn 1 tháng với lãi xuất 0.25%");
			System.out.println("2. Kỳ hạn 1 quý (3 tháng) với lãi xuất 1%");
			System.out.println("3. Kỳ hạn 6 tháng với lãi xuất 3%");
			System.out.println("4. Kỳ hạn 1 năm với lãi xuất 7%");
			System.out.println("---------");
			System.out.print("Nhập lựa chọn của bạn: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				kyHan = "1 Tháng";
				laiXuat = (float) 0.0025;
				return;
			case 2:
				kyHan = "3 Tháng";
				laiXuat = (float) 0.01;
				return;
			case 3:
				kyHan = "6 Tháng";
				laiXuat = (float) 0.03;
				return;
			case 4:
				kyHan = "1 Năm";
				laiXuat = (float) 0.07;
				return;
			default : 
				System.out.println("Lựa chọn của bạn không tồn tại!!!"); 
				Choice ch = new Choice();
				if(ch.Revert())
					break;
				else
					return;
			}
		}
		while(true);
	}
	
	public void TinhLai() {
		Calendar ngayHienTai = new GregorianCalendar();
		ngayHienTai.setTime(Calendar.getInstance().getTime());
	    double soky = (ngayHienTai.getTimeInMillis() - ngayTinhLai.getTimeInMillis()) / (24 * 60 * 60 * 1000);
	    switch (kyHan) {
	        case "1 Tháng":
	            if ((int) soky / 30 >= 1) {
	                System.out.print("Tiền lãi của bạn tính từ ngày " + ngayTinhLai.getTime() + " ");
	                ngayTinhLai.add(Calendar.DAY_OF_MONTH, 30 * (int) (soky / 30));
	                System.out.println("đến ngày " + ngayTinhLai.getTime() + " là: " + (soDu * Math.pow(1 + laiXuat, (int) (soky / 30)) - soDu));
	                tongTienLai += soDu * Math.pow(1 + laiXuat, (int) (soky / 30)) - soDu;
	                soDu = soDu * Math.pow(1 + laiXuat, (int) (soky / 30));
	                System.out.println("Hũ tiết kiệm hiện tại có: " + soDu);
	            }
	            break;
	        case "3 Tháng":
	            if ((int) soky / 90 >= 1) {
	                System.out.print("Tiền lãi của bạn tính từ ngày " + ngayTinhLai.getTime() + " ");
	                ngayTinhLai.add(Calendar.DAY_OF_MONTH, 90 * (int) (soky / 90));
	                System.out.println("đến ngày " + ngayTinhLai.getTime() + " là: " + (soDu * Math.pow(1 + laiXuat, (int) (soky / 90)) - soDu));
	                tongTienLai += soDu * Math.pow(1 + laiXuat, (int) (soky / 90)) - soDu;
	                soDu = soDu * Math.pow(1 + laiXuat, (int) (soky / 90));
	                System.out.println("Hũ tiết kiệm hiện tại có: " + soDu);
	            }
	            break;
	        case "6 Tháng":
	            if ((int) soky / 180 >= 1) {
	                System.out.print("Tiền lãi của bạn tính từ ngày " + ngayTinhLai.getTime() + " ");
	                ngayTinhLai.add(Calendar.DAY_OF_MONTH, 180 * (int) (soky / 180));
	                System.out.println("đến ngày " + ngayTinhLai.getTime() + " là: " + (soDu * Math.pow(1 + laiXuat, (int) (soky / 180)) - soDu));
	                tongTienLai += soDu * Math.pow(1 + laiXuat, (int) (soky / 180)) - soDu;
	                soDu = soDu * Math.pow(1 + laiXuat, (int) (soky / 180));
	                System.out.println("Hũ tiết kiệm hiện tại có: " + soDu);
	            }
	            break;
	        case "1 Năm":
	            if ((int) soky / 365 >= 1) {
	                System.out.print("Tiền lãi của bạn tính từ ngày " + ngayTinhLai.getTime() + " ");
	                ngayTinhLai.add(Calendar.DAY_OF_MONTH, 365 * (int) (soky / 365));
	                System.out.println("đến ngày " + ngayTinhLai.getTime() + " là: " + (soDu * Math.pow(1 + laiXuat, (int) (soky / 365)) - soDu));
	                tongTienLai += soDu * Math.pow(1 + laiXuat, (int) (soky / 365)) - soDu;
	                soDu = soDu * Math.pow(1 + laiXuat, (int) (soky / 365));
	                System.out.println("Hũ tiết kiệm hiện tại có: " + soDu);
	            }
	            break;
	    }
	}
}
