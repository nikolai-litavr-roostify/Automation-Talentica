@SecurityFunctionalityTest
Feature: Test Security functionality
  @SecurityPageFunctionalityTest
  Scenario Outline: Validate the UI Elements displayed in Security Page of Admin
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin user clicks on Settings link
    Then Admin clicks on 'Security' tab
    Then Validate the UI Elements visible in Security Tab for Admin.
    Examples:
      |username|password|
      |||

  @SecurityPageFunctionalityTest
  Scenario: Validate Password is not updated in case user enters Incorrect Current Password
    Given Admin user clicks on Settings link
    Then Admin clicks on 'Security' tab
    Then Admin enter Incorrect Current Password.
    Then Admin updates New Password.
    Then Admin clicks on Save.
    Then Error Message Incorrect Current Password is displayed.

  @SecurityPageFunctionalityTest
  Scenario: Validate Error Message displayed in case New Password don't meet minimum letter count criteria
    Given Admin user clicks on Settings link
    Then Admin clicks on 'Security' tab
    Then Admin enter Correct Current Password.
    Then Admin updates New Password with less Alpha Letter.
    Then Admin clicks on Save.
    Then Error Message for Letter less than required is displayed.

  @SecurityPageFunctionalityTest
  Scenario: Validate Admin is able to Update Password
    Given Admin user clicks on Settings link
    Then Admin clicks on 'Security' tab
    Then Admin enter Correct Current Password.
    Then Admin updates New Password with required format.
    Then Admin clicks on Save.
    Then Validate the success message for Password Reset.

