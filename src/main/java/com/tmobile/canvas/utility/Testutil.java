package com.tmobile.canvas.utility;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testutil extends Baseclass {
	
	//shadowhost
	@FindBy(tagName = "unrelease-microapp")
	static WebElement root2;

	 static int page_load_timeout = 20;
	 static int Implicit_Wait = 30;
	
	public Testutil() {
	PageFactory.initElements(driver, this);
			
		}
	
//dateselector base on while loop
  
 String dateclick = ".sc-eGJWMs.gQYBcx>:nth-child(2)>button>span";
 String monthtext = ".react-datepicker__month-container>div>div>:first-child";
 String Yearstext = ".react-datepicker__month-container>div>div>:nth-child(2)";
 String backbtn = "div.sc-cxNHIi.fHUQtx>:last-child>svg";

	
 
     //dateselector base on while loop
  public void dateselector() throws InterruptedException {
  Thread.sleep(1000);
  String expecteddate= "12-August-2021";
  String emonth = expecteddate.split("-")[1];
  String eyear = expecteddate.split("-")[2];
  String edate = expecteddate.split("-")[0];
		
  shadowdomfindcss(dateclick).click();
  String cmonth =shadowdomfindcss(monthtext).getText().trim();  
  System.out.println("current month is" +cmonth);
  String cyear = shadowdomfindcss(Yearstext).getText();
  System.out.println("current year is " +cyear);
		     
  while((!cmonth.equals(emonth)) || (!cyear.equals(eyear))) {
   	
  shadowdomfindcss(backbtn).click();
		    	
  cmonth =shadowdomfindcss(monthtext).getText().trim();  
	 		     
  cyear = shadowdomfindcss(Yearstext).getText();
		     }
  WebElement shadowdomroot = shadowdom();
  List <WebElement> date = shadowdomroot.findElements(By.cssSelector("div[tabindex='-1'][role='button'][aria-disabled='false']"));
	     
		     for(WebElement e :date) {
		    	 if(e.getText().trim().equals(edate)) {
		    		 e.click();
		    		 break;
		    	 }
		     }
		     
	  }	 	
	

  
  
  
  public void takescreenshotmethod(String filename) throws IOException {
	  TakesScreenshot scrShot =((TakesScreenshot)driver);
		File file=scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\piktor\\Documents\\"
				+ "CANVAS Project\\Canvas_Project\\target"+filename+".jpg"));
  }
  
  
  
  
  
	  
	  
 public static WebElement shadowdomfindcss(String element) {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	WebElement shadowdom = (WebElement)jse.executeScript("return arguments[0].shadowRoot", root2);
		
		//now we entered into shadowdom with the help of shadowhost giving it in jse.
		
	WebElement shadowroot=shadowdom.findElement(By.cssSelector(element));
	return shadowroot;
			
		}

 public static WebElement shadowdom() {             
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement shadowdom = (WebElement)jse.executeScript("return arguments[0].shadowRoot", root2);
		return shadowdom;
	}
	
 	
	  
}
