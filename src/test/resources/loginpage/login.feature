@LoginTest @End2EndTest
Feature: Canvas Application Login Test

Background: 
Given user opens Browser
When user is on login Page
When user enters username and password

Scenario: Validate Canvas Home Page Test

Then validate home page title
Then validate canvas logo display
Then close the browser










