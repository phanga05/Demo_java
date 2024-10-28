package Check;

import java.util.HashMap;

import Account.TaiKhoanNganHang;
import Feature.ListAccount;

public class CheckInformation {
	public boolean CheckFormatSdt(String sdt)
	{
		return (sdt.charAt(0) == '0' && sdt.length() == 10 && sdt.matches("[0-9]+")); 
	};
	
	public boolean CheckSdtAccount(HashMap<String, TaiKhoanNganHang> list, String sdt)
	{
		return (list.containsKey(sdt));
	}
	public static boolean CheckPassword(String password) 
	{
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
	}
	
	public boolean CheckMaPIN(String maPIN)
	{
		return (maPIN.length() == 6 && maPIN.matches("[0-9]+")); 
	};
	
	public boolean CheckLogIn(ListAccount list, String stk, String mk)
	{
		return (list.list.get(stk).getMatKhau().equals(mk));
	}
	
	public boolean CheckMaPIN(String maPIN1, String maPIN2)
	{
		return (maPIN1.equals(maPIN2));
	}
}
