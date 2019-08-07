@InviteBorrowerRefinanceLoansTest
Feature: Invite Borrower Functionality
  @InviteBorrowerRefinanceConTest
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

  @InviteBorrowerRefinanceConTest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And User selects loan type
    And Admin enter existing balance
    And User selects interest rate type
    And User selects property use
    And User selects number of years for loan to amortize

  @InviteBorrowerRefinanceConTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @InviteBorrowerRefinanceConTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @InviteBorrowerRefinanceConTest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @InviteBorrowerRefinanceConTest
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

  @InviteBorrowerRefinanceConTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @InviteBorrowerRefinanceFHATest
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
      |roostify_admin@roostify.com|||Loan|App|Abcd1234|

  @InviteBorrowerRefinanceFHATest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And Admin enters loan type as fha
    And User selects interest rate type
    And User selects property use
    And User selects number of years for loan to amortize

  @InviteBorrowerRefinanceFHATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @InviteBorrowerRefinanceFHATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @InviteBorrowerRefinanceFHATest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @InviteBorrowerRefinanceFHATest
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

  @InviteBorrowerRefinanceFHATest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @InviteBorrowerRefinanceVaTest
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
      |roostify_admin@roostify.com|||Loan|App|Abcd1234|

  @InviteBorrowerRefinanceVaTest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And Admin enters loan type as va
    And User selects interest rate type
    And User selects property use
    And User selects number of years for loan to amortize

  @InviteBorrowerRefinanceVaTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @InviteBorrowerRefinanceVaTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @InviteBorrowerRefinanceVaTest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @InviteBorrowerRefinanceVaTest
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

  @InviteBorrowerRefinanceVaTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application

  @InviteBorrowerRefinanceUSDATest
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
      |roostify_admin@roostify.com|||Loan|App|Abcd1234|

  @InviteBorrowerRefinanceUSDATest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And Admin enters loan type as usda
    And User selects property use
    And Admin continue to next section

  @InviteBorrowerRefinanceUSDATest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @InviteBorrowerRefinanceUSDATest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @InviteBorrowerRefinanceUSDATest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @InviteBorrowerRefinanceUSDATest
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

  @InviteBorrowerRefinanceUSDATest
  Scenario: Application Release Sectionm
    Given Admin navigates to Application release section and submits the application


