@LoanApplcationWithNewLOFlow
Feature: Loan Application with New Loan Officer
Scenario Outline: Verify loan application by New Loan Officer
	Given Borrower is on the Roostify login page
	When Borrower enters "<username>"
     And Borrower enters also "<password>"
     And Borrower clicks on Sign In Button.
     Then Borrower navigates to Roostify Core Home Page.
Examples: Borrower credentials
    |username|password|
    |pjadhav+test001@roostify.com|Abcd1234|
   
@LoanApplcationWithNewLO
Scenario: Borrower selects new loan officer
	Given Borrower is on Roostify HomePage
	When Borrower click on Hamburger icon 
	Then click on My Transactions menu
	Then borrower selects New LO from dropdown
	Then borrower click on Start a new applciation page button 
	Then Borrower starts the flow
	Then Borrower enters necessary details
	Then Borrower enters Loan details
	Then Borrower enters Employment details
	Then Borrower enters Income details
	Then Borrower enters Assets&Liabilities details
	Then Borrower enters Declaration details
	Then Borrower navigates to Application release section and submits the application
	#Then Borrower accepts E-sign Disclosure
	
 

    
    

