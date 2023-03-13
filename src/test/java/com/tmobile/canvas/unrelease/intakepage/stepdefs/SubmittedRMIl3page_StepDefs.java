package com.tmobile.canvas.unrelease.intakepage.stepdefs;

import java.io.IOException;
import java.util.Map;

import com.tmobile.canvas.homepage.pageobj.Homepage;
import com.tmobile.canvas.intakepage.pageobj.Intakepage;
import com.tmobile.canvas.intakepage.pageobj.RMIL3page;
import com.tmobile.canvas.utility.Baseclass;
import com.tmobile.canvas.utility.Testutil;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubmittedRMIl3page_StepDefs extends Baseclass {
	
	Intakepage intake = new Intakepage();
	Homepage homepage = new Homepage();
    RMIL3page rmil3 = new RMIL3page();
    Testutil util = new Testutil();
	
	@Then("user finds the search field and enters RMIid {string}")
	public void user_finds_the_search_field_and_enters_rm_iid(String RMIid) throws InterruptedException {
	   rmil3.submittedrmisearchfield(RMIid);
	   rmil3.X_crossbtnclick();
	   Thread.sleep(1300);
	}
	
	@Then("validate the filtered RMI {string} in list")
	public void validate_the_filtered_rmi_in_list(String RMIid) throws IOException {
	    rmil3.validatingsearchfieldfilter("RMIsearchfieldvalidation", RMIid);
	}

//  @searchfieldfiltercheck_basedoncalendarduration
	
	@Given("user selects the calendar as from August to November duration")
	public void user_selects_the_calendar_as_from_august_to_october_duration() throws InterruptedException, IOException {
	    Thread.sleep(3000);
	    rmil3.rmisearchfieldbasedoncalendardura();
	    Thread.sleep(500);
	    util.takescreenshotmethod("calendarduration");
	}

	@Then("user enters particular RMIid {string}")
	public void user_enters_particular_rm_iid(String RMIID) throws InterruptedException, IOException {
	   rmil3.submittedrmisearchfield(RMIID);
	   System.out.println(RMIID);
	   
	}

	@Then("validate the filtered RMI in the filtered list")
	public void validate_the_filtered_rmi_in_the_filtered_list() throws IOException {
		util.takescreenshotmethod("searchfieldbasedoncalendardura");
		
	}
	

// @searchfieldfiltercheck_Norecordsdisplay
	
	
	@Then("user enters invalid RMIid {string}")
	public void user_enters_invalid_rm_iid(String RMIID) throws InterruptedException {
	    rmil3.submittedrmisearchfield(RMIID);
	}
	
	
	
	@Then("validate the filtered RMI in the filter list")
	public void validate_the_filtered_rmi_in_the_filter_list() {
		//rmil3.validatefilteredrmiinlist();
		System.out.println("printing RMI");
	}

	
	
//@RMIIDlinktext
	
	@When("user clicks on particular RMIID link")
	public void user_clicks_on_particular_rmiid_link() throws InterruptedException {
	    rmil3.RMIidlinktext();
	}

	@Then("user navigates to selected RMIID detailpage")
	public void user_navigates_to_selected_rmiid_detailpage() throws InterruptedException, IOException {
	    rmil3.RMIiddetailpagevalidation();
	    util.takescreenshotmethod("RMIIDdetialpagevalidation");
	}
	

//@Downloadbutton functionality
	
	@When("user clicks on download button")
	public void user_clicks_on_download_button() throws InterruptedException {
	    rmil3.downloadbtnfunctionaltiy();
	}

	
	@Then("validate the downloaded file in PC")
	public void validate_the_downloaded_file_in_pc() throws IOException {
	    rmil3.downloadfilevalidate_pc();
	}
	
//@Veriticall3pageview
	
	@When("user clicks on verticall3view button and Navigates to verticall3viewpage")
	public void user_clicks_on_verticall3view_button_and_navigates_to_verticall3viewpage() {
	   rmil3.verticall3btn();
	}

	@When("user changes the month_date in vertical l3 page")
	public void user_changes_the_month_date_in_vertical_l3_page() throws InterruptedException {
	    Thread.sleep(2000);
	    rmil3.rmisearchfieldbasedoncalendardura();
	}

	@Then("respective month_date page appears in verticall3view")
	public void respective_month_date_page_appears_in_verticall3view() throws IOException {
	   util.takescreenshotmethod("verticall3dateselected");
	}

	@Then("user is able to scrolldown the list of RMIID")
	public void user_is_able_to_scrolldown_the_list_of_rmiid() throws InterruptedException {
	 rmil3.scrollverticall3table();
	 Thread.sleep(5000);
	}
	
	
//@RMIdataedit

	@When("^user clicks on rmidata edit$")
	public void user_clicks_on_rmidata_edit() {
	   rmil3.userclicksonrmidataedit();   
	}

	@When("user fills the data {string} {string} {string} {string} {string} {string} {string}")
	public void user_fills_the_data(String ReqTpe, String EnvironReqid, String Descrip, String Chngetype, String TestDLead, String Chargecode, String Deploywindow) throws InterruptedException {
	   rmil3.userfillsrmidata(ReqTpe, EnvironReqid, Descrip, Chngetype, TestDLead, Chargecode, Deploywindow);
	}

	@Then("^clicks on savebutton$")
	public void clicks_on_savebutton() throws InterruptedException {
	    rmil3.userclicksonsavebutton();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
