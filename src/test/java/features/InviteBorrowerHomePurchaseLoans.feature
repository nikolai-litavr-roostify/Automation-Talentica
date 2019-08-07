@InviteBorrowerHomePurchaseLoansTest
Feature: Invite Borrower Functionality
  @InviteBorrowerHomeConTest
  Scenario Outline: Test Invite Borrower Functionality
  Given Admin is on the Roostify Core Login Page
  When Admin enters "<username>"
  And Admin enters also "<password>"
  And Admin clicks on Sign In Button.
  Then Admin navigates to Roostify Core Home Page.
  Then Admin clicks on Invite Borrower link
  Then Admin enters new user "<mailid>"
  And Admin clicks on Invite button
  And Admin clicks on Admin Console link
  And Admin click on Messages section
  And Admin clicks on Message link
  And Admin clicks on Start Application link
  And User enters user "<firstname>"
  And User enters users "<lastname>"
  And User enters also "<password>"
  And User clicks on Agree Terms and Conditions
  And User clicks on Start Application button
  Then Admin starts the flow
  Then Admin starts with About you Section and clicks Next
  Then Admin enters primary details
  Then Admin enters few more details
  Then Admin enters Address page details
    Examples:
      |username|password|mailid|firstname|lastname|password|
      ||||Loan|App|Abcd1234|

  @InviteBorrowerHomeConTest
  Scenario: Loan Section
    Given Admin selects loan purpose as Home Purchase
    And Admin enters location details
    And User enters loan type
    And User enters interest rate type
    And User enters property use
    And User enters downpayment plan
    And User enters number of years for loan to amortize

  @InviteBorrowerHomeConTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @InviteBorrowerHomeConTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @InviteBorrowerHomeConTest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @InviteBorrowerHomeConTest
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

  @InviteBorrowerHomeConTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @InviteBorrowerHomeFHATest
  Scenario Outline: Test Invite Borrower Functionality
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on Invite Borrower link
    Then Admin enters new user "<mailid>"
    And Admin clicks on Invite button
    And Admin clicks on Admin Console link
    And Admin click on Messages section
    And Admin clicks on Message link
    And Admin clicks on Start Application link
    And User enters user "<firstname>"
    And User enters users "<lastname>"
    And User enters also "<password>"
    And User clicks on Agree Terms and Conditions
    And User clicks on Start Application button
    Then Admin starts the flow
    Then Admin starts with About you Section and clicks Next
    Then Admin enters primary details
    Then Admin enters few more details
    Then Admin enters Address page details
    Examples:
      |username|password|mailid|firstname|lastname|password|
      ||||Loan|App|Abcd1234|

  @InviteBorrowerHomeFHATest
  Scenario: Loan Section
    Given Admin selects loan purpose as Home Purchase
    And Admin enters location details
    And Admin enters loan type as fha
    And User enters interest rate type
    And User enters property use
    And User enters downpayment plan
    And User enters number of years for loan to amortize

  @InviteBorrowerHomeFHATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @InviteBorrowerHomeFHATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @InviteBorrowerHomeFHATest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @InviteBorrowerHomeFHATest
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

  @InviteBorrowerHomeFHATest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @InviteBorrowerHomeVaTest
  Scenario Outline: Test Invite Borrower Functionality
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on Invite Borrower link
    Then Admin enters new user "<mailid>"
    And Admin clicks on Invite button
    And Admin clicks on Admin Console link
    And Admin click on Messages section
    And Admin clicks on Message link
    And Admin clicks on Start Application link
    And User enters user "<firstname>"
    And User enters users "<lastname>"
    And User enters also "<password>"
    And User clicks on Agree Terms and Conditions
    And User clicks on Start Application button
    Then Admin starts the flow
    Then Admin starts with About you Section and clicks Next
    Then Admin enters primary details
    Then Admin enters few more details
    Then Admin enters Address page details
    Examples:
      |username|password|mailid|firstname|lastname|password|
      ||||Loan|App|Abcd1234|

  @InviteBorrowerHomeVaTest
  Scenario: Loan Section
    Given Admin selects loan purpose as Home Purchase
    And Admin enters location details
    And Admin enters loan type as va
    And User enters interest rate type
    And User enters property use
    And User enters downpayment plan
    And User enters number of years for loan to amortize

  @InviteBorrowerHomeVaTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @InviteBorrowerHomeVaTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @InviteBorrowerHomeVaTest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @InviteBorrowerHomeVaTest
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

  @InviteBorrowerHomeVaTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @InviteBorrowerHomeUSDATest
  Scenario Outline: Test Invite Borrower Functionality
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on Invite Borrower link
    Then Admin enters new user "<mailid>"
    And Admin clicks on Invite button
    And Admin clicks on Admin Console link
    And Admin click on Messages section
    And Admin clicks on Message link
    And Admin clicks on Start Application link
    And User enters user "<firstname>"
    And User enters users "<lastname>"
    And User enters also "<password>"
    And User clicks on Agree Terms and Conditions
    And User clicks on Start Application button
    Then Admin starts the flow
    Then Admin starts with About you Section and clicks Next
    Then Admin enters primary details
    Then Admin enters few more details
    Then Admin enters Address page details
    Examples:
      |username|password|mailid|firstname|lastname|password|
      ||||Loan|App|Abcd1234|

  @InviteBorrowerHomeUSDATest
  Scenario: Loan Section
    Given Admin selects loan purpose as Home Purchase
    And Admin enters location details
    And Admin enters loan type as usda
    And User enters property use
    And User enters downpayment plan
    And Admin continue to next section

  @InviteBorrowerHomeUSDATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @InviteBorrowerHomeUSDATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @InviteBorrowerHomeUSDATest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @InviteBorrowerHomeUSDATest
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

  @InviteBorrowerHomeUSDATest
  Scenario: Application Release Sectionm
    Given Admin navigates to Application release section and submits the application

