@Homepage @End2EndTest
Feature: Canvas homepage test

Background: 
 Given user opens Browser
 When user is on login Page
 When user enters username and password

@unreleaseclick(Test1)
Scenario: check unrelease widget functionality
 When user clicks on unrelease widget
 Then user navigates to unrelease-intakepage
 Then close the browser

