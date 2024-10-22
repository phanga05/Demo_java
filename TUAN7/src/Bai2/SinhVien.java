package Bai2;

public class SinhVien {
    private String maSinhVien;
    private String ten;
    private String ngaySinh;
    private double diemTrungBinh;
    private String hocLuc;
   
    public SinhVien(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        setDiemTrungBinh(diemTrungBinh);  
        this.hocLuc = xepLoai(); 
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        if (diemTrungBinh >= 0 && diemTrungBinh <= 10) {
            this.diemTrungBinh = diemTrungBinh;
            this.hocLuc = xepLoai(); 
        } else 
            System.out.println("Điểm trung bình không hợp lệ (phải nằm trong khoảng 0 - 10).");
        
    }

    public String getHocLuc() {
        return hocLuc;
    }

    public String xepLoai() {
        if (diemTrungBinh >= 8.5) 
            return "Giỏi";
        else 
        	if (diemTrungBinh >= 7.0) 
        		return "Khá";
        	else 
        		if (diemTrungBinh >= 5.0) 
        			return "Trung bình";
        		else 
        			return "Yếu";
    }

    public void hienThiThongTin() {
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Tên: " + ten);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("Học lực: " + hocLuc);
    }
}
