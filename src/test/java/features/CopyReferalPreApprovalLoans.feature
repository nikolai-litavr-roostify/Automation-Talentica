@CopyReferralPreApprovalLoansTest
Feature: Copy Referral URL Test
  @CopyReferalPreConTest
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

  @CopyReferalPreConTest
  Scenario: Loan Section
    Given Admin selects loan purpose
    And Admin enters city details
    And Admin enters loan type
    And Admin enters interest rate type
    And Admin enters property use
    And Admin enters downpayment plan
    And Admin enters number of years for loan to amortize

  @CopyReferalPreConTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @CopyReferalPreConTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @CopyReferalPreConTest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @CopyReferalPreConTest
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

  @CopyReferalPreConTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @CopyReferalPreFHATest
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

  @CopyReferalPreFHATest
  Scenario: Loan Section
    Given Admin selects loan purpose
    And Admin enters city details
    And Admin enters loan type as fha
    And Admin enters interest rate type as arm
    And Admin enters property use
    And Admin enters downpayment plan
    And Admin enters number of years for loan to amortize for fha loan

  @CopyReferalPreFHATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @CopyReferalPreFHATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @CopyReferalPreFHATest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @CopyReferalPreFHATest
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

  @CopyReferalPreFHATest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @CopyReferalPreVaTest
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

  @CopyReferalPreVaTest
  Scenario: Loan Section
    Given Admin selects loan purpose
    And Admin enters city details
    And Admin enters loan type as va
    And Admin enters interest rate type
    And Admin enters property use
    And Admin enters downpayment plan
    And Admin enters number of years for loan to amortize

  @CopyReferalPreVaTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @CopyReferalPreVaTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @CopyReferalPreVaTest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @CopyReferalPreVaTest
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

  @CopyReferalPreVaTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @CopyReferalPreUSDATest
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

  @CopyReferalPreUSDATest
  Scenario: Loan Section
    Given Admin selects loan purpose
    And Admin enters city details
    And Admin enters loan type as usda
    And Admin enters property use
    And Admin enters downpayment plan
    And Admin continue to next section

  @CopyReferalPreUSDATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @CopyReferalPreUSDATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @CopyReferalPreUSDATest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @CopyReferalPreUSDATest
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

  @CopyReferalPreUSDATest
  Scenario: Application Release Sectionm
    Given Admin navigates to Application release section and submits the application
