package com.tmobile.canvas.unrelease.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources", 
			
			glue={"com.tmobile.canvas.loginpage.stepdefs",
					"com.tmobile.canvas.homepage.stepdefs",
					"com.tmobile.canvas.unrelease.intakepage.stepdefs"
					
					
					}, //the path of the step definition files
			
			plugin= {"pretty","html:target/cucumber-html-report",
					"json:json_output/cucumber.json", 
					"junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			
			monochrome = true, //display the console output in a proper readable format
			
			stepNotifications = true,
			
			//strict = true, //it will check if any step is not defined in step definition file
			
			dryRun = false,//to check the mapping is proper between feature file and step def file
			tags = "@End2EndTest",
			publish = true
			)
	

public class Testrunner {

}
