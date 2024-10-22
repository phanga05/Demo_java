package Bai1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Nhập bán kính của hình tròn: ");
	     double banKinh = sc.nextDouble();
	     HinhTron ht = new HinhTron(banKinh);
	     System.out.println("Chu vi hình tròn: " + ht.tinhChuVi());
	        System.out.println("Diện tích hình tròn: " + ht.tinhDienTich());
	}
}
	        

	        
	        

	       

	
		        
		        

		       
		       
		    
		

	


