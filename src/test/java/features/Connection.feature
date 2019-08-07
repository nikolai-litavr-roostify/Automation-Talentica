@ConnectionTest
  Feature: Test Connection Functionality
    Scenario Outline: Test Invite Borrower Functionality
      Given Admin is on the Roostify Core Login Page
      When Admin enters "<username>"
      And Admin enters also "<password>"
      And Admin clicks on Sign In Button.
      Then Admin navigates to Roostify Core Home Page.
      Then Admin clicks on Connection link
      Then Admin clicks on Add Connection Button
      Then Admin enters connection first name
      Then Admin enters connection second name
      Then Admin enters connection "<email>"
      Then Admin clicks on invite connection button
      And Admin clicks on Admin Console link
      And Admin click on Messages section
      And Admin clicks on Message link
      And Admin clicks on Connect Now link
      And User enters also "<password>" for connection
      And User clicks on Agree Terms and Conditions for connection
      And Admin clicks on complete registration link
      Examples:
        |username|password|email|password|
        ||||Abcd1234|