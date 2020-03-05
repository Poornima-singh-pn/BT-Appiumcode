package tests.ios;

import org.testng.annotations.Test;

import com.bluetie.Screens.ios.BottomNavigation;
import com.bluetie.Screens.ios.MyAccount;
import com.bluetie.Screens.ios.MyAccountSettings;
import com.bluetie.Screens.ios.Settings;
import com.bluetie.common.Base;
import com.bluetie.utility.Utilities;



public class SignoutTest extends Base  {

	@Test(description = "performing Signout")
    public void signout() throws Exception {
		BottomNavigation bottom= new BottomNavigation(driver);
		//Utilities.waitTime(5);
		bottom.clickOnMyAccount();
		MyAccount account = new MyAccount(driver);
		//Utilities.waitTime(5);
	   Settings se=account.menuClick();
	   MyAccountSettings managesetting= se.manageAccountClick();
	  // Utilities.waitTime(5);
	   managesetting. accountsignout();
	  // Utilities.waitTime(5);
//	   managesetting.clickingOnYes();
//	   Utilities.waitTime(2);
    }
	
}
