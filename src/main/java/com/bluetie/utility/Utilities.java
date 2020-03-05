package com.bluetie.utility;

import java.io.File;



import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;

import com.bluetie.Screens.android.Step1;
import com.bluetie.common.Base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;
import com.bluetie.helper.Logger.LoggerHelper;

public class Utilities extends Base{
	/*public static String screenshotPath;
	public static String screenshotName;
public static void captureScreenshot() throws IOException {
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d= new Date();
		
		screenshotName=d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		FileHandler.copy(scrFile, new File(System.getProperty("user.dir")+"\\target\\"+screenshotName));
	}  */ 
	
public static String mailscreenshotpath;
private final Logger log = LoggerHelper.getLogger(Step1.class);
private static int timeout;
	
	public static void captureScreenshot(String methodName) throws IOException{
		
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.HOUR_OF_DAY);
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
	    	//mailscreenshotpath =System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\screenshots\\"+ methodName+"_"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
	    	File dir1 = new File(System.getProperty("user.dir")+"/target/surefire-reports/html/screenshots");  //Specify the Folder name here

	    	dir1.mkdir( );  //Creates the folder with the above specified name
	    	mailscreenshotpath =System.getProperty("user.dir")+"/target/surefire-reports/html/screenshots/"+ methodName+"_"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".png";
	    	FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		
		
	}
	
	}
	
	//OCR Reading

	public static String OCR(String ImagePath)
	{
		 String result = null;
		  File imageFile = new File(ImagePath);
	      ITesseract instance = new Tesseract();  
	      try {
	    	  File tessDataFolder = LoadLibs.extractTessResources("tessdata"); // Extracts
              // Tessdata
              // folder
              // from
              // referenced
              // tess4j
              // jar
              // for
              // language
              // support
instance.setDatapath(tessDataFolder.getAbsolutePath());
	          result = instance.doOCR(imageFile);
	     
	      } catch (TesseractException e) {
	          System.err.println(e.getMessage());
	      }
		return result;
	  }


	
	@DataProvider(name="dp")
	public static Object[][] getData(Method m){
		
		String sheetName=m.getName();
		
		int rows=excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
		
		Object[][] data= new Object[rows-1][1];
		Hashtable<String,String>table=null;
		
		for(int rowNum=2;rowNum<=rows;rowNum++) {
			table= new Hashtable<String,String>();
			for(int colNum=0;colNum<cols;colNum++) {
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum-2][0]=table;                    
			}
		}
		return data;
	}
//public static boolean isTestRunnable(String testName, ExcelReader excel){
//		
//		String sheetName="test_suite";
//		int rows = excel.getRowCount(sheetName);
//		
//		
//		for(int rNum=2; rNum<=rows; rNum++){
//			
//			String testCase = excel.getCellData(sheetName, "TCID", rNum);
//			
//			if(testCase.equalsIgnoreCase(testName)){
//				
//				String runmode = excel.getCellData(sheetName, "Runmode", rNum);
//				
//				if(runmode.equalsIgnoreCase("Y"))
//					return true;
//				else
//					return false;
//			}
//			
//			
//		}
//		return false;
//	}


//make zip of reports
//		public static void zip(String filepath){
//		 	try
//		 	{
//		 		File inFolder=new File(filepath);
//		 		File outFolder=new File("Reports.zip");
//		 		ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outFolder)));
//		 		BufferedInputStream in = null;
//		 		byte[] data  = new byte[1000];
//		 		String files[] = inFolder.list();
//		 		for (int i=0; i<files.length; i++)
//		 		{
//		 			in = new BufferedInputStream(new FileInputStream
//		 			(inFolder.getPath() + "/" + files[i]), 1000);  
//		 			out.putNextEntry(new ZipEntry(files[i])); 
//		 			int count;
//		 			while((count = in.read(data,0,1000)) != -1)
//		 			{
//		 				out.write(data, 0, count);
//		 			}
//		 			out.closeEntry();
//	  }
//	  out.flush();
//	  out.close();
//		 	
//	}
//	  catch(Exception e)
//	  {
//		  e.printStackTrace();
//	  } 
//	 }
	
	
	
	public static void scroll(int fromX, int fromY, int toX, int toY) {
	    TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
	    touchAction.longPress(PointOption.point(fromX, fromY)).moveTo(PointOption.point(toX, toY)).release().perform();
	}
	
	public static void swipedown() throws InterruptedException {
		int screenWidth = driver.manage().window().getSize().getWidth();
		int screenHeight =
		driver.manage().window().getSize().getHeight();
		int startx = screenWidth/2;
		int endx = screenWidth/2;
		int starty = screenHeight*2/3;
		int endy = screenHeight/3;
		scroll(startx, starty, endx, endy);
		
	}
	
	public static void swipeup() throws InterruptedException {
		int screenWidth = driver.manage().window().getSize().getWidth();
		int screenHeight =
		driver.manage().window().getSize().getHeight();
		int startx = screenWidth/2;
		int endx = screenWidth/2;
		int starty = screenHeight/3;
		int endy = screenHeight*2/3;
		scroll(startx, starty, endx, endy);
		
	}
	
	
	
	
	public static WebElement scrollToElementByXpath(String xpathValue) throws InterruptedException {
		WebElement element = null;
		boolean flag = false;
		int run=1;
		while(run < 5) {
			try{
				element = driver.findElement(By.xpath(xpathValue));
					if(element.isDisplayed()) {
						flag = true;
						break;
					}else {
						System.out.println("Element not found, scrolling down");
						swipedown();
					}			
				
			}catch(NoSuchElementException e) {
				System.out.println("Element not found, scrolling down");
				swipedown();
			}
			run++;
		}
		if(!flag) {
			Assert.fail("Element not found even after scrollings");
		}
		
		return element;
				
	}
	
	public static WebElement scrollToElementByid(String id) throws InterruptedException {
		WebElement element = null;
		boolean flag = false;
		int run=1;
		while(run < 5) {
			try{
				element = driver.findElement(By.id(id));
					if(element.isDisplayed()) {
						flag = true;
						break;
					}else {
						System.out.println("Element not found, scrolling down");
						swipedown();
					}			
				
			}catch(NoSuchElementException e) {
				System.out.println("Element not found, scrolling down");
				swipedown();
			}
			run++;
		}
		if(!flag) {
			Assert.fail("Element not found even after scrollings");
		}
		
		return element;
				
	}
	

	public static WebElement scrollToTopElement(String xpathValue) throws InterruptedException {
		WebElement element = null;
		boolean flag = false;
		int run=1;
		while(run < 5) {
			try{
				element = driver.findElement(By.xpath(xpathValue));
					if(element.isDisplayed()) {
						flag = true;
						break;
					}else {
						System.out.println("Element not found, scrolling up");
						swipeup();
					}			
				
			}catch(NoSuchElementException e) {
				System.out.println("Element not found, scrolling up");
				swipeup();
			}
			run++;
		}
		if(!flag) {
			Assert.fail("Element not found even after scrollings");
		}
		
		return element;
				
	}
	public static WebElement scrollToElementByname(String name) throws InterruptedException {
		WebElement element = null;
		boolean flag = false;
		int run=1;
		while(run < 5) {
			try{
				element = driver.findElement(By.name(name));
					if(element.isDisplayed()) {
						flag = true;
						break;
					}else {
						System.out.println("Element not found, scrolling down");
						swipedown();
					}			
				
			}catch(NoSuchElementException e) {
				System.out.println("Element not found, scrolling down");
				swipedown();
			}
			run++;
		}
		if(!flag) {
			Assert.fail("Element not found even after scrollings");
		}
		
		return element;
				
	}
	
	//Function to verify element is present
			public boolean isElementPresent(WebElement element) {
		        try {
		        	if(element.isDisplayed())  {
		        		return true;
		        	} else {
		        		//System.out.println(element + " Element not present");
		        		return false;
		        	}
		        } catch (Exception e) {
		        	//System.out.println(element + " Element not present");
		            return false;
		        }
		    }
			
			public static void waitTime(int i) {
				try {
					i=i*1000;
					Thread.sleep(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			
			public static File getFile(String fileName) throws IOException {
		        if (Utilities.class.getClassLoader().getResourceAsStream(fileName) != null) {
		            InputStream resourceAsStream = Utilities.class.getClassLoader().getResourceAsStream(fileName);
		            File file = new File(fileName, "");
		            FileUtils.copyInputStreamToFile(resourceAsStream, file);
		            return file;
		        } else {
		            return new File(fileName);
		        }
		    }

		    public static void createDirectoryIfNotExist(File directory) {
		        if (!directory.exists()) {
		            File dir = new File("./" + directory);
		            dir.mkdirs();
		        }
		    }

		    public static void copyFileToDirectory(File file, File directory) throws IOException {
		        createDirectoryIfNotExist(directory);
		        FileUtils.copyFileToDirectory(file, directory, true);
		    }

		    public static void forceDelete(File file) throws IOException {
		        file.delete();
		    }
		    
		    public void selectingvalueFromDropdown(List<WebElement> DropdownList,String Value) {
				//log.info("Selecting the value from dropdown is ..." + Company);
				for(int i=0;i<DropdownList.size();i++) {
				String text= DropdownList.get(i).getText();
				
				if(text.equals(Value)) {
					DropdownList.get(i).click();
					break;
				}
				
				}
			}
		    

		    public void waitForElementClickable(WebElement element) throws IOException {
		        WebDriverWait wait = new WebDriverWait(driver, 15);
		        wait.until(ExpectedConditions.elementToBeClickable(element));
		    }

		    public void waitForElementVisible(WebElement element) throws IOException {
		        WebDriverWait wait = new WebDriverWait(driver, 15);
		        wait.until(ExpectedConditions.visibilityOf(element));
		    }

		    public void waitForElementVisible(String xpath) throws IOException {
		        //WebDriverWait wait = new WebDriverWait(driver, 15);
		        //wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath(xpath)));
		        wait(2);
		    }

		    public void tap(WebElement element) throws IOException {
		        waitForElementVisible(element);
		        element.click();
		    }

		    public void tapByXpath(String xpath) throws IOException {
		        WebElement element = driver.findElement(By.xpath(xpath));
		        WebDriverWait wait = new WebDriverWait(driver, 15);
		        wait.until(ExpectedConditions.visibilityOf(element));
		        element.click();
		    }

		    public void replaceXpathAndTapElement(String xpathWithPlaceHolder, String textToBeReplaced, String replacementText) throws IOException {
		        String modifiedXpath = xpathWithPlaceHolder.replace(textToBeReplaced, replacementText);
//		        WebDriverWait wait = new WebDriverWait(driver, 15);
//		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(modifiedXpath)));
		        wait(2);
		        driver.findElement(By.xpath(modifiedXpath)).click();
		    }

		    public void replaceXpathAndTapElementInFrame(String frameXpath, String xpathWithPlaceHolder, String textToBeReplaced, String replacementText) throws IOException {
		        String modifiedXpath = xpathWithPlaceHolder.replace(textToBeReplaced, replacementText);
		        WebDriverWait wait = new WebDriverWait(driver, 15);
		        // Find frame and switch
		        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(frameXpath)));
		        // Now find the the element
		        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(modifiedXpath)));
		        element.click();
		        // Switch back to default
		        driver.switchTo().defaultContent();
		    }

		    public void setTextAs(WebElement element, String text) throws IOException {
		        waitForElementClickable(element);
		        element.sendKeys(text);
		    }

		    public void clearText(WebElement element) throws IOException {
		        waitForElementClickable(element);
		        element.clear();
		    }

		    public WebElement getElementByReplacingXpath(WebElement element, String textToBeReplaced, String replacementText) throws IOException {
		        String modifiedXpath = element.getAttribute("xpath").replace(textToBeReplaced, replacementText);
		        WebDriverWait wait = new WebDriverWait(driver, 15);
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(modifiedXpath)));
		        return driver.findElement(By.xpath(modifiedXpath));

		    }

		    public void replaceXpathAndTapElement(WebElement element, String textToBeReplaced, String replacementText) throws IOException {
		        String modifiedXpath = element.getAttribute("xpath").replace(textToBeReplaced, replacementText);
		        WebDriverWait wait = new WebDriverWait(driver, 15);
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(modifiedXpath)));
		        driver.findElement(By.xpath(modifiedXpath)).click();
		    }

		

		    public void isFailed(WebElement element, String expectedPageTitle) throws IOException {
		        waitForElementVisible(element);
		        Assert.assertTrue(element.isDisplayed(), "Page title locator is invalid.");
		        Assert.assertTrue(element.getAttribute("name").equals(expectedPageTitle), "Expected result is not obtained");
		    }

		    public void isSuccess(WebElement element, String expectedPageTitle) throws IOException {
		        waitForElementVisible(element);
		        Assert.assertTrue(element.isDisplayed(), "Page title locator is invalid.");
		        Assert.assertTrue(element.getAttribute("name").equals(expectedPageTitle), "Expected result is not obtained");
		    }

		    public void isElementAttributeValueEquals(WebElement element, String attributeName, String attributeValue) throws IOException {
		        waitForElementVisible(element);
		        Assert.assertTrue(element.isDisplayed(), "Element cannot be found.");
		        Assert.assertEquals(element.getAttribute(attributeName), attributeValue, "Element's attribute "+attributeName+" is mismatched.");
		    }

		    public void isPageTitleEquals(WebElement element, String expectedPageTitle) throws IOException {
		        waitForElementVisible(element);
		        Assert.assertTrue(element.isDisplayed(), "Page title locator is invalid.");
		        Assert.assertEquals(element.getAttribute("name"), expectedPageTitle, "Page title mismatched.");
		    }

		    public void isElementNameEquals(WebElement element, String elementText) throws IOException {
		        waitForElementVisible(element);
		        Assert.assertTrue(element.isDisplayed(), "Element cannot be found.");
		        Assert.assertEquals(element.getAttribute("name"), elementText, "Element text mismatched.");
		    }

		    public void isElementValueEquals(WebElement element, String attributeValue) throws IOException {
		        waitForElementVisible(element);
		        Assert.assertTrue(element.isDisplayed(), "Element cannot be found.");
		        Assert.assertEquals(element.getAttribute("value"), attributeValue, "Element's value is mismatched.");
		    }

		    public void isElementValueEquals(String elementXpath, String attributeValue) throws IOException {
		        wait(3);
		        WebElement element =driver.findElement(By.xpath(elementXpath));
		        Assert.assertTrue(element.isDisplayed(), "Element cannot be found.");
		        Assert.assertEquals(element.getAttribute("value"), attributeValue, "Element's value is mismatched.");
		    }

		    public void isElementLabelEquals(WebElement element, String attributeValue) throws IOException {
		        waitForElementVisible(element);
		        Assert.assertTrue(element.isDisplayed(), "Element cannot be found.");
		        Assert.assertEquals(element.getAttribute("label"), attributeValue, "Element's value is mismatched.");
		    }

		    public void isElementAccessibilityIdTextEquals(WebElement element, String elementText) throws IOException {
		        waitForElementVisible(element);
		        waitForElementVisible(element);
		        Assert.assertEquals(element.getAttribute("name"), elementText, "Element text mismatched.");
		    }

		    public void isElementTextEquals(WebElement element, String elementText) throws IOException {
		        waitForElementVisible(element);
		        String actualTextInElement = element.getAttribute("text");
		        Assert.assertEquals(actualTextInElement, elementText, "Element text mismatched.");
		    }

		    public void isTextEquals(WebElement element, String buttonText) throws IOException {
		        waitForElementVisible(element);
		        isElementNameEquals(element, buttonText);
		    }

		    public void isLabelTextEquals(String visibleText) {
		        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+visibleText+"\"]"));
		    }

		    public void isElementVisibleByValue(WebElement element) throws IOException {
		        waitForElementVisible(element);
		        Assert.assertTrue(element.isDisplayed(), "Element cannot be found.");
		    }

		   

		 

		    public void isElementNotVisible(WebElement element) throws IOException {
		        try {
		            Assert.assertFalse(element.isDisplayed(), "Element has found.");
		            Assert.fail("\"" + element.getText() + "\"" + " Element has found");
		        } catch (NoSuchElementException ex){
		            ex.printStackTrace();
		        }
		    }

		   

		    public void wait(int seconds){
		        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		        
		    }
		  
}
