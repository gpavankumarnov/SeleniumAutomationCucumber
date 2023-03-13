package com.tmobile.canvas.loginpage.pageobj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tmobile.canvas.homepage.pageobj.Homepage;
import com.tmobile.canvas.utility.Baseclass;

public class Loginpage extends Baseclass {


		//Page repository = Object repository
		
		@FindBy(css = "input[id='okta-signin-username'][type='text']")
		WebElement Signin;
		
		@FindBy(css = "#okta-signin-submit")
		WebElement NextBttn;
		
		@FindBy(xpath = "/html/body/div[2]/div/main/div[2]/div/div/form/div[1]/div[2]/div/div[2]/span/input")
		WebElement Password;
		
		@FindBy(xpath = "/html/body/div[2]/div/main/div[2]/div/div/form/div[2]/input")
		WebElement Verify;
		
		
		@FindBy(css = ".Header__CanvasLogo-sc-1jrm3js-3.jvRBuV")
		WebElement canvaslogo;
		
		@FindBy(css = ".auth-org-logo")
		WebElement T_mobile;

		//Initializing the pageobjects
			public Loginpage() {
				PageFactory.initElements(driver, this);
				
			}
			
	public String validateloginpagetitle() {
	return driver.getTitle();
	}
			
			
public Homepage login(String un, String pwd) throws InterruptedException {        //method
	
    //Thread.sleep(10000);
    Signin.sendKeys(un);
				
	NextBttn.click();
	Thread.sleep(4000);
				
	Password.sendKeys(pwd);
			
    Verify.click();
	Thread.sleep(10000);
			    
   driver.navigate().refresh();
  
   Thread.sleep(4000);
   return new Homepage();
		}				
	

}
