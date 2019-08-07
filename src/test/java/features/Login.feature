@LoginTest
Feature: Test Login Functionality
  Scenario Outline: Test Login Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Examples:
      |username|password|
      |||







