package tests.android;

import org.testng.annotations.Test;

import com.bluetie.Screens.android.ExploreAnimations;
import com.bluetie.common.Base;
import com.bluetie.utility.Utilities;

public class ExploreAnimationTest extends Base {

	
	@Test(description = "clicking on explore animation steps")
    public void exploreanimationSteps() throws Exception {
		
		ExploreAnimations explore = new ExploreAnimations(driver);
		Utilities.waitTime(5);
		explore.handlingExploreAnimations();
		
	}
}
