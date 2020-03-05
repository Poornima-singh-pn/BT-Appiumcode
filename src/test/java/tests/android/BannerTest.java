package tests.android;

import org.testng.annotations.Test;

import com.bluetie.Screens.android.Banners;
import com.bluetie.common.Base;


public class BannerTest extends Base{
	@Test(description = "Login with Gmail")
    public void bannersclick() throws Exception {
		Banners banner = new Banners(driver);
		banner.clickOnBanner1Button();
		banner.clickOnBanner2Button();
		banner.clickOnBanner3Button();
	    
	
        
    }
}
