package com.tmobile.canvas.intakepage.pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tmobile.canvas.utility.Baseclass;
import com.tmobile.canvas.utility.Testutil;

public class Intakepage extends Baseclass {
	
	Testutil util;
	
	//shadowhost
	@FindBy(tagName = "unrelease-microapp")
	static WebElement root2;

	
	//webelement attribute value
	
//Scenario - Submittedrmi click
 String submittedRMI = ".sc-cdlubJ.kMsWyy>div>div>div>:last-child";
 String RMItext = "div.sc-gsWcmt.grZHMV";

//Scenario - date click(Aug 12th, 2021)
 String dateclick = ".sc-eGJWMs.gQYBcx>:nth-child(2)>button>span";
 String forwardbtn = "div.sc-iJCRrE.ckYLYy>svg";
 String backbtn = "div.sc-cxNHIi.fHUQtx>:last-child>svg";
 

 
 
	public Intakepage() {
		util = new Testutil();
		PageFactory.initElements(driver, this);
		
	}
	
//Scenario - Submittedrmi click
	public void user_clicks_on_submittedRMI() throws InterruptedException {
		//String SubmittedRMI = ".sc-cdlubJ.kMsWyy>div>div>div>:last-child";
				
		Thread.sleep(6000);
		System.out.println("print" +submittedRMI);
		shadowdomfindcss(submittedRMI).click();
		Thread.sleep(2000);
		
	}
	
	public void validate_submittedrmipage() {
		String RMI = shadowdomfindcss(RMItext).getText();
		System.out.println("Navigated to RMI" +RMI);
	}
	
	
// Scenario - date click(Aug 12th, 2021)	
	
	public void changemonth_pickdate() throws InterruptedException {
		Thread.sleep(13000);
		shadowdomfindcss(dateclick).click();
		Thread.sleep(600);
		shadowdomfindcss(forwardbtn).click();
		Thread.sleep(400);
		shadowdomfindcss(backbtn).click();
		Thread.sleep(400);
   }
   
	public void selectsdate_clickonparticulardate() throws InterruptedException {
	util.dateselector();
	Thread.sleep(300);
		}
		
	

	
	
	
	
	
	
	
	
	
	

	public static WebElement expandRootElement(WebElement root2, WebElement root1) {             
		WebElement ele = (WebElement) ((JavascriptExecutor) driver)
	.executeScript("return arguments[0].shadowRoot",root2);
		
		return ele;
		 
	}
	
	
	public static WebElement shadowdomfindcss(String element) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	WebElement shadowdom = (WebElement)jse.executeScript("return arguments[0].shadowRoot", root2);
	
	//now we entered into shadowdom with the help of shadowhost giving it in jse.
	
		WebElement shadowroot=shadowdom.findElement(By.cssSelector(element));
		return shadowroot;
		
	}
	
	
	

   
   
   
   
   
   
   
   
   
//	public Intakepage() {
//		util = new utility();
//	}
//	
//	
//	
//	
//	
//	public void datepick() throws InterruptedException {
//		Thread.sleep(16000);
//		util.locatewebelement(".sc-eGJWMs.gQYBcx>:nth-child(2)>button>span"); //datebutton
//		Thread.sleep(2000);
//		util.locatewebelement("div.sc-iJCRrE.ckYLYy>svg");      //forward>october
//		Thread.sleep(1500);
//		util.locatewebelement("div.sc-cxNHIi.fHUQtx>:last-child>svg");
//		util.locatewebelement("div.sc-cxNHIi.fHUQtx>:last-child>svg");    //backbutton (Aug)
//	Thread.sleep(6000);
//	util.locatewebelement("div[aria-label='Choose Thursday, August 12th, 2021'][role='button']");  //Aug 12th 2021
//	}
//	
//	
//	
//	
//	public RMIL3page submittedrmiclick() throws InterruptedException {
//	    Thread.sleep(15000);
//		util.locatewebelement(".sc-cdlubJ.kMsWyy>div>div>div>:last-child");       ////submittedRMIboard click
//	    return new RMIL3page();
//	}
//	
//	
//	
//	
//	public RMIIDdetailspage rmicardclick() {
//		util.locatewebelement("div[id='panel1a-header-10'][role='button'][tabindex='0']>div>div>div"); // rmicard(Building- Aug12th)
//		
//		return new RMIIDdetailspage();
//		
//	}
//	
//	
//	public ProjectIDdetailspage viewproject() throws InterruptedException {
//		util.scrolluntileleisvisible("div#panel1a-header-9[role='button']");
//		util.locatewebelement("div[id^='panel1a-header-9']>div>div>:last-child>div+a");   // view project
//		return new ProjectIDdetailspage();
//	}
//	
//	
//	public Planpage planpageclick() {
//		util.locatewebelement(".sc-ksXiki.dXXEDb>:nth-child(4)>svg");
//		return new Planpage();
//	}
//	
//	
	
	
	
//	
//	public static WebElement expandRootElement(WebElement root2) {             
//		WebElement ele = (WebElement) ((JavascriptExecutor) driver)
//				
//	.executeScript("return arguments[0].shadowRoot",root2);
//		//WebElement Shadowelement =expandRootElement(root2);
//		
//		return ele;
//	}
//	
	
	
	
	
	
	
	
	
	


}
