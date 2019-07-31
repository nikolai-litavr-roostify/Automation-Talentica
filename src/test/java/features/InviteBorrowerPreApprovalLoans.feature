@InviteBorrowerPreApprovalLoansTest
Feature: Invite Borrower Functionality
  @InviteBorrowerPreConTest
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
      |roostify_admin@roostify.com|168Washu||Loan|App|Abcd1234|

  @InviteBorrowerPreConTest
  Scenario: Loan Section
    Given Admin selects loan purpose
    And Admin enters city details
    And Admin enters loan type
    And Admin enters interest rate type
    And Admin enters property use
    And Admin enters downpayment plan
    And Admin enters number of years for loan to amortize

  @InviteBorrowerPreConTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @InviteBorrowerPreConTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @InviteBorrowerPreConTest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @InviteBorrowerPreConTest
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

  @InviteBorrowerPreConTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @InviteBorrowerPreFHATest
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
      |roostify_admin@roostify.com|168Washu||Loan|App|Abcd1234|

  @InviteBorrowerPreFHATest
  Scenario: Loan Section
    Given Admin selects loan purpose
    And Admin enters city details
    And Admin enters loan type as fha
    And Admin enters interest rate type as arm
    And Admin enters property use
    And Admin enters downpayment plan
    And Admin enters number of years for loan to amortize for fha loan

  @InviteBorrowerPreFHATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @InviteBorrowerPreFHATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @InviteBorrowerPreFHATest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @InviteBorrowerPreFHATest
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

  @InviteBorrowerPreFHATest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @InviteBorrowerPreVaTest
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
      |roostify_admin@roostify.com|168Washu||Loan|App|Abcd1234|

  @InviteBorrowerPreVaTest
  Scenario: Loan Section
    Given Admin selects loan purpose
    And Admin enters city details
    And Admin enters loan type as va
    And Admin enters interest rate type
    And Admin enters property use
    And Admin enters downpayment plan
    And Admin enters number of years for loan to amortize

  @InviteBorrowerPreVaTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @InviteBorrowerPreVaTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @InviteBorrowerPreVaTest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @InviteBorrowerPreVaTest
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

  @InviteBorrowerPreVaTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @InviteBorrowerPreUSDATest
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
      |roostify_admin@roostify.com|168Washu||Loan|App|Abcd1234|

  @InviteBorrowerPreUSDATest
  Scenario: Loan Section
    Given Admin selects loan purpose
    And Admin enters city details
    And Admin enters loan type as usda
    And Admin enters property use
    And Admin enters downpayment plan
    And Admin continue to next section

  @InviteBorrowerPreUSDATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @InviteBorrowerPreUSDATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @InviteBorrowerPreUSDATest
  Scenario: Assets and Liabilities Section
    Given Admin navigates to the Assets and Liabilities Section of the page
    And Admin enters the Ownership stake response
    And Admin enters Property Details
    And Admin enters current property ownership status
    And Admin enters the details about financial assets
    Then Admin enters ongoing payments details and continues to next section

  @InviteBorrowerPreUSDATest
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

  @InviteBorrowerPreUSDATest
  Scenario: Application Release Sectionm
    Given Admin navigates to Application release section and submits the application






