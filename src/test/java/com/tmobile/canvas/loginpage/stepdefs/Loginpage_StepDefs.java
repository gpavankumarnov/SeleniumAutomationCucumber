package com.tmobile.canvas.loginpage.stepdefs;

import org.junit.jupiter.api.Assertions;

import com.tmobile.canvas.homepage.pageobj.Homepage;
import com.tmobile.canvas.loginpage.pageobj.Loginpage;
import com.tmobile.canvas.utility.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage_StepDefs extends Baseclass {

	Loginpage logg;
	Homepage homepage;
	
	@Given("^user opens Browser$")
	public void user_opens_browser() {
	  Baseclass.Initialisation(); 
	}
	
	
	@When("^user is on login Page$")
	public void user_is_on_login_page() throws InterruptedException {
		logg = new Loginpage();
	  String title = logg.validateloginpagetitle();
	
	}
	
	
	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException {
	  homepage =logg.login(prop.getProperty("username"), prop.getProperty("password"));
	   
	}
	

	@Then("^validate home page title$")
	public void validate_home_page_title() throws InterruptedException {
		String hometitle = homepage.validatehomepagetitle();
		 Assertions.assertEquals("Canvas", hometitle);  
	}
	
	
	@Then("^validate canvas logo display$")
	public void validate_canvas_logo_display() throws InterruptedException {
	    boolean flag = homepage.canvaslogodisplay();
		Assertions.assertTrue(flag);
	}
	

	
	@Then("^close the browser$")
	public void close_the_browser() {
	    driver.quit();
	}

	
	
	
	
	
	
	
	

}
	
	
	
	
	

