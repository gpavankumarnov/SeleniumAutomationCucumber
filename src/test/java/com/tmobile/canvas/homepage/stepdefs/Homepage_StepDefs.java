package com.tmobile.canvas.homepage.stepdefs;


import com.tmobile.canvas.homepage.pageobj.Homepage;
import com.tmobile.canvas.utility.Baseclass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage_StepDefs extends Baseclass {
	Homepage homepage;

	@And("^user clicks on unrelease widget$")
	public void user_clicks_on_unrelease_widget() throws InterruptedException {
	    homepage = new Homepage();
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	    homepage.unreleaseclickable();
	}

	@Then("^user navigates to unrelease-intakepage$")
	public void user_navigates_to_unrelease_intakepage() {
	  String intakepageurl =  homepage.get_unrelease_page_title();
	  System.out.println("navigated to " +intakepageurl);
	  homepage.getunreleasemicroapptext();
	}
	
	
	
	
	
	
	
}
