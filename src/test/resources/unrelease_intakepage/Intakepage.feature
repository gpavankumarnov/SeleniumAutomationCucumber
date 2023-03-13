@Intakepage @End2EndTest
Feature: Canvas intakepage test

Background: 
 Given user opens Browser
 When user is on login Page
 When user enters username and password
 And user clicks on Unrelease microapp
 When now user clicks on date button and changes the month
 And user select and click on particular date
 Then respective date's page appears
 
 
 
 @datechange
Scenario: check forward/backward buttons and date functionality
 When now user clicks on date button and changes the month
 And user select and click on particular date
 Then respective date's page appears
 Then close the browser

@submittedrmiclick
Scenario: check submittedrmiclick functionality
 And user clicks on submittedrmi
 Then user navigates to RMIl3page
 Then close the browser
 

 