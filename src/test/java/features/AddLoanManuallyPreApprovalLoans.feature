@AddLoanManuallyPreApprovalLoansTest
Feature: Add Loan Manually Test
  @AddLoanManuallyPreConTest
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

   @AddLoanManuallyPreConTest
    Scenario: Loan Section
    Given Admin selects loan purpose
    And Admin enters city details
    And Admin enters loan type
    And Admin enters interest rate type
    And Admin enters property use
    And Admin enters downpayment plan
    And Admin enters number of years for loan to amortize

    @AddLoanManuallyPreConTest
    Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

    @AddLoanManuallyPreConTest
    Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

    @AddLoanManuallyPreConTest
    Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

    @AddLoanManuallyPreConTest
    Scenario: Declaration Section
    Given Admin navigates to Declarations Section
    And Admin enters if US Citizen or not
    And Admin enters some details
    And Admin enters more details
    And Admin enters details in HMDA Section
    And Admin enters Social Security Number
    And Admin enters whether he authorizes Roostify to pull the credit
    And Admin continues to next section

    @AddLoanManuallyPreConTest
    Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

    @AddLoanManuallyPreFHATest
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

   @AddLoanManuallyPreFHATest
   Scenario: Loan Section
    Given Admin selects loan purpose
    And Admin enters city details
    And Admin enters loan type as fha
    And Admin enters interest rate type as arm
    And Admin enters property use
    And Admin enters downpayment plan
    And Admin enters number of years for loan to amortize for fha loan

  @AddLoanManuallyPreFHATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @AddLoanManuallyPreFHATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @AddLoanManuallyPreFHATest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @AddLoanManuallyPreFHATest
  Scenario: Declaration Section
    Given Admin navigates to Declarations Section
    And Admin enters if US Citizen or not
    And Admin enters some details
    And Admin enters more details
    And Admin enters details in HMDA Section
    And Admin enters Social Security Number
    And Admin enters whether he authorizes Roostify to pull the credit
    And Admin continues to next section

  @AddLoanManuallyPreFHATest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @AddLoanManuallyPreVaTest
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

  @AddLoanManuallyPreVaTest
  Scenario: Loan Section
    Given Admin selects loan purpose
    And Admin enters city details
    And Admin enters loan type as va
    And Admin enters interest rate type
    And Admin enters property use
    And Admin enters downpayment plan
    And Admin enters number of years for loan to amortize

  @AddLoanManuallyPreVaTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @AddLoanManuallyPreVaTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @AddLoanManuallyPreVaTest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @AddLoanManuallyPreVaTest
  Scenario: Declaration Section
    Given Admin navigates to Declarations Section
    And Admin enters if US Citizen or not
    And Admin enters some details
    And Admin enters more details
    And Admin enters details in HMDA Section
    And Admin enters Social Security Number
    And Admin enters whether he authorizes Roostify to pull the credit
    And Admin continues to next section

  @AddLoanManuallyPreVaTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @AddLoanManuallyPreUSDATest
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

  @AddLoanManuallyPreUSDATest
  Scenario: Loan Section
    Given Admin selects loan purpose
    And Admin enters city details
    And Admin enters loan type as usda
    And Admin enters property use
    And Admin enters downpayment plan
    And Admin continue to next section

  @AddLoanManuallyPreUSDATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @AddLoanManuallyPreUSDATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @AddLoanManuallyPreUSDATest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @AddLoanManuallyPreUSDATest
  Scenario: Declaration Section
    Given Admin navigates to Declarations Section
    And Admin enters if US Citizen or not
    And Admin enters some details
    And Admin enters more details
    And Admin enters details in HMDA Section
    And Admin enters Social Security Number
    And Admin enters whether he authorizes Roostify to pull the credit
    And Admin continues to next section

  @AddLoanManuallyPreUSDATest
  Scenario: Application Release Sectionm
    Given Admin navigates to Application release section and submits the application
