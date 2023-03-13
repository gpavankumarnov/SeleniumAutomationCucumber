package com.tmobile.canvas.intakepage.pageobj;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.tmobile.canvas.utility.Baseclass;
import com.tmobile.canvas.utility.Testutil;

public class RMIL3page extends Baseclass {

	Testutil util;
	
	
// @RMIL3page_searchfieldTest

	 String RMIsearchfield = "input[placeholder='Search'][aria-label='Search']";
	 String X_crossbutton = "svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeSmall[aria-hidden='true'][aria-label='clear']";
	
//  @searchfieldfiltercheck_basedoncalendarduration
	 
	 String Fromdateclick = "div[style='position: relative;']>:nth-child(1)>span>svg[style='margin-right: 0.25rem;']";
	 String monthtext = ".sc-cxNHIi.fHUQtx>:nth-child(1)";
	 String Yearstext = ".sc-cxNHIi.fHUQtx>:nth-child(2)";
	 String backbtn = "div.sc-cxNHIi.fHUQtx>:last-child>svg";
	 String Forwardbtn = "div.sc-iJCRrE.ckYLYy>svg";
	 
	 
	 String Todateclick = "div[style='position: relative;']>:nth-child(2)>span>svg[style='margin-right: 0.25rem;']";
	 String To_monthtext = ".sc-cxNHIi.fHUQtx>:nth-child(1)";
	 String To_Yearstext = ".sc-cxNHIi.fHUQtx>:nth-child(2)";
	 String To_backbtn = "div.sc-cxNHIi.fHUQtx>:last-child>svg";
	 String To_Forwardbtn = "div.sc-iJCRrE.ckYLYy>svg";
	 
	 
	String RMIIDcollect = ".sc-liAPKD.iwClXr[href^='/unrelease/rcm/RMI']";
	String NoRecordsDisplay = "td[colspan='24']"; 

//@RMIIDlinktext

	String RMIIDlinktext = "tbody.MuiTableBody-root>tr[path='0']>td:nth-of-type(3) a";
	String RMIIDdetailpgevalidation = "li.MuiBreadcrumbs-li p"; 
	
//Download button functionality
	
	String downloadbtn = ".sc-iemWCZ.UvBtS>:last-child>:last-child>div>div>span>button>span>a>div>svg";
	
	
//Verticall3pageview test
	
	String verticall3btn = ".sc-bXexck.cMGGEg>:nth-child(3)>div>:nth-child(2)";
	
//RMIIDdata edit
	
	String RMIdataedit = "tbody.MuiTableBody-root>tr>td+td>div>button";
	
	String Reqtype = "input[aria-invalid='false'][placeholder='Request Type'][type='text']";
	String Environment = "input[placeholder='Environment Request IDs'][aria-label='Environment Request IDs']";
	String Descrip = "input[placeholder='Description'][aria-label='Description']";
	String Chngecode = "input[placeholder='Change Type'][type='text']";
	String TestDL = "input[placeholder='Test Delivery Lead']";
	String Chrgecode = "input[placeholder='Charge Code']";
	String Deployw = "input[placeholder='Deployment Window']";
	
	String RMIdatatickmark = "div[style='display: flex;']>button>span>svg";
	
	
	
//Scenario - RMIl3page searchfield test
		
   public void submittedrmisearchfield(String RMIid) throws InterruptedException {
			Thread.sleep(2000);
			Testutil.shadowdomfindcss(RMIsearchfield).sendKeys(RMIid);
			System.out.println(Testutil.shadowdomfindcss(RMIsearchfield).getText());
   }
   
   public void X_crossbtnclick() {
			Testutil.shadowdomfindcss(X_crossbutton).click();
			System.out.println(Testutil.shadowdomfindcss(RMIsearchfield).getText());
		
		}
		
		
	public void validatingsearchfieldfilter(String filename, String rmiid) throws IOException {
			Testutil.shadowdomfindcss(RMIsearchfield).sendKeys(rmiid);
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File file=scrShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\piktor\\Documents\\"
					+ "CANVAS Project\\Canvas_Project\\target"+filename+".jpg"));
			
		}
	
//  @searchfieldfiltercheck_basedoncalendarduration
	

	public void rmisearchfieldbasedoncalendardura() throws InterruptedException {
		Thread.sleep(1000);
		String expectedfromddate = "10-August-2021";
		String efrommonth = expectedfromddate.split("-")[1];
		String efromyear = expectedfromddate.split("-")[2];
		String efromdate = expectedfromddate.split("-")[0];
		
			Testutil.shadowdomfindcss(Fromdateclick).click();
		
		String cmonth = Testutil.shadowdomfindcss(monthtext).getText();
		String cyear = Testutil.shadowdomfindcss(Yearstext).getText();
		
		while((!cmonth.equals(efrommonth)) || (!cyear.equals(efromyear))) 
		{
			Testutil.shadowdomfindcss(backbtn).click();
			cmonth = Testutil.shadowdomfindcss(monthtext).getText();
			cyear = Testutil.shadowdomfindcss(Yearstext).getText();
			System.out.println("current month after click on from calendar is " +cmonth +cyear);
		}
		
    WebElement shadowdomroot = Testutil.shadowdom();
    List <WebElement> fromdates = shadowdomroot.findElements(By.cssSelector("div[tabindex='-1'][role='button'][aria-disabled='false']"));
		
	for(WebElement e : fromdates)	{
		if(e.getText().trim().equals(efromdate)) {
		e.click();
		break;
		}
	}

	Thread.sleep(2000);
	String expectedtodate = "28-November-2021";
	String etomonth = expectedtodate.split("-")[1];
	String etoyear = expectedtodate.split("-")[2];
	String etodate = expectedtodate.split("-")[0];
	
	Thread.sleep(5000);
	Testutil.shadowdomfindcss(Todateclick).click();
	
	String tocmonth = Testutil.shadowdomfindcss(To_monthtext).getText();
    String tocyear = Testutil.shadowdomfindcss(To_Yearstext).getText();
    
    while((!tocmonth.equals(etomonth)) || (!tocyear.equals(etoyear)))
    {
    	
    	Testutil.shadowdomfindcss(To_Forwardbtn).click();
    	tocmonth = Testutil.shadowdomfindcss(To_monthtext).getText();
    	tocyear = Testutil.shadowdomfindcss(To_Yearstext).getText();
    	System.out.println("current month after click on from calendar is " +etomonth +etoyear);
    }
	
    WebElement toshadowdomroot = Testutil.shadowdom();
    List <WebElement> todates = toshadowdomroot.findElements(By.cssSelector("div[tabindex='-1'][role='button'][aria-disabled='false']"));
    
    for(WebElement e : todates) {
    	if(e.getText().trim().equals(etodate)) {
    	e.click();
    	break;
    	}
    }
	}
	
	
		
	public void validatefilteredrmiinlist() {
		 WebElement shadowdomroot = Testutil.shadowdom();
		List <WebElement> RMIidtexts = shadowdomroot.findElements(By.cssSelector(RMIIDcollect));
		String value = "RMI-12365";
		for(WebElement e : RMIidtexts ) {
			if(e.getText().equals(value)){
			System.out.println(e.getText());
			}
			else {
				System.out.println(Testutil.shadowdomfindcss(NoRecordsDisplay).getText());
			}
		}
		
	
	}

	
//@RMIIDlinktext
	
  public RMIIDdetailpage RMIidlinktext() throws InterruptedException {
	  Thread.sleep(2000);
	  Testutil.shadowdomfindcss(RMIIDlinktext).click();
	  return new RMIIDdetailpage();
  }
	
  public void RMIiddetailpagevalidation() throws InterruptedException {
	  Thread.sleep(1500);
	  Testutil.shadowdomfindcss(RMIIDdetailpgevalidation).click();
	  }	
	
//Downloadbutton functionality
  
  public void downloadbtnfunctionaltiy() throws InterruptedException {
	  Testutil.shadowdomfindcss(downloadbtn).click();
	  Thread.sleep(3000);
	  	  
  }
  
  public void downloadfilevalidate_pc() throws IOException {
	  File filelocation = new File("C:\\Users\\piktor\\Downloads");
	  File[] totalfiles = filelocation.listFiles();
	  
	  for(File file : totalfiles) {
		  if(file.getName().equals("RMI_Committed")) {
			  util.takescreenshotmethod("downloaded");
			  System.out.println("File is downloaded check for screenshot below");
			  break;
			  
		  }
	  }
  }
	
	
//Verticall3pageview test
  
  public void verticall3btn() {
	  Testutil.shadowdomfindcss(verticall3btn).click();
  }
  
  
  public void scrollverticall3table() throws InterruptedException {
	  Thread.sleep(5000);
		EventFiringWebDriver obj=new EventFiringWebDriver(driver);
		obj.executeScript("document.querySelector(\"#root > unrelease-microapp\").shadowRoot.querySelector(\"div.sc-cVJgsR.ewjAsp\").scrollTop=1000");
		
	}
	
//rmidataedit
  
  public void userclicksonrmidataedit() {
	  Testutil.shadowdomfindcss(RMIdataedit).click();
  }
	
	
  public void userfillsrmidata(String ReqTpe, String EnvironReqid, String Descript, String Chngetype, String TestDLead, String Chargecode, String Deploywindow) throws InterruptedException {
	  Testutil.shadowdomfindcss(Reqtype).sendKeys(ReqTpe);
	  Thread.sleep(500);
	  Testutil.shadowdomfindcss(Environment).sendKeys(EnvironReqid);
	  Thread.sleep(500);
	  Testutil.shadowdomfindcss(Descrip).sendKeys(Descript);
	  Thread.sleep(500);
	  Testutil.shadowdomfindcss(Chngecode).sendKeys(Chngetype);
	  Thread.sleep(500);
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(800,0)");
	  Thread.sleep(800);
	  Testutil.shadowdomfindcss(TestDL).sendKeys(TestDLead);
	  Thread.sleep(500);
	  Testutil.shadowdomfindcss(Chrgecode).sendKeys(Chargecode);
	  Thread.sleep(500);
	  Testutil.shadowdomfindcss(Deployw).sendKeys(Deploywindow);
	  jse.executeScript("window.scrollBy(-800,0)");
	  
  }
  
  public void userclicksonsavebutton() throws InterruptedException {
	  Thread.sleep(1500);
	  Testutil.shadowdomfindcss(RMIdatatickmark).click();
  }
  
  
}
