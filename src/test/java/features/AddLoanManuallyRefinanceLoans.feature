@AddLoanManually
Feature: Add Loan Manually Test
  @AddLoanManuallyRefinanceConTest
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

  @AddLoanManuallyRefinanceConTest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And User selects loan type
    And Admin enter existing balance
    And User selects interest rate type
    And User selects property use
    And User selects number of years for loan to amortize

  @AddLoanManuallyRefinanceConTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @AddLoanManuallyRefinanceConTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @AddLoanManuallyRefinanceConTest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @AddLoanManuallyRefinanceConTest
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

  @AddLoanManuallyRefinanceConTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @AddLoanManuallyRefinanceFHATest
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

  @AddLoanManuallyRefinanceFHATest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And Admin enters loan type as fha
    And User selects interest rate type
    And User selects property use
    And User selects number of years for loan to amortize

  @AddLoanManuallyRefinanceFHATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @AddLoanManuallyRefinanceFHATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @AddLoanManuallyRefinanceFHATest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @AddLoanManuallyRefinanceFHATest
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

  @AddLoanManuallyRefinanceFHATest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @AddLoanManuallyRefinanceVaTest
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

  @AddLoanManuallyRefinanceVaTest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And Admin enters loan type as va
    And User selects interest rate type
    And User selects property use
    And User selects number of years for loan to amortize

  @AddLoanManuallyRefinanceVaTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @AddLoanManuallyRefinanceVaTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @AddLoanManuallyRefinanceVaTest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @AddLoanManuallyRefinanceVaTest
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

  @AddLoanManuallyRefinanceVaTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @AddLoanManuallyRefinanceUSDATest
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

  @AddLoanManuallyRefinanceUSDATest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And Admin enters loan type as usda
    And User selects property use
    And Admin continue to next section

  @AddLoanManuallyRefinanceUSDATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @AddLoanManuallyRefinanceUSDATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @AddLoanManuallyRefinanceUSDATest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @AddLoanManuallyRefinanceUSDATest
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

  @AddLoanManuallyRefinanceUSDATest
  Scenario: Application Release Sectionm
    Given Admin navigates to Application release section and submits the application
