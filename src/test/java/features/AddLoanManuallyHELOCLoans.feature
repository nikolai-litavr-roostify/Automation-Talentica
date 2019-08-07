@AddLoanManually
Feature: Add Loan Manually Test
  @AddLoanManuallyHELOCTest
  Scenario Outline: Test Add Loan Manually for Admin
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Given Admin clicks on add loan manually link
    When Admin enters user"<email>"
    And Admin enters user "<firstname>"
    And Admin enters users "<lastname>"
    And Admin selects "<account>"
    Then Admin clicks on create button
    Then Admin continues on behalf of borrower
    Then Admin starts the flow
    Then Admin starts with About you Section and clicks Next
    Then Admin enters primary details
    Then Admin enters few more details
    Then Admin enters Address page details
    Examples:
      |username|password|email|firstname|lastname|account|
      ||||Vivek|Wagh|Roostify (Roostify)|

  @AddLoanManuallyHELOCTest
  Scenario: Loan Section
    Given Admin selects loan purpose as HELOC
    And Admin selects heloc loan use
    And Admin enters subject property details
    And Admin enters property income
    And Admin selects existing loan option
    And Admin enters loan amount details

  @AddLoanManuallyHELOCTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @AddLoanManuallyHELOCTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @AddLoanManuallyHELOCTest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @AddLoanManuallyHELOCTest
  Scenario: Declaration Section
    Given Admin navigates to Declarations Section
    And Admin enters if US Citizen or not
    And Admin enters some details
    And Admin enters more details
    And Admin enters details in HMDA Section
    And Admin enters Social Security Number
    And Admin enters whether he authorizes Roostify to pull the credit
    And Admin estimates his credit
    And Admin continues to next section

  @AddLoanManuallyHELOCTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application
