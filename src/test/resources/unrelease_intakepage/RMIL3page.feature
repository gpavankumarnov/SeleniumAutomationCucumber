@Submittedrmipage @End2EndTest
Feature: Canvas submitted RMIL3page test

Background: 
 Given user opens Browser
 When user is on login Page
 When user enters username and password
 And user clicks on Unrelease microapp
 When now user clicks on date button and changes the month
 And user select and click on particular date
 Then respective date's page appears
 And user clicks on submittedrmi
 Then user navigates to RMIl3page
 
 @RMIL3page_searchfieldTest
Scenario Outline: Test RMI searchfield functionality
 And user finds the search field and enters RMIid "<RMIID>"
 And validate the filtered RMI "<RMIID>" in list
 Then close the browser

 Examples:
 
 | RMIID     |
 | RMI-10113 |
 
 
 @searchfieldfiltercheck_basedoncalendarduration
Scenario Outline: Test RMI searchfield functionality based on calendar duration
 And user selects the calendar as from August to November duration
 Then user enters particular RMIid "<RMIID>"
 And validate the filtered RMI in the filtered list
 Then close the browser

 Examples:
 
 | RMIID    |
 |RMI-12154 |

 
 
  @searchfieldfiltercheck_Norecordsdisplay
Scenario Outline: Test RMI searchfield functionality based on calendar duration
 And user selects the calendar as from August to November duration
 Then user enters invalid RMIid "<RMIID>"
 And validate the filtered RMI in the filter list
 Then close the browser
 
 Examples:
 
 | RMIID    |
 |RMI-12189 |
 

@RMIIDlinktext
Scenario: Test functionality of RMIID linktext under RMIL3page

When user clicks on particular RMIID link
Then user navigates to selected RMIID detailpage
Then close the browser
 
 @Downloadfunctionality
 Scenario: validating download button functionality
 
 When user clicks on download button
 Then validate the downloaded file in PC 
 Then close the browser
 
 @Veriticall3pageview
 Scenario: validating verticall3page view
 
 When user clicks on verticall3view button and Navigates to verticall3viewpage
 When user changes the month_date in vertical l3 page
 Then respective month_date page appears in verticall3view
 Then user is able to scrolldown the list of RMIID
 Then close the browser
 
  
  @RMIdataedit
 Scenario Outline: check rmidata can be editable

 When user clicks on rmidata edit
 And user fills the data "<Request Type>" "<Environment Req IDs>" "<Description>" "<ChangeType>" "<TestDL>" "<Chargecode>" "<DeployWdow>"
 Then clicks on savebutton
 
 Examples:
 |RequestType | EnvironmentReq IDs | Description | ChangeType | TestDL    | Chargecode | DeployWdow|
 |Project     | T-mobile           | T-mobile    | T-mobile   |  T-mobile |  T-mobile  |  T-mobile  |
 