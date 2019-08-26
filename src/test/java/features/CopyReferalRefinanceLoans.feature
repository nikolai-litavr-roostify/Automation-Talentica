@CopyReferalRefinanceLoanTest
Feature: Add Loan Manually Test
  @CopyReferalRefinanceConTest
  Scenario Outline: Test Copy Referral Functionality
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    And Admin clicks on Copy Referral Link and opens in new window
    And User enters user "<firstname>"
    And User enters users "<lastname>"
    Then User enters new users "<mailid>"
    And User enters also "<password>"
    And User clicks on Agree Terms and Conditions
    And User clicks on Start Application button
    Then Admin starts the flow
    Then Admin starts with About you Section and clicks Next
    Then Admin enters primary details
    Then Admin enters few more details
    Then Admin enters Address page details
    Examples:
      |username|password|firstname|lastname|mailid|password|
      |||Loan|App|||

  @CopyReferalRefinanceConTest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And User selects loan type
    And Admin enter existing balance
    And User selects interest rate type
    And User selects property use
    And User selects number of years for loan to amortize

  @CopyReferalRefinanceConTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @CopyReferalRefinanceConTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @CopyReferalRefinanceConTest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @CopyReferalRefinanceConTest
  Scenario: Declaration Section
    Given Admin navigates to Declarations Section
    And Admin enters if US Citizen or not
    And Admin enters some details
    And Admin enters more details
    And Admin enters details in HMDA Section
    And Admin enters Social Security Number
    And Admin enters whether he authorizes Roostify to pull the credit
    And Admin continues to next section

  @CopyReferalRefinanceConTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @CopyReferalRefinanceFHATest
  Scenario Outline: Test Copy Referral Functionality
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    And Admin clicks on Copy Referral Link and opens in new window
    And User enters user "<firstname>"
    And User enters users "<lastname>"
    Then User enters new users "<mailid>"
    And User enters also "<password>"
    And User clicks on Agree Terms and Conditions
    And User clicks on Start Application button
    Then Admin starts the flow
    Then Admin starts with About you Section and clicks Next
    Then Admin enters primary details
    Then Admin enters few more details
    Then Admin enters Address page details
    Examples:
      |username|password|firstname|lastname|mailid|password|
      |||Loan|App||Abcd1234|

  @CopyReferalRefinanceFHATest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And Admin enters loan type as fha
    And User selects interest rate type
    And User selects property use
    And User selects number of years for loan to amortize

  @CopyReferalRefinanceFHATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @CopyReferalRefinanceFHATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @CopyReferalRefinanceFHATest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @CopyReferalRefinanceFHATest
  Scenario: Declaration Section
    Given Admin navigates to Declarations Section
    And Admin enters if US Citizen or not
    And Admin enters some details
    And Admin enters more details
    And Admin enters details in HMDA Section
    And Admin enters Social Security Number
    And Admin enters whether he authorizes Roostify to pull the credit
    And Admin continues to next section

  @CopyReferalRefinanceFHATest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @CopyReferalRefinanceVaTest
  Scenario Outline: Test Copy Referral Functionality
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    And Admin clicks on Copy Referral Link and opens in new window
    And User enters user "<firstname>"
    And User enters users "<lastname>"
    Then User enters new users "<mailid>"
    And User enters also "<password>"
    And User clicks on Agree Terms and Conditions
    And User clicks on Start Application button
    Then Admin starts the flow
    Then Admin starts with About you Section and clicks Next
    Then Admin enters primary details
    Then Admin enters few more details
    Then Admin enters Address page details
    Examples:
      |username|password|firstname|lastname|mailid|password|
      |||Loan|App||Abcd1234|

  @CopyReferalRefinanceVaTest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And Admin enters loan type as va
    And User selects interest rate type
    And User selects property use
    And User selects number of years for loan to amortize

  @CopyReferalRefinanceVaTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @CopyReferalRefinanceVaTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @CopyReferalRefinanceVaTest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @CopyReferalRefinanceVaTest
  Scenario: Declaration Section
    Given Admin navigates to Declarations Section
    And Admin enters if US Citizen or not
    And Admin enters some details
    And Admin enters more details
    And Admin enters details in HMDA Section
    And Admin enters Social Security Number
    And Admin enters whether he authorizes Roostify to pull the credit
    And Admin continues to next section

  @CopyReferalRefinanceVaTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @CopyReferalRefinanceUSDATest
  Scenario Outline: Test Copy Referral Functionality
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    And Admin clicks on Copy Referral Link and opens in new window
    And User enters user "<firstname>"
    And User enters users "<lastname>"
    Then User enters new users "<mailid>"
    And User enters also "<password>"
    And User clicks on Agree Terms and Conditions
    And User clicks on Start Application button
    Then Admin starts the flow
    Then Admin starts with About you Section and clicks Next
    Then Admin enters primary details
    Then Admin enters few more details
    Then Admin enters Address page details
    Examples:
      |username|password|firstname|lastname|mailid|password|
      |||Loan|App||Abcd1234|

  @CopyReferalRefinanceUSDATest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And Admin enters loan type as usda
    And User selects property use
    And Admin continue to next section

  @CopyReferalRefinanceUSDATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @CopyReferalRefinanceUSDATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @CopyReferalRefinanceUSDATest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @CopyReferalRefinanceUSDATest
  Scenario: Declaration Section
    Given Admin navigates to Declarations Section
    And Admin enters if US Citizen or not
    And Admin enters some details
    And Admin enters more details
    And Admin enters details in HMDA Section
    And Admin enters Social Security Number
    And Admin enters whether he authorizes Roostify to pull the credit
    And Admin continues to next section

  @CopyReferalRefinanceUSDATest
  Scenario: Application Release Sectionm
    Given Admin navigates to Application release section and submits the application
