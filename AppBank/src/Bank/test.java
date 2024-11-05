package Bank;

import java.io.File;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		ListAccount listPay = new ListAccount(1);
		ListAccount listSave = new ListAccount(2);
		String FileName = "Account5.txt";
		File f = new File(FileName);
		Scanner sc = new Scanner(System.in);
		Check ck = new Check();
		char choice = 0;
		RWFile.DocFile(f, listPay.list, listSave.list);
		try
		{
			while(true)
			{
				System.out.println("\n--------------------------------------------------");
				System.out.println("<<Trang Chủ>>");
				System.out.println("1. Đăng Nhập");
				System.out.println("2. Đăng ký");
				System.out.println("0. Thoát");
				System.out.println("---------");
				System.out.print("Nhập lựa chọn của bạn: ");
				choice = sc.nextLine().charAt(0);
				switch(choice)
				{
					case '1' : listPay.LogIn(listSave);break;
					case '2' : listPay.SignIn();break;
					case '0' : {
//						listPay.CloseFileData(f);
						RWFile.GhiFile(f, listPay.list, listSave.list);
						return;
					}
					default:
						System.out.println("---------");
						System.out.println("Lựa chọn của bạn không tồn tại!!!"); 
						if(ck.Choice())
							break;
						else 
							return;
				}
			}
		}
		catch(Exception e)
		{
			System.out.print("Lỗi nhập liệu: "+ e.getMessage());
			if(ck.Choice())
				return;
		}
	}
}
			
