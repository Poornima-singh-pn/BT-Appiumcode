package rough;

import java.io.File;

import org.testng.annotations.Test;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public class Class1 {
	
	@Test
	public void printtext() {
		
		 String result = null;
		
		  File imageFile = new File("/Users/sreehari/BlueTieWorkspace/BlueTieAutomationFramework/screenshots/bluetie1.png");
	      ITesseract instance = new Tesseract();  
	      try {
	    	  System.out.println("Image name is :" + imageFile.toString());  
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
	          System.out.println("result is :" + result);
	     
	      } catch (TesseractException e) {
	          System.err.println(e.getMessage());
	      }
		
	  }
	
	
	
}
