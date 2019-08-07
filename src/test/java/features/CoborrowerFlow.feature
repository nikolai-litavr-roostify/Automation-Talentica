@CoborrowerFlowTest
Feature: Co-borrower Flow Test
  @CoborrowerTest
  Scenario Outline: Coborrower Functionality Test
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
    Then Admin enters Address
    Then Admin selects include coborrower
    Then Admin enters coborrower fname
    Then Admin enters coborrower lname
    Then Admin enters coborrower "<coborrower_email>"
    Then Admin enters coborrower phone number and clicks next
    Then Admin selcts no to armed services
    Examples:
      |username|password|email|firstname|lastname|account|coborrower_email|
      ||||Vivek|Wagh|Roostify (Roostify)||

  @CoborrowerTest
  Scenario: Loan Section
    Given Admin selects loan purpose as Refinance
    And User selects loan type
    And Admin enter existing balance
    And User selects interest rate type
    And User selects property use
    And User selects number of years for loan to amortize

  @CoborrowerTest
  Scenario: Employment Section
    Given Admin navigates to Employment Section of the page
    And Admin enters current employment status
    Then Admin enters employment details

  @CoborrowerTest
  Scenario: Income Section
    Given Admin navigates to the Income section of the page
    Then Admin Enters Income Section

  @CoborrowerTest
  Scenario: Assets and Liabilities Section
    Given User navigates to the Assets and Liabilities Section of the page
    And User enters the Ownership stake response
    And User enters Property Details for refinance
    And User enters current property ownership status
    And User enters the details about financial assets
    Then User enters ongoing payments details and continues to next section

  @CoborrowerTest
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
    Given User enters coborrower address
    And User navigates to Applcation Release Section

  @CoborrowerTest
  Scenario: Application Release Section
    Given Admin navigates to Application release section and submits the application