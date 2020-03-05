package com.bluetie.Screens.android;

import org.apache.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.common.Base;
import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Step1 extends Utilities {
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Step1.class);
	//Location popup
		@AndroidFindBy(id="message")
		public WebElement LocationPopupMessage;
		
		//location permission popup
				@AndroidFindBy(id="permission_message")
				public WebElement permissionpopup;
		//allow button in permission popup
		@AndroidFindBy(id="permission_allow_button")
		public WebElement allowbutton;
		//Permissions Popup
				@AndroidFindBy(id="button1")
				public WebElement clickOnOk;
		//Ok Button in Location PopUp
				@AndroidFindBy(id="tv_profDetails_title")
				public WebElement step1Title;
		//Desingation
		@AndroidFindBy(id="et_profDetails_designation")
		public WebElement designationtext;
		
		//Organization Radio Button
		@AndroidFindBy(id="radioOrgnization")
		public WebElement organizationRadioButton;
		
		//selfEmployed Radio Button
		@AndroidFindBy(id="radioSelfEmployed")
		public WebElement SelfEmployedRadioButton;
		
		//CompanyName
		@AndroidFindBy(id="et_profDetails_company")
		public WebElement companyName;
		
		//Industry
		@AndroidFindBy(id="sp_industry")
		public WebElement industrydropdown;
		
		//Industrytext
		@AndroidFindBy(id="edt_enter_industry")
		public WebElement industryText;

		//Location
		@AndroidFindBy(id="et_basicInfo_city")
		public WebElement location;
		
		//Location Text
		@AndroidFindBy(id="et_baseCity")
		public WebElement locationText;
		
		//Step1next
		@AndroidFindBy(id="fab_next")
		public WebElement step1NextButton;
		
		//Profile image 
		@AndroidFindBy(id="iv_profDetails_profileImage")
		public WebElement step1ProfileImage;
		
		//TakePhoto
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Take Photo']")
		public WebElement takePhoto;
		
		//TakePhoto
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Choose from Gallery']")
		public WebElement chooseFromGallery;
		
		//Click on Flip to get Front camera
		@AndroidFindBy(id="flip")
		public WebElement frontCameraIcon;
		
		//click on Capture Picture 
				@AndroidFindBy(id="clickPicture")
				public WebElement clickOnCapturePicture;
		
				//click on Save 
				@AndroidFindBy(id="save")
				public WebElement imageSave;
				
				//click on cropImage
				@AndroidFindBy(id="crop_image_menu_crop")
				public WebElement clickOnCropImage;		
				
		
		public Step1(WebDriver driver) throws InterruptedException {
	        this.driver = driver;
	       
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	        Utilities.waitTime(1);
	    }
		
	//Click on Profile Image	
public void clickOnProfileImage() {
			
			
			try
			 
			 {
				
				step1ProfileImage.click();	
					log.info("clicked on Profile Image...");
			 
				 }catch(Exception e){	
					 log.info("Not able to click on Profile Image");
					 Assert.fail("Not able to click on Profile Image");
					  
				 }
           	}
		
	//click on Take Photo	
public void clickOnTakePhoto() {
	
	
	try
	 
	 {
		
		takePhoto.click();	
			log.info("clicked on Take Photo...");
	 
		 }catch(Exception e){	
			 log.info("Not able to click on Take Photo");
			 Assert.fail("Not able to click on Take Photo");
			  
		 }
   	}
		
//click on Camera flip icon to open Front camera	
public void clickOnFrontCameraIcon() {
	
	
	try
	 
	 {
		
		frontCameraIcon.click();	
			log.info("clicked on Front Camera Icon...");
	 
		 }catch(Exception e){	
			 log.info("Not able to click on Front Camera Icon");
			 Assert.fail("Not able to click on Front Camera Icon");
			  
		 }
 	}
		

//click on Capture Image Icon
public void clickOnCaptureImageIcon() {
	
	
	try
	 
	 {
		
		clickOnCapturePicture.click();	
			log.info("clicked on CapturePicture Icon...");
	 
		 }catch(Exception e){	
			 log.info("Not able to click on CapturePicture Icon");
			 Assert.fail("Not able to click on CapturePicture Icon");
			  
		 }
	}

//click on ImageSave
public void clickOnImageSave() {
	
	
	try
	 
	 {
		
		imageSave.click();	
			log.info("clicked on Image Save...");
	 
		 }catch(Exception e){	
			 log.info("Not able to click on imageSave Icon");
			 Assert.fail("Not able to click on imageSave Icon");
			  
		 }
	}

//click on ImageCrop
public void clickOnImageCrop() {
	
	
	try
	 
	 {
		
		clickOnCropImage.click();	
			log.info("clicked on Image Crop icon ....");
	 
		 }catch(Exception e){	
			 log.info("Not able to click on Image Crop Icon");
			 Assert.fail("Not able to click on Image Crop Icon");
			  
		 }
	}





		
			
		
		public void handlingLocationPopUp() {
		
		
		try
		 
		 {
				
			if(LocationPopupMessage.isDisplayed()) {

				clickOnOk.click();	
				log.info("clicked on location popup...");
				
		 }
			 
			 }catch(Exception e){			 
			 System.out.println("Location popup is not displayed");
			 
			 }

		}
		
		
		//Handling employment type radiobutton
		public void employmenttype() {
			
			
			try
			 
			 {
					
				if(SelfEmployedRadioButton.isDisplayed()) {

					SelfEmployedRadioButton.click();
					
					log.info("clicked on selfemployed radio button" );
			 }
				 
				 }catch(Exception e){			 
				
				Assert.fail("Not able to click selfemployed radio button");
				 }

			}
		//Entering Designation
		public void enteringDesignation(String designation) {
			
			
			try
			 
			 {
				//String welcome =driver.findElement(By.xpath("//android.widget.TextView[@text='Welcome']")).getText();	
				//if(welcome.contains("Welcome")) {

					designationtext.sendKeys(designation);
					
					log.info("Enter designation as : " +designation );
			// }
				 
				 }catch(Exception e){			 
				
					 log.info("Not able to see desgination text field");
					 Assert.fail("Not able to see desgination text field");
				 }

			}
		
		
		//Entering Designation
				public void enteringcompanyName(String company) {
					
					
					try
					 
					 {
							
						

							companyName.sendKeys(company);
							
							log.info("Enter companyname as : " +company );
					 
						 
						 }catch(Exception e){			 
						
							 log.info("Not able to see company text field");
							 Assert.fail("Not able to see desgination text field");
						 }

					}
				
				//clicking on  Industry dropdown
				public void industrydropdown() {
					
					
					try
					 
					 {
							
						

							industrydropdown.click();
							
							log.info("clicked on Industry dropdown" );
					 
						 
						 }catch(Exception e){			 
						
						Assert.fail("Not able to see industry dropdown");
						 }

					}
				//selecting industry from dropdown
				public void selectingIndustry(String industry,String industryexpectedtext) {
					
					
					try
					 
					 {
							
						

							industryText.sendKeys(industry);
							Utilities.waitTime(1);
							log.info("entered industry text as " +industry);
							driver.findElement(By.xpath("//android.widget.TextView[@text='Information Technology (IT)']")).click();
							
						 
						 }catch(Exception e){			 
						
						Assert.fail("Not able to see industry");
						 }

					}
				
				//clicking on  Industry dropdown
				public void baseLocationEditButton() {
					
					
					try
					 
					 {
							
						

							location.click();
							
							log.info("clicked on Location Edit button" );
					 
						 
						 }catch(Exception e){			 
						
						Assert.fail("Not able to see location Edit Button");
						 }

					}
				//selecting location from dropdown
				public void selectinglocaiton(String locationtext,String locationexpectedtext) {
					
					
					try
					 
					 {
							
						

							locationText.sendKeys(locationtext);
							Utilities.waitTime(1);
							log.info("entered location text as " +locationtext);
							//driver.findElement(By.xpath("//android.widget.TextView[@text='Information Technology (IT)']")).click();
							driver.findElement(By.xpath("//android.widget.TextView[@text='"+locationexpectedtext+"']")).click();
					 
						 
						 }catch(Exception e){			 
						
						Assert.fail("Not able to select location text");
						 }

					}
				
				//clicking on  step1 next
				public Step2 step1next() throws InterruptedException {
					
					
					try
					 
					 {
							
						
							 scrollToElementByid("fab_next");
							step1NextButton.click();
							
							log.info("clicked on step1 next icon" );
					 
						 
						 }catch(Exception e){			 
						
						Assert.fail("Not able to click step1 next icon");
						 }
					return new Step2(driver);
					}
				//Updating Profile Image by Taking Photo
				public void UpdatingProfileImageByTakingPhoto() {
					
					
					try
					 
					 {
						 Utilities.waitTime(2);
						clickOnProfileImage();
						Utilities.waitTime(2);
						clickOnTakePhoto();
//						Utilities.waitTime(2);
//						clickOnFrontCameraIcon();
						Utilities.waitTime(2);
						clickOnCaptureImageIcon();
						Utilities.waitTime(2);
						clickOnImageSave();
						Utilities.waitTime(2);
						clickOnImageCrop();
						Utilities.waitTime(2);
							log.info("Image Updated Successfully...");
					 
						 }catch(Exception e){	
							 log.info("Image not Updated");
							 Assert.fail("Image not Updated");
							  
						 }
					}
		
}
