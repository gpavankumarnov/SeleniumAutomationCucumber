package com.tmobile.canvas.homepage.pageobj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tmobile.canvas.utility.Baseclass;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class Homepage extends Baseclass {

	@FindBy(css = "div.main-grid-box-container1>:nth-child(2)>div>a>:nth-child(2) p")
	WebElement unreleaseclick;
	
	
	@FindBy(css = "div.main-grid-box-container1>:nth-child(2)>div>a>:nth-child(2) p")
	WebElement unreleaselabel;
	
	@FindBy(css = "Header__UnreleaseLogoTxt-sc-1jrm3js-5 eVtIcd")
	WebElement Canvasheader;
	
	@FindBy(css = ".Header__CanvasLogo-sc-1jrm3js-3.jvRBuV")
	WebElement canvaslogo;
	
	@FindBy(css=".Header__UnreleaseLogoTxt-sc-1jrm3js-5.eVtIcd")
	WebElement unreleasemicroapptext;
	
	// Initializing the Page Objects:
		public Homepage() {
			PageFactory.initElements(driver, this);
		}
		
//Methods		
		
		public String validatehomepagetitle() throws InterruptedException {
			
			return driver.getTitle();
		}
		
		
		
		public boolean canvaslogodisplay() throws InterruptedException {
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			
			return canvaslogo.isDisplayed();
		}
		
	public void unreleaseclickable() throws InterruptedException  {
		driver.navigate().refresh();
		Thread.sleep(3000);
		 unreleaseclick.click();
	}
	
	public String get_unrelease_page_title() {
		return  driver.getCurrentUrl();
		
	}
    
	public String getunreleasemicroapptext() {
		 String unreleasemicroapp = unreleasemicroapptext.getText();
		 System.out.println("page header is " +unreleasemicroapp);
		 return unreleasemicroapp;
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
