@UnassignedAppFlowTest
Feature: Unassigned App Test
@UnassignedAppTest
Scenario Outline: Verify Unassigned app functionality
	Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
Examples: Admin credentials
	|username|password|
    |vwagh+admin@roostify.com|Abcd1234|		
    
@UnassignedAppTest
Scenario Outline: Verify Admin able to assign Unassigned loan application
	Given Admin is on Unassigned app page
	When Admin click on Review button of loan application
	Then Admin admin click on Assign button of loan application
	Then window popup will display to assign loan app
	Then admin enters "<usrname>" to assign loan app and selects "<expectedUsername>" from list
	Then admin click on Grant access button
Examples: username and expectedUsername
	|usrname|expectedUsername|
	|Vivek|Vivek Wagh|
  
@UnassignedAppTest
Scenario: Verify Admin able to archive UnAssigned Application
	Given Admin is on Roostify Core Home Page
	When Admin clicks Unassigned Apps tab from left panel
	Then Admin should navigate to Unassigned Apps page
	Then Admin verify unassigned loan application is present
	Then Admin click on review button for submitted loan application
	Then Admin click on Archive button present under status tab
	And Admin again navigates to Unassigned app page
	And Admin click on Show archived link
	And Admin click on Review button of archived loan application
	Then Admin click on UnArchive button


@UnassignedAppTest
Scenario: Verify Admin is able to submit unassigned application on behalf of borrower
	Given Admin is on unassigned app page
	When admin click on continue in behalf of borrower link
	Then Admin navigates to Borrower view
	Then Admin enters necessary fields
	Then Submit loan application
	Then Click on UnAssigned app tab from left panel


@UnassignedAppTest
Scenario: Admin is able to review loan application in the unassigned apps
	Given Admin is on Unassigned app page
	When Admin click on Review button of loan application
	Then Admin should able to view loan application

	

	
	