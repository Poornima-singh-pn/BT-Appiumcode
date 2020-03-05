package tests.ios;

import org.testng.annotations.Test;

import com.bluetie.Screens.ios.ExploreAnimations;
import com.bluetie.common.Base;
import com.bluetie.utility.Utilities;

public class ExploreAnimationTest extends Base {

	
	@Test(description = "clicking on explore animation steps")
    public void exploreanimationSteps() throws Exception {
		
		ExploreAnimations explore = new ExploreAnimations(driver);
		//Utilities.waitTime(5);
		explore.handlingExploreAnimations();
		
	}
}
