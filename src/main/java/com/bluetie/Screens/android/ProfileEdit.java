package com.bluetie.Screens.android;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfileEdit {

	//PersonalDetails Edit icon
	@AndroidFindBy(id = "iv_editProf_personalDetail")
	public WebElement personalDetailsEdit;
	
	//BlueTie Pin Edit icon
		@AndroidFindBy(id = "iv_editProf_editBTpin")
		public WebElement blueTiePinEdit;
		//About add icon
				@AndroidFindBy(id = "iv_editProf_addAbout")
				public WebElement aboutAddicon;	
				
				//About edit icon
				@AndroidFindBy(id = "iv_editProf_editAbout")
				public WebElement aboutEditicon;	
				
				//Industry Experience edit icon
				@AndroidFindBy(id = "iv_editProf_edit_industry")
				public WebElement industryExperienceEdit;
				
				//Networking Objectives edit icon
				@AndroidFindBy(id = "iv_editProf_editObjectives")
				public WebElement networkingObjectivesEdit;
				
				//Fortes edit icon
				@AndroidFindBy(id = "iv_editProf_editSkills")
				public WebElement fortesEdit;
				
				//Work Experience Edit
				@AndroidFindBy(id = "iv_editProf_editExperience")
				public WebElement workExperienceEdit;
				
				//Add Links 
				@AndroidFindBy(id = "iv_editProf_addLink")
				public WebElement linkAdd;
				
				//Professional Catalogue add 
				@AndroidFindBy(id = "iv_editProf_addDoc")
				public WebElement professionalCatalogueAdd;
				
				//Educational Details Add 
				@AndroidFindBy(id = "iv_editProf_addEducation")
				public WebElement eductionDetailsAdd;
				
				//Achievements Add 
				@AndroidFindBy(id = "iv_editProf_addAchievements")
				public WebElement achievementAdd;
				
				//Edit Links 
				@AndroidFindBy(id = "iv_editProf_editLink")
				public WebElement linkEdit;
				
				//Educational Details Edit
				@AndroidFindBy(id = "iv_editProf_editEducation")
				public WebElement eductionDetailsEdit;

				//Achievements Edit
				@AndroidFindBy(id = "iiv_editProf_editAchievements")
				public WebElement achievmentEdit;
}
