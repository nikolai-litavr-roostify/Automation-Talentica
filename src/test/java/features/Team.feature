@TeamFunctionalityTest
Feature: Test Team functionality by Admin
  @TeamTest
  Scenario Outline: Add team member as Underwriter
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    And Admin clicks on Team tab
    And Admin clicks on Add team member
    Then Admin selects Person to Add
    And Admin clicks on select box
    And Admin selects Role
    And Admin clicks on Add to Team
    Examples:
      |username|password|
      |||

  Scenario Outline: Add team member as Assistant
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    And Admin clicks on Team tab
    And Admin clicks on Add team member
    Then Admin selects Person to Add
    And Admin clicks on select box to select Assistant user
    And Admin selects Role to add Assistant
    And Admin clicks on Add to Team
    Examples:
      |username|password|
      |||

  Scenario Outline: Add team member as Processor
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    And Admin clicks on Team tab
    And Admin clicks on Add team member
    Then Admin selects Person to Add
    And Admin clicks on select box to select Processor user
    And Admin selects Role to add Processor
    And Admin clicks on Add to Team
    Examples:
      |username|password|
      |||

  @DeleteTeamMemberTest
  Scenario Outline: Delete Underwriter
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    And Admin clicks on Team tab
    And Admin clicks on delete icon to delete underwriter
    And Admin clicks on 'Yes, remove' button
    Examples:
      |username|password|
      |||

  @AddTeamMemberNegativeTest
  Scenario Outline: To verify that admin cannot add user from other account as a team member
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    And Admin clicks on Team tab
    And Admin clicks on Add team member
    Then Admin selects non-existing Person to Add
    And Admin clicks on select box to select user from another account
    Then Admin should see No results matched text
    Examples:
      |username|password|
      |||
