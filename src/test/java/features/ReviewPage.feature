@ReviewPageTest
Feature: Test Review Page Functionality
  @ReviewTest
  Scenario Outline: Test Login Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on review button for a loan application
    Then Admin Verifies if summary of the loan application is displayed
    Then Admin Verifies if the Review Page consists expected Sections
    #Given Admin User clicks on Assign Button
    Examples:
      |username|password|
      |||

  @TasksTest
  Scenario Outline: Tasks Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on review button for a loan application
    Then Admin User clicks on Tasks
    Then Admin Creates New Task
    Then User clicks on to the created task
    Then Admin clicks on Add File Button
    Then Admin checks if the uploaded document can be downloaded
    Then Admin checks if the uploaded document can be deleted
    Then Admin marks the task as complete

    Examples:
      |username|password|
      |||

  @StreamTest
  Scenario Outline: Stream Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on review button for a loan application
    Then Admin user clicks on Stream Tab
    Then Admin verifies if recent activity is displayed
    Then Admin enters status update
    Then Admin clicks on Post Button
    Then Admin verifies if the status update is displayed
    Then Admin adds a comment in the comment section

    Examples:
      |username|password|
      |||

  @NotesTest
  Scenario Outline: Notes Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on review button for a loan application
    Then Admin clicks on Notes tab
    Then Admin enters note content
    Then Admin clicks on Add note button
    Examples:
      |username|password|
      |||

  @WarningsTest
   Scenario Outline: Warnings Functionality for Admin in Roostify Core Application
     Given Admin is on the Roostify Core Login Page
     When Admin enters "<username>"
     And Admin enters also "<password>"
     And Admin clicks on Sign In Button.
     Then Admin navigates to Roostify Core Home Page.
     Then Admin clicks on review button for a loan application
     Then Admin clicks on Warnings Tab
     Then Admin verifies warnings under Borrower
     Examples:
       |username|password|
       |||

  @ActivityTest
  Scenario Outline: Activity Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on review button for a loan application
    Then Admin clicks on Activity Tab
    Examples:
      |username|password|
      |||

  @AssetsTest
  Scenario Outline: Assets Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on review button for a loan application
    Then Admin clicks on Assets Tab
    Examples:
      |username|password|
      |||

  @FindingsTest
  Scenario Outline: Findings Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on review button for a loan application
    Then Admin clicks on Findings Tab
    Then Admin clicks on New Findings button
    Examples:
      |username|password|
      |||

  @CreditReportTest
  Scenario Outline: Credit Report Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on review button for a loan application
    Then Admin clicks on Credit Reports Tab
    Then Admin clicks on new Credit report
    Then Admin enters SSN
    Then Admin authorizes credit pull check
    Then Admin pulls credit
    Examples:
      |username|password|
      |||

  @RatesTest
  Scenario Outline: Rates Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on review button for a loan application
    Then Admin clicks on Rates Tab
    Examples:
      |username|password|
      |||


  @MessagesTest
  Scenario Outline: Messages Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on review button for a loan application
    Then Admin clicks on Messages Tab
    Examples:
      |username|password|
      |||

  @ArchiveTest
  Scenario Outline: Messages Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on review button for a loan application
    Then Admin clicks on Archive Button on the review page
    Then Admin clicks Unarchive button on the review page
    Examples:
      |username|password|
      |||

  @BorrowerViewTest
  Scenario Outline: Messages Functionality for Admin in Roostify Core Application
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin clicks on review button for a loan application
    Then Admin clicks on the Borrower View Button
    Examples:
      |username|password|
      |||
