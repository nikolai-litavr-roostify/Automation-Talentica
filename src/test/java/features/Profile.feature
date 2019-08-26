@ProfileFunctionalityTest
Feature: Test Profile functionality
  @ProfilePageFunctionalityTest
  Scenario Outline: Validate the UI Elements displayed in Profile Page of Admin
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin user clicks on Settings link
    Then Admin clicks on 'Profile' tab
    Then Validate the UI Elements visible in Profile Tab for Admin.
    Examples:
      |username|password|user_email|user_email|
      |||||

  @ProfilePageFunctionalityTest
  Scenario: Validate Admin is able to Update Profile Page Information (FirstName)
    Given Admin user clicks on Settings link
    Then Admin clicks on 'Profile' tab
    Then Admin Update First Name

  @ProfilePageFunctionalityTest
  Scenario: Validate Admin is able to Update Profile Page Information (LastName)
    Given Admin user clicks on Settings link
    Then Admin clicks on 'Profile' tab
    Then Admin Update Last Name

  @ProfilePageFunctionalityTest
  Scenario: Validate Admin is able to Update Profile Page Information (Email)
    Given Admin user clicks on Settings link
    Then Admin clicks on 'Profile' tab
    Then Admin Update Email

  @ProfilePageFunctionalityTest
  Scenario: Validate Admin is able to Update Profile Page Information (Referral Token)
    Given Admin user clicks on Settings link
    Then Admin clicks on 'Profile' tab
    Then Admin Update Referral Token

  @ProfilePageFunctionalityTest
  Scenario: Validate Admin is able to Update Profile Page Information (NMLS Number)
    Given Admin user clicks on Settings link
    Then Admin clicks on 'Profile' tab
    Then Admin Update NMLS Number

  @ProfilePageFunctionalityTest
  Scenario: Validate Admin is able to Update Profile Page Information (Mobile Phone)
    Given Admin user clicks on Settings link
    Then Admin clicks on 'Profile' tab
    Then Admin Update Mobile Phone

  @ProfilePageFunctionalityTest
  Scenario: Validate Admin is able to Update Profile Page Information (Office Phone)
    Given Admin user clicks on Settings link
    Then Admin clicks on 'Profile' tab
    Then Admin Update Office Phone

