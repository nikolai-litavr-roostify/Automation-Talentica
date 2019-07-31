@AddLoanManually
Feature: Add Loan Manually Test
  @AddLoanManuallyHomeConTest
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
      |roostify_admin@roostify.com|168Washu||Vivek|Wagh|Roostify (Roostify)|

  @AddLoanManuallyHomeConTest
  Scenario: Loan Section
    Given Admin selects loan purpose as Home Purchase
    And Admin enters location details
    And User enters loan type
    And User enters interest rate type
    And User enters property use
    And User enters downpayment plan
    And User enters number of years for loan to amortize

  @AddLoanManuallyHomeConTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @AddLoanManuallyHomeConTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @AddLoanManuallyHomeConTest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @AddLoanManuallyHomeConTest
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

  @AddLoanManuallyHomeConTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @AddLoanManuallyHomeFHATest
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
      |roostify_admin@roostify.com|168Washu||Vivek|Wagh|Roostify (Roostify)|

  @AddLoanManuallyHomeFHATest
  Scenario: Loan Section
    Given Admin selects loan purpose as Home Purchase
    And Admin enters location details
    And Admin enters loan type as fha
    And User enters interest rate type
    And User enters property use
    And User enters downpayment plan
    And User enters number of years for loan to amortize

  @AddLoanManuallyHomeFHATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @AddLoanManuallyHomeFHATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @AddLoanManuallyHomeFHATest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @AddLoanManuallyHomeFHATest
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

  @AddLoanManuallyHomeFHATest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @AddLoanManuallyHomeVaTest
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
      |roostify_admin@roostify.com|168Washu||Vivek|Wagh|Roostify (Roostify)|

  @AddLoanManuallyHomeVaTest
  Scenario: Loan Section
    Given Admin selects loan purpose as Home Purchase
    And Admin enters location details
    And Admin enters loan type as va
    And User enters interest rate type
    And User enters property use
    And User enters downpayment plan
    And User enters number of years for loan to amortize

  @AddLoanManuallyHomeVaTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @AddLoanManuallyHomeVaTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @AddLoanManuallyHomeVaTest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @AddLoanManuallyHomeVaTest
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

  @AddLoanManuallyHomeVaTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @AddLoanManuallyHomeUSDATest
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
      |roostify_admin@roostify.com|168Washu||Vivek|Wagh|Roostify (Roostify)|

  @AddLoanManuallyHomeUSDATest
  Scenario: Loan Section
    Given Admin selects loan purpose as Home Purchase
    And Admin enters location details
    And Admin enters loan type as usda
    And User enters property use
    And User enters downpayment plan
    And Admin continue to next section

  @AddLoanManuallyHomeUSDATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @AddLoanManuallyHomeUSDATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @AddLoanManuallyHomeUSDATest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @AddLoanManuallyHomeUSDATest
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

  @AddLoanManuallyHomeUSDATest
  Scenario: Application Release Sectionm
    Given Admin navigates to Application release section and submits the application
