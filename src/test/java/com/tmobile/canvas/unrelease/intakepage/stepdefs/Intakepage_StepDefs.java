package com.tmobile.canvas.unrelease.intakepage.stepdefs;

import org.openqa.selenium.JavascriptExecutor;

import com.tmobile.canvas.homepage.pageobj.Homepage;
import com.tmobile.canvas.intakepage.pageobj.Intakepage;
import com.tmobile.canvas.utility.Baseclass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Intakepage_StepDefs extends Baseclass {

	Intakepage intake = new Intakepage();
	Homepage homepage = new Homepage();
	
//Scenario - SubmittedRMI click	
	@And("^user clicks on Unrelease microapp$")
	public void user_clicks_on_unrelease_microapp() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		homepage.unreleaseclickable();
	}


	@And("^user clicks on submittedrmi$")
	public void user_clicks_on_submittedrmi() throws InterruptedException {
	   Thread.sleep(5000);
	   intake = new Intakepage();
	   intake.user_clicks_on_submittedRMI();
	   
	}

	@Then("^user navigates to RMIl3page$")
	public void user_navigates_to_rm_il3page() {
		intake.validate_submittedrmipage();
	    System.out.println("clicked on rmi");
	}	
	
	
//Scenario - date change
	
	@When("^now user clicks on date button and changes the month$")
	public void now_user_clicks_on_date_button_and_changes_the_month() throws InterruptedException {
		Thread.sleep(4000);
	    intake.changemonth_pickdate();
	}
	
	@When("^user select and click on particular date$")
	public void user_select_and_click_on_particular_date() throws InterruptedException {
	    intake.selectsdate_clickonparticulardate();
	}
	
	@Then("^respective date's page appears$")
	public void respective_date_s_page_appears() {
	   System.out.println("august date is selected");
	}






	
	
	
}
