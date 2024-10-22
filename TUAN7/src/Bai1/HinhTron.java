package Bai1;

public class HinhTron {
	
	    private double banKinh;
	 
	    public HinhTron(double banKinh) {
	        setBanKinh(banKinh);
	    }
	    
	    public double getBanKinh() {
	        return banKinh;
	    }

	    public void setBanKinh(double banKinh) {
	        if (banKinh > 0) 
	            this.banKinh = banKinh;
	        else 
	            System.out.println("Bán kính phải lớn hơn 0.");
	    }

	    public double tinhChuVi() {
	        return 2 * Math.PI * banKinh;
	    }
	    
	    public double tinhDienTich() {
	        return Math.PI * banKinh * banKinh;
	    }
	}



