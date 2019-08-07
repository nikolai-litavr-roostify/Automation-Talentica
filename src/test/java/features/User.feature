@InviteUserTest
Feature: Test User invite functionality
  @InviteUserAsMemberTest
  Scenario Outline: Invite a single user as a member
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin user clicks on Admin Console link
    Then Admin clicks on 'Users' tab
    Then Admin clicks on 'Invite a user' icon
    Then Admin enters user email as "<user_email>"
    Then Admin enters user confirmation email as "<user_email>"
    Then Admin selects Role of the user
    Then Admin selects Primary account for the user
    Then Admin selects Secondary account for the user
    And Admin clicks on 'Send Invite' button
    Examples:
      |username|password|user_email|user_email|
      |||||

  @InviteUserAsAdminTest
  Scenario Outline: Invite a single user as an Admin
    Given Admin is on the Roostify Core Login Page
    When Admin enters "<username>"
    And Admin enters also "<password>"
    And Admin clicks on Sign In Button.
    Then Admin navigates to Roostify Core Home Page.
    Then Admin user clicks on Admin Console link
    Then Admin clicks on 'Users' tab
    Then Admin clicks on 'Invite a user' icon
    Then Admin enters user email as "<user_email>"
    Then Admin enters user confirmation email as "<user_email>"
    Then Admin selects Role of the user as Admin
    Then Admin selects Primary account for the user
    Then Admin selects Secondary account for the user
    And Admin clicks on 'Send Invite' button
    Examples:
      |username|password|user_email|user_email|
      |||||

    @BulkInviteUsersUsingCSVFileTest
    Scenario Outline: Bulk invite users using CSV file upload
      Given Admin is on the Roostify Core Login Page
      When Admin enters "<username>"
      And Admin enters also "<password>"
      And Admin clicks on Sign In Button.
      Then Admin navigates to Roostify Core Home Page.
      Then Admin user clicks on Admin Console link
      Then Admin clicks on 'Users' tab
      Then Admin clicks on 'Bulk invite users' icon
      Then Admin clicks on 'Add file' button
      Then Admin clicks on 'Send Invitation' icon
      Then Admin clicks on 'Upload'

      Examples:
        |username|password|
        |||

      @SearchUser
      Scenario Outline: search user by name or email
        Given Admin is on the Roostify Core Login Page
        When Admin enters "<username>"
        And Admin enters also "<password>"
        And Admin clicks on Sign In Button.
        Then Admin navigates to Roostify Core Home Page.
        Then Admin user clicks on Admin Console link
        Then Admin clicks on 'Users' tab
        Then Admin selects Account to search user
        Then Admin clicks on 'Search' icon
        Then Admin enters the name or email of an user

      Examples:
        |username|password|
        |||


