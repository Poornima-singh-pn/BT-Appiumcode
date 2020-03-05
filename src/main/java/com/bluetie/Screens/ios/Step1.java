package com.bluetie.Screens.ios;

import org.apache.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.bluetie.common.Base;
import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Step1 extends Utilities {
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(Step1.class);
	//Location popup
		@AndroidFindBy(id="message")
		public MobileElement LocationPopupMessage;
		
		//location permission popup
				@AndroidFindBy(id="permission_message")
				public MobileElement permissionpopup;
		//allow button in permission popup
		@AndroidFindBy(id="permission_allow_button")
		public MobileElement allowbutton;
		//Permissions Popup
				@AndroidFindBy(id="button1")
				public MobileElement clickOnOk;
		//Ok Button in Location PopUp
				@AndroidFindBy(id="tv_profDetails_title")
				public MobileElement step1Title;
		//Desingation
				@iOSFindBy(xpath="//XCUIElementTypeTextField[@value='Designation*']")
				public MobileElement DESIGNATION;
		
		//Organization Radio Button
		@AndroidFindBy(id="radioOrgnization")
		public MobileElement organizationRadioButton;
		
		//selfEmployed Radio Button
		@AndroidFindBy(id="radioSelfEmployed")
		public MobileElement SelfEmployedRadioButton;
		
		//CompanyName
//		@AndroidFindBy(id="et_profDetails_company")
//		public MobileElement companyName;
		@iOSFindBy(xpath="//XCUIElementTypeTextField[@value='Company Name*']")
		public MobileElement COMPANY_TEXT;
		//Industry
		@iOSFindBy(xpath="//XCUIElementTypeTextField[@value='Select your Industry*']")
		public MobileElement INDUSTRY_DROPDOWN_CLICK;
		
		//Industrytext
		@iOSFindBy(accessibility="Select Industry")
		public MobileElement INDUSTRY_TEXT;
		//Location
		@iOSFindBy(accessibility="Pencil Blue")
		public MobileElement LOCATION_EDIT;
		
		//Location Text
				@iOSFindBy(accessibility="Search Location")
				public MobileElement LOCATION_TEXT;
		
		//Step1next
				@iOSFindBy(accessibility="nextWhite")
				public MobileElement STEP1_NEXT;
		
		//Profile image 
		@iOSFindBy(accessibility="+")
		public MobileElement IMAGE_ADD_ICON;
		
		//TakePhoto
		@iOSFindBy(accessibility="Take Photo")
		public MobileElement TAKE_PHOTO;
		
		//TakePhoto
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Choose from Gallery']")
		public MobileElement chooseFromGallery;
		
		//Click on Flip to get Front camera
		@AndroidFindBy(id="flip")
		public MobileElement frontCameraIcon;
		
		//click on Capture Picture 
				@iOSFindBy(accessibility="PhotoCapture")
				public MobileElement CAPTURE_PICTURE;
		
				//click on Save 
				@iOSFindBy(accessibility="Use Photo")
				public MobileElement IMAGE_SAVE;
		
				
				//click on cropImage
				@AndroidFindBy(id="crop_image_menu_crop")
				public MobileElement clickOnCropImage;		
				
		
		public Step1(AppiumDriver<MobileElement> driver) throws InterruptedException {
	        this.driver = driver;
	     //   PageFactory.initElements(driver, this);
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	       
	    }
		
	//Click on Profile Image	
public void clickOnProfileImage() {
			
			
			try
			 
			{
				if(IMAGE_ADD_ICON.isDisplayed()) {
				
				//step1ProfileImage.click();	
				tap(IMAGE_ADD_ICON);
					log.info("clicked on Profile Image...");
				}
				else {
					log.info("Not able to click on Profile Image");
				}
				 }catch(Exception e){	
					 log.info("Not able to click on Profile Image");
					 //Assert.fail("Not able to click on Profile Image");
					  
				 }
           	}
		
	//click on Take Photo	
public void clickOnTakePhoto() {
	
	
	try
	 
	 {
		if(TAKE_PHOTO.isDisplayed()) {
			
			//step1ProfileImage.click();	
			tap(TAKE_PHOTO);
			log.info("clicked on Take Photo...");
			}
			else {
				
		
				 log.info("Not able to click on Take Photo");
			}
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
		if(CAPTURE_PICTURE.isDisplayed()){
		//clickOnCapturePicture.click();	
		tap(CAPTURE_PICTURE);
		log.info("clicked on CapturePicture Icon...");
		}else {
			log.info("Not able to click on CapturePicture Icon");
		}
		 }catch(Exception e){	
			 log.info("Not able to click on CapturePicture Icon");
			 Assert.fail("Not able to click on CapturePicture Icon");
			  
		 }
	}

//click on ImageSave
public void clickOnImageSave() {
	
	
	try
	 
	 {
		
		//imageSave.click();	
		tap(IMAGE_SAVE);
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

					//designationtext.sendKeys(designation);
				//tap(DESIGNATION);
				setTextAs(DESIGNATION,designation);
				//DESIGNATION.sendKeys(designation);
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
							
						

							//companyName.sendKeys(company);
						setTextAs(COMPANY_TEXT,company);
						
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
							
						

							//industrydropdown.click();
						tap(INDUSTRY_DROPDOWN_CLICK);
							
							log.info("clicked on Industry dropdown" );
					 
						 
						 }catch(Exception e){			 
						
						Assert.fail("Not able to see industry dropdown");
						 }

					}
				//selecting industry from dropdown
				public void selectingIndustry(String industry,String industryexpectedtext) {
					
					
					try
					 
					 {
							
						

							//industryText.sendKeys(industry);
						setTextAs(INDUSTRY_TEXT,industry);
							Utilities.waitTime(1);
							log.info("entered industry text as " +industry);
							//driver.findElement(By.xpath("//android.widget.TextView[@text='Information Technology (IT)']")).click();
							
							driver.findElement(By.xpath("//XCUIElementTypeStaticText[@value='"+industryexpectedtext+"']")).click();
							
						 }catch(Exception e){			 
						
						Assert.fail("Not able to see industry");
						 }

					}
				
				//clicking on  Industry dropdown
				public void baseLocationEditButton() {
					
					
					try
					 
					 {
							
						

							//location.click();
							tap(LOCATION_EDIT);
							log.info("clicked on Location Edit button" );
					 
						 
						 }catch(Exception e){			 
						
						Assert.fail("Not able to see location Edit Button");
						 }

					}
				//selecting location from dropdown
				public void selectinglocaiton(String locationtext,String locationexpectedtext) {
					
					
					try
					 
					 {
							
						

							//locationText.sendKeys(locationtext);
						setTextAs(LOCATION_TEXT,locationtext);
						
							Utilities.waitTime(1);
							log.info("entered location text as " +locationtext);
							//driver.findElement(By.xpath("//android.widget.TextView[@text='Information Technology (IT)']")).click();
							//driver.findElement(By.xpath("//android.widget.TextView[@text='"+locationexpectedtext+"']")).click();
							driver.findElement(By.name(locationexpectedtext)).click();
						 
						 }catch(Exception e){			 
						
						Assert.fail("Not able to select location text");
						 }

					}
				
				//clicking on  step1 next
				public Step2 step1next() throws InterruptedException {
					
					
					try
					 
					 {
							
						
						scrollToElementByname("nextWhite");
							//step1NextButton.click();
							 tap(STEP1_NEXT);
							
							log.info("clicked on step1 next icon" );
					 
						 
						 }catch(Exception e){			 
						
						Assert.fail("Not able to click step1 next icon");
						 }
					return new Step2(driver);
					}
				public void LocationAllow() {
				try
				 
				 {
						
					

					if(driver.findElement(By.name("Allow")).isDisplayed()) {
					driver.findElement(By.name("Allow")).click();
				}
				 
					 
					 }catch(Exception e){			 
						 log.info("popup is not displayed" );
				
					 }

				}
				//Updating Profile Image by Taking Photo
				public void UpdatingProfileImageByTakingPhoto() {
					
					
					try
					 
					 {
						 Utilities.waitTime(2);
						clickOnProfileImage();
						Utilities.waitTime(5);
				//		clickOnTakePhoto();
//						Utilities.waitTime(2);
//						clickOnFrontCameraIcon();
						Utilities.waitTime(2);
						clickOnCaptureImageIcon();
						Utilities.waitTime(2);
						clickOnImageSave();
						Utilities.waitTime(2);
						
							log.info("Image Updated Successfully...");
					 
						 }catch(Exception e){	
							 log.info("Image not Updated");
							 Assert.fail("Image not Updated");
							  
						 }
					}
		
}
