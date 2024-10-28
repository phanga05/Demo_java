package Account;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
	private double hanMucThanhToan = 10000000;
	
	@Override
	public void CreatAccout() {
		// TODO Auto-generated method stub
		super.CreatAccout();
	}

	@Override
	public void CongTien(double x) {
		// TODO Auto-generated method stub
		super.CongTien(x);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void TruTien(double x) {
		// TODO Auto-generated method stub
		super.TruTien(x);
	}

	public TaiKhoanThanhToan(String soTaiKhoan, String matKhau, String tenChuTaiKhoan, double soDu, String maPin) {
		super(soTaiKhoan, matKhau, tenChuTaiKhoan, soDu, maPin);
		// TODO Auto-generated constructor stub
	}
	
}
