@OverviewFunctionalityTest
Feature: Test Overview tab functionality
  Scenario Outline: Verify Overview Stats Label
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin user clicks on Admin Console link
    And Admin user clicks on Overview link
    And Admin check whether Overview Stats label is present or not
    Examples:
      |username|password|
      |        |        |

    Scenario: Verify Labels
    And Admin verify all the lables present on overview stats page
    Given Admin is able to see Select Account Dropdown
    When Admin selects account from drop down
    Then Admin should be navigated to Accounts Page

    Scenario: Verify Filters
    And Admin check whether all quick filters are present or not
    Then Admin click on Month Filter
    And Admin Click on Application Started Folder
    And Admin verifies whether Pagination is present or not
    Then Admin clicks on clear button






