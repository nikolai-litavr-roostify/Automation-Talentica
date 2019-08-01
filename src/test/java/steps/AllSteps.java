package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pageObjects.*;
import pageObjects.loanApplications.*;
import utils.WaitUtility;

public class AllSteps{

    LoginPage lp;
    AddLoanManuallyPreConPage alm;
    LoanSection ls;
    EmploymentSection es;
    IncomeSection is;
    AssetsLiabilitiesSection asl;
    DeclarationsSection dl;
    ApplicationRelease ap;
    InviteBorrowerPage ib;
    AboutYouSection ay;
    CopyReferalPage cr;
    SignUpPage su;
    public static WebDriver driver;
    PageObjectManager pageObjectManager;
    WebDriverManager webDriverManager;
    Coborrowerflowpage cob;
    ConnectionPage con;
    MessagesPage msg;
    AddLoanManuallyPreFHAPage addLoanManuallyPreFHAPage;
    AddLoanManuallyPreVaPage addLoanManuallyPreVaPage;
    AddLoanManuallyPreUSDAPage addLoanManuallyPreUSDAPage;
    AddLoanManuallyHomeConPage addLoanManuallyHomeConPage;
    AddLoanManuallyRefinanceConPage addLoanManuallyRefinanceConPage;
    AddLoanManuallyHelocPage addLoanManuallyHelocPage;
    TeamPage tp;
    UserPage up;


//    Login Page Section
    @Given("^Admin is on the Roostify Core Login Page$")
    public void admin_is_on_the_Roostify_Core_Login_Page()
    {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        driver = webDriverManager.getUrl();
        pageObjectManager = new PageObjectManager(driver);
        lp = pageObjectManager.getLoginPage();

    }

    @When("^Admin enters \"([^\"]*)\"$")
    public void adminEnters(String username)
    {

        lp.enter_userMail(username);

    }

    @And("^Admin enters also \"([^\"]*)\"$")
    public void adminEntersAlso(String password)
    {
        lp.enter_password(password);
    }

    @And("^Admin clicks on Sign In Button\\.$")
    public void admin_clicks_on_Sign_In_Button()
    {

        lp.click_SignIn();
    }

    @Then("^Admin navigates to Roostify Core Home Page\\.$")
    public void adminNavigatesToRoostifyCoreHomePage()
    {
    }

//    Add Loan Manually Section

    @Given("^Admin clicks on add loan manually link$")
    public void admin_clicks_on_add_loan_manually_link()
    {
        pageObjectManager = new PageObjectManager(driver);
        alm = pageObjectManager.getAddLoanManuallyPage();
        alm.click_Link();
        WaitUtility.untilPageLoadComplete(driver);
    }

    @When("^Admin enters user\"([^\"]*)\"$")
    public void admin_enters_usersomething(String email)
    {
        alm.enter_loanMail(email);
    }

    @And("^Admin enters user \"([^\"]*)\"$")
    public void admin_enters_user_something(String firstName)
    {
        alm.enter_firstName(firstName);
    }

    @And("^Admin enters users \"([^\"]*)\"$")
    public void adminEntersUsers(String lastname)
    {
        alm.enter_lastName(lastname);
    }
    @And("^Admin selects \"([^\"]*)\"$")
    public void admin_selects_something(String account)
    {
        alm.select_Account(account);
    }

    @Then("^Admin clicks on create button$")
    public void admin_clicks_on_create_button()
    {
        alm.click_Create();
    }

    @Then("^Admin continues on behalf of borrower$")
    public void admin_continues_on_behalf_of_borrower()
    {
        alm.admin_Flow();
    }

//    About You Section

    @Then("^Admin starts the flow$")
    public void admin_starts_the_flow()
    {
        pageObjectManager = new PageObjectManager(driver);
        ay = pageObjectManager.getAboutYouPage();
        ay.admin_Continue();
    }
    @Then("^Admin starts with About you Section and clicks Next$")
    public void admin_starts_with_about_you_section_and_clicks_next()
    {
        ay.admin_ABoutYou_Next();
    }
    @Then("^Admin enters primary details$")
    public void admin_enters_primary_details()
    {
        ay.header_about_you();
        ay.primary_Details();
    }
    @Then("^Admin enters few more details$")
    public void admin_enters_few_more_details()
    {
        ay.few_more_Details();
    }
    @Then("^Admin enters Address page details$")
    public void admin_enters_address_details()
    {
        ay.address_Details();
    }

//    Loan Section

    @Given("^Admin selects loan purpose$")
    public void adminSelectsLoanPurpose()
    {
        pageObjectManager = new PageObjectManager(driver);
        ls = pageObjectManager.getLoanSectionPage();
        ls.loan_details();
    }

    @And("^Admin enters city details$")
    public void admin_enters_city_details()
    {
        ls.city_details();
    }

    @And("^Admin enters loan type$")
    public void admin_enters_loan_type()
    {
        ls.loan_Type();
    }

    @And("^Admin enters interest rate type$")
    public void admin_enters_interest_rate_type()
    {
        ls.interest_Rate_Type();
    }

    @And("^Admin enters property use$")
    public void admin_enters_property_use()
    {
        ls.property_Use();
    }

    @And("^Admin enters downpayment plan$")
    public void admin_enters_downpayment_plan()
    {
        ls.downpayment_Plan();
    }

    @And("^Admin enters number of years for loan to amortize$")
    public void admin_enters_number_of_years_for_loan_to_amortize()
    {
        ls.no_of_Years();
    }

//    Employment Section

    @Given("^Admin navigates to Employment Section of the page$")
    public void admin_navigates_to_employment_section_of_the_page()
    {
        pageObjectManager = new PageObjectManager(driver);
        es = pageObjectManager.getEmploymentSectionPage();
        es.employment_Section();
    }
    @And("^Admin enters current employment status$")
    public void admin_enters_current_employment_status()
    {
        es.current_Employment();
    }
    @Then("^Admin enters employment details$")
    public void admin_enters_employment_details()
    {
        es.employment_Details();
    }

//    Income Section

    @Given("^Admin navigates to the Income section of the page$")
    public void admin_navigates_to_the_income_section_of_the_page()
    {
        pageObjectManager = new PageObjectManager(driver);
        is = pageObjectManager.getIncomeSectionPage();
        is.income_Section();
    }

    @Then("^Admin Enters Income Section$")
    public void admin_enters_income_section()
    {
        is.income_Details();

    }

//    Assets and Liabilities Section

    @Given("^Admin navigates to the Assets and Liabilities Section of the page$")
    public void admin_navigates_to_the_assets_and_liabilities_section_of_the_page()
    {
        pageObjectManager = new PageObjectManager(driver);
        asl = pageObjectManager.getAssetsLiabilitiesSectionPage();
        asl.assets_Liabilities_Section();
    }

    @And("^Admin enters the Ownership stake response$")
    public void admin_enters_the_ownership_stake_response()
    {
        asl.ownership_Stake();
    }
    @And("^Admin enters Property Details$")
    public void admin_enters_property_details()  {
        asl.property_Details();
    }
    @And("^Admin enters current property ownership status$")
    public void admin_enters_current_property_ownership_status()  {
        asl.current_Property_Ownership();
    }

    @And("^Admin enters the details about financial assets$")
    public void admin_enters_the_details_about_financial_assets()  {
        asl.financial_assets_Details();
    }

    @Then("^Admin enters ongoing payments details and continues to next section$")
    public void admin_enters_ongoing_payments_details_and_continues_to_next_section()  {
        asl.ongoing_Payments();
    }

//    Declaration Section

    @Given("^Admin navigates to Declarations Section$")
    public void admin_navigates_to_declarations_section()  {
        pageObjectManager = new PageObjectManager(driver);
        dl = pageObjectManager.getDeclarationsSectionPage();
        dl.declarations_Section();
    }

    @And("^Admin enters if US Citizen or not$")
    public void admin_enters_if_us_citizen_or_not()  {
        dl.us_Citizen();
    }
    @And("^Admin enters some details$")
    public void admin_enters_some_details()  {
        dl.more_Details1();
    }

    @And("^Admin enters more details$")
    public void admin_enters_more_details()  {
        dl.more_Details2();
    }

    @And("^Admin enters details in HMDA Section$")
    public void admin_enters_details_in_hmda_section() {
        dl.hmda_Section();
    }
    @And("^Admin enters Social Security Number$")
    public void admin_enters_social_security_number()  {
        dl.ssn_Details();
    }

    @And("^Admin enters whether he authorizes Roostify to pull the credit$")
    public void admin_enters_whether_he_authorizes_roostify_to_pull_the_credit()  {
        dl.allow_Credit();
    }

    @And("^Admin estimates his credit$")
    public void admin_estimates_his_credit()  {
        dl.credit_Estimate();
    }

    @And("^Admin continues to next section$")
    public void admin_continues_to_next_section()  {
        dl.continue_Section();
    }

//    Application Release Section

    @Given("^Admin navigates to Application release section and submits the application$")
    public void admin_navigates_to_application_release_section_and_submits_the_application()  {
        pageObjectManager = new PageObjectManager(driver);
        ap = pageObjectManager.getApplicationReleasePage();
        ap.skip_Warnings_Submit();
    }

//    Invite Borrower

    @Then("^Admin clicks on Invite Borrower link$")
    public void adminClicksOnInviteBorrowerLink() {
        pageObjectManager = new PageObjectManager(driver);
        ib = pageObjectManager.getInviteBorrowerPage();
        ib.click_invite_borrower();

    }

    @Then("^Admin enters new user \"([^\"]*)\"$")
    public void adminEntersNewUser(String email)
    {
        ib.enter_email(email);
    }

    @And("^Admin clicks on Invite button$")
    public void adminClicksOnInviteButton() {
        ib.click_invite_button();
    }

//    Messages

    @Then("^Admin clicks on Admin Console link$")
    public void admin_clicks_on_Admin_Console_link()
    {
        pageObjectManager = new PageObjectManager(driver);
        msg = pageObjectManager.getMessagePage();
        msg.click_admin_console();
    }

    @And("^Admin click on Messages section$")
    public void adminClickOnMessagesSection() {
        msg.click_messages();
    }

    @And("^Admin clicks on Message link$")
    public void adminClicksOnMessageLink() {
        msg.click_message_link();
    }

    @And("^Admin clicks on Start Application link$")
    public void adminClicksOnStartApplicationLink() {
        msg.click_start_application();
    }

//    Sign Up

    @And("^User enters user \"([^\"]*)\"$")
    public void userEntersUser(String firstName)
    {
        pageObjectManager = new PageObjectManager(driver);
        su = pageObjectManager.getSignUpPage();
        su.enter_first_name(firstName);
    }

    @And("^User enters users \"([^\"]*)\"$")
    public void userEntersUsers(String lastName) {
        su.enter_last_name(lastName);
    }

    @And("^User enters also \"([^\"]*)\"$")
    public void userEntersAlso(String password) {
        su.enter_signup_password(password);
    }

    @Then("^User enters new users \"([^\"]*)\"$")
    public void user_enters_new_users_something(String mailid)  {
        su.enter_signup_mail(mailid);
    }

    @And("^User clicks on Agree Terms and Conditions$")
    public void adminClicksOnAgreeTermsAndConditions() {
        su.click_terms_conditions();
    }


    @And("^User clicks on Start Application button$")
    public void userClicksOnStartApplicationButton() {
        su.start_application();
    }

//    Copy Referral URL

    @And("^Admin clicks on Copy Referral Link and opens in new window$")
    public void adminClicksOnCopyReferralLinkAndOpensInNewWindow() {
        pageObjectManager = new PageObjectManager(driver);
        cr = pageObjectManager.getCopyReferalPage();
        cr.copy_referal_link();
        cr.referral_url();
        cr.open_new_tab();
    }

//    Co-borrower Flow

    @Then("^Admin enters Address$")
    public void adminEntersAddress()
    {
        pageObjectManager = new PageObjectManager(driver);
        cob = pageObjectManager.getCoborrowerPage();
        cob.address_Details();

    }

    @Then("^Admin selects include coborrower$")
    public void adminSelectsIncludeCoborrower()
    {
        cob.add_coborrower();
    }


    @Then("^Admin enters coborrower fname$")
    public void adminEntersCoborrowerFname()
    {
        cob.co_fname();
    }

    @Then("^Admin enters coborrower lname$")
    public void adminEntersCoborrowerLname()
    {
        cob.co_lname();
    }

    @Then("^Admin enters coborrower \"([^\"]*)\"$")
    public void adminEntersCoborrower(String email)
    {
        cob.co_email(email);

    }

    @Then("^Admin enters coborrower phone number and clicks next$")
    public void adminEntersCoborrowerPhoneNumberAndClicksNext()
    {
        cob.co_phone();
    }

    @Then("^Admin selcts no to armed services$")
    public void adminSelctsNoToArmedServices()
    {
        cob.armed_services();
    }

    @Given("^User enters coborrower address$")
    public void userEntersCoborrowerAddress()
    {
        cob.coborrower_address();
    }

    @And("^User navigates to Applcation Release Section$")
    public void userNavigatesToApplcationReleaseSection()
    {
        cob.application_release();
    }

    @And("^Admin goes to Application Release section$")
    public void adminGoesToApplicationReleaseSection()
    {
        cob.application_release();
    }

//    Connection

    @Then("^Admin clicks on Connection link$")
    public void adminClicksOnConnectionLink()
    {
        pageObjectManager = new PageObjectManager(driver);
        con = pageObjectManager.getConnectionPage();
        con.connection();
    }


    @Then("^Admin clicks on Add Connection Button$")
    public void adminClicksOnAddConnectionButton()
    {
        con.add_connection();
    }

    @Then("^Admin enters connection first name$")
    public void adminEntersConnectionFirstName()
    {
        con.connection_fname();
    }


    @Then("^Admin enters connection second name$")
    public void adminEntersConnectionSecondName()
    {
        con.connection_lname();
    }


    @Then("^Admin enters connection \"([^\"]*)\"$")
    public void adminEntersConnection(String email)
    {

        con.connection_email(email);
    }


    @Then("^Admin clicks on invite connection button$")
    public void adminClicksOnInviteConnectionButton()
    {
        con.invite_connection();
    }

    @And("^Admin clicks on Connect Now link$")
    public void adminClicksOnConnectNowLink()
    {
        con.connect_now();
    }

    @And("^Admin clicks on complete registration link$")
    public void adminClicksOnCompleteRegistrationLink()
    {
        con.complete_registration();

    }

    @And("^User enters also \"([^\"]*)\" for connection$")
    public void userEntersAlsoForConnection(String password)
    {
        con.enter_signup_password(password);
    }

    @And("^User clicks on Agree Terms and Conditions for connection$")
    public void userClicksOnAgreeTermsAndConditionsForConnection()
    {
        con.click_terms_conditions();
    }

    @And("^Admin enters loan type as fha$")
    public void adminEntersLoanTypeAsFha() {
        pageObjectManager = new PageObjectManager(driver);
        addLoanManuallyPreFHAPage = pageObjectManager.getAddLoanManuallyPreFHAPage();
        addLoanManuallyPreFHAPage.fha_loan_type();
    }

    @And("^Admin enters interest rate type as arm$")
    public void adminEntersInterestRateTypeAsArm() {
        addLoanManuallyPreFHAPage.arm_type();
    }

    @And("^Admin enters number of years for loan to amortize for fha loan$")
    public void adminEntersNumberOfYearsForLoanToAmortizeForFhaLoan()
    {
        addLoanManuallyPreFHAPage.arm_years();
    }


    @And("^Admin enters loan type as va$")
    public void adminEntersLoanTypeAsVa()
    {
        pageObjectManager = new PageObjectManager(driver);
        addLoanManuallyPreVaPage = pageObjectManager.getAddLoanManuallyPreVaPage();
        addLoanManuallyPreVaPage.va_loan_type();
    }

    @And("^Admin enters loan type as usda$")
    public void adminEntersLoanTypeAsUsda() {
        pageObjectManager = new PageObjectManager(driver);
        addLoanManuallyPreUSDAPage = pageObjectManager.getAddLoanManuallyPreUSDAPage();
        addLoanManuallyPreUSDAPage.usda_loan_type();
    }

    @And("^Admin continue to next section$")
    public void adminContinueToNextSection()
    {
        addLoanManuallyPreUSDAPage.click_continue();
    }

    @Given("^Admin selects loan purpose as Home Purchase$")
    public void adminSelectsLoanPurposeAsHomePurchase()
    {
        pageObjectManager = new PageObjectManager(driver);
        addLoanManuallyHomeConPage = pageObjectManager.getAddLoanManuallyHomeConPage();
        addLoanManuallyHomeConPage.home_purchase();
        addLoanManuallyHomeConPage.browsing_market();

    }

    @And("^Admin selects browsing market option$")
    public void adminSelectsBrowsingMarketOption()
    {
        addLoanManuallyHomeConPage.browsing_market();
    }

    @And("^Admin enters location details$")
    public void adminEntersLocationDetails()
    {
        addLoanManuallyHomeConPage.location_details();
    }

    @And("^User enters loan type$")
    public void userEntersLoanType()
    {
        addLoanManuallyHomeConPage.loan_Type();
    }


    @And("^User enters interest rate type$")
    public void userEntersInterestRateType()
    {
        addLoanManuallyHomeConPage.interest_Rate_Type();
    }

    @And("^User enters property use$")
    public void userEntersPropertyUse()
    {
        addLoanManuallyHomeConPage.property_Use();
    }


    @And("^User enters downpayment plan$")
    public void userEntersDownpaymentPlan()
    {
        addLoanManuallyHomeConPage.downpayment_Plan();
    }


    @And("^User enters number of years for loan to amortize$")
    public void userEntersNumberOfYearsForLoanToAmortize()
    {
        addLoanManuallyHomeConPage.no_of_Years();
    }

    @Given("^Admin selects loan purpose as Refinance$")
    public void adminSelectsLoanPurposeAsRefinance()
    {
        pageObjectManager = new PageObjectManager(driver);
        addLoanManuallyRefinanceConPage = pageObjectManager.getAddLoanManuallyRefinanceConPage();
        addLoanManuallyRefinanceConPage.refinance_loan();

    }

    @And("^Admin enter existing balance$")
    public void adminEnterExistingBalance()
    {
        addLoanManuallyRefinanceConPage.existing_balance();
    }

    @And("^User selects loan type$")
    public void userSelectsLoanType()
    {
        addLoanManuallyRefinanceConPage.loan_type();
    }

    @And("^User selects interest rate type$")
    public void userSelectsInterestRateType()
    {
        addLoanManuallyRefinanceConPage.interest_Rate_Type();
    }

    @And("^User selects number of years for loan to amortize$")
    public void userSelectsNumberOfYearsForLoanToAmortize()
    {
        addLoanManuallyRefinanceConPage.no_of_Years();
    }

    @And("^User selects property use$")
    public void userSelectsPropertyUse()
    {
        addLoanManuallyRefinanceConPage.property_Use();
    }

    @And("^User selects downpayment plan$")
    public void userSelectsDownpaymentPlan()
    {
        addLoanManuallyRefinanceConPage.downpayment_Plan();
    }

    @Given("^User navigates to the Assets and Liabilities Section of the page$")
    public void userNavigatesToTheAssetsAndLiabilitiesSectionOfThePage()
    {
        pageObjectManager = new PageObjectManager(driver);
        addLoanManuallyRefinanceConPage = pageObjectManager.getAddLoanManuallyRefinanceConPage();
        addLoanManuallyRefinanceConPage.assets_Liabilities_Section();
    }

    @And("^User enters the Ownership stake response$")
    public void userEntersTheOwnershipStakeResponse()
    {
        addLoanManuallyRefinanceConPage.ownership_Stake();
    }

    @And("^User enters Property Details for refinance$")
    public void userEntersPropertyDetailsForRefinance()
    {
        addLoanManuallyRefinanceConPage.property_Details();
    }


    @And("^User enters current property ownership status$")
    public void userEntersCurrentPropertyOwnershipStatus()
    {
        addLoanManuallyRefinanceConPage.current_Property_Ownership();
    }

    @And("^User enters the details about financial assets$")
    public void userEntersTheDetailsAboutFinancialAssets()
    {
        addLoanManuallyRefinanceConPage.financial_assets_Details();
    }

    @Then("^User enters ongoing payments details and continues to next section$")
    public void userEntersOngoingPaymentsDetailsAndContinuesToNextSection()
    {
        addLoanManuallyRefinanceConPage.ongoing_Payments();
    }

    @Given("^Admin selects loan purpose as HELOC$")
    public void adminSelectsLoanPurposeAsHELOC()
    {
        pageObjectManager = new PageObjectManager(driver);
        addLoanManuallyHelocPage = pageObjectManager.getAddLoanManuallyHelocPage();
        addLoanManuallyHelocPage.heloc_loan();

    }

    @And("^Admin selects heloc loan use$")
    public void adminSelectsHelocLoanUse()
    {
        addLoanManuallyHelocPage.heloc_loan_use();
    }


    @And("^Admin enters subject property details$")
    public void adminEntersSubjectPropertyDetails()
    {
        addLoanManuallyHelocPage.property_details();
    }

    @And("^Admin enters property income$")
    public void adminEntersPropertyIncome()
    {
        addLoanManuallyHelocPage.property_income();
    }

    @And("^Admin selects existing loan option$")
    public void adminSelectsExistingLoanOption()
    {
        addLoanManuallyHelocPage.existing_loan();
    }

    @And("^Admin enters loan amount details$")
    public void adminEntersLoanAmountDetails()
    {
        addLoanManuallyHelocPage.loan_amount();
    }

    // Team steps:

    @And("^Admin clicks on Team tab$")
    public void AdminclicksonTeamtab()
    {

        pageObjectManager = new PageObjectManager(driver);
        tp = pageObjectManager.getTeamPage();
        tp.ClickOnTeamTab();
        WaitUtility.untilPageLoadComplete(driver);
    }

    @And("^Admin clicks on Add team member$")
    public void AdminclicksonAddteammember(){
        tp.ClickOnAddTeamMember();
    }

    @Then("^Admin selects Person to Add$")
    public void adminSelectsPersonToAdd() {
        tp.SelectPersonToAdd();
    }

    @And("^Admin clicks on select box$")
    public void Adminclicksonselectbox(){
        tp.enterPersonTpAddValue();
    }

    @And("^Admin selects Role$")
    public void AdminselectsRole(){
        tp.SelectRoleAsUnderwriter();
    }

    @And("^Admin clicks on Add to Team$")
    public void AdminclicksonAddtoTeam(){
        tp.ClickOnAddToTeam();
    }

    //Assistant
    @And("^Admin clicks on select box to select Assistant user$")
    public void Adminclickson_selectbox(){
        tp.enterPersonTpAddAsAssistantValue();
    }

    @And("^Admin selects Role to add Assistant$")
    public void Admin_selectsRole(){
        tp.SelectRoleAsAssistant();
    }

    //Processor
    @And("^Admin clicks on select box to select Processor user$")
    public void Admin_clickson_selectbox(){
        tp.enterPersonTpAddAsProcessorValue();
    }

    @And("^Admin selects Role to add Processor$")
    public void Admin_selects_Role(){
        tp.SelectRoleAsProcessor();
    }

    // Delete Underwriter

    @And("^Admin clicks on delete icon to delete underwriter$")
    public void Adminclicksondeleteicontodeleteunderwriter(){
        tp.DeleteTeamMember();
    }

    @And("^Admin clicks on 'Yes, remove' button$")
    public void AdminclicksonYesremovebutton(){
        tp.ClickOnYesRemoveButton();
    }

    // Negative testing - Add Non Existing User (or user from other account) To Team

    @Then("^Admin selects non-existing Person to Add$")
    public void Adminselectsnon_existingPersontoAdd(){
        tp.selectNonExistingUser();
    }


    @And("^Admin clicks on select box to select user from another account$")
    public void AdminclicksonselectboxtoselectAssistantuserfromanotheraccount(){
        tp.enterNonExistingUser();
    }

    @Then("^Admin should see No results matched text$")
    public void AdminshouldseeNoresultsmatchedtext(){
        tp.verifyTextNoResultsMatched();
    }

    // Invite User as Member Steps:


    @Then("^Admin user clicks on Admin Console link$")
    public void admin_user_clicks_on_Admin_Console_link()
    {
        pageObjectManager = new PageObjectManager(driver);
        up = pageObjectManager.getUserPage();
        up.click_admin_console();
    }



    @Then("^Admin clicks on 'Users' tab$")
    public void admin_clicks_on_Users_tab(){
        up.clickOnUsersTab();
    }

    @Then("^Admin clicks on 'Invite a user' icon$")
    public void admin_clicks_on_Invite_a_user_icon(){
        up.clickOnInviteAUserIcon();
    }

    @Then("^Admin enters user email as \"([^\"]*)\"$")
    public void Admin_enters_User_email(String email){
        up.enterUserEmail(email);
    }

    @Then("^Admin enters user confirmation email as \"([^\"]*)\"$")
    public void Admin_enters_user_confirm_email(String confirm_email){
        up.enterUserConfirmEmail();
    }

    @Then("^Admin selects Role of the user$")
    public void admin_selects_Role_of_the_user(){
        up.selectRoleForUser();
    }

    @Then("^Admin selects Primary account for the user$")
    public void Admin_selects_Primary_account_for_the_user(){
        up.selectPrimaryAccountForUser();
    }

    @Then("^Admin selects Secondary account for the user$")
    public void admin_selects_Secondary_account_for_the_user(){
        up.selectSecondaryAccountForUser();
        up.enterUserSecondaryAccount();
    }

    @Then("^Admin clicks on 'Send Invite' button$")
    public void admin_clicks_on_Send_Invite_button(){
        up.clickOnSendInvite();

    }

    // Invite User as Admin Steps:

    @Then("^Admin selects Role of the user as Admin$")
    public void admin_selects_Role_of_the_user_as_Admin(){
        up.selectRoleForUserAsAdmin();
    }

    // Bulk Invite Users using csv

    @Then("^Admin clicks on 'Bulk invite users' icon$")
    public void admin_clicks_on_Bulk_invite_users_icon(){
        up.clickOnBulkInviteIcon();
    }

    @Then("^Admin clicks on 'Add file' button$")
    public void admin_clicks_on_Admin_Console_link_Add_file_button(){
        up.clickOnAddFileButton();
    }

    @Then("^Admin clicks on 'Send Invitation' icon$")
    public void admin_clicks_on_Send_Invitation_icon(){
        up.clickOnSendInvitation();
    }

    @Then("^Admin clicks on 'Upload'$")
    public void admin_clicks_on_Upload() {
        up.clickOnUploadButton();
    }

    //  Search an user:

    @Then("^Admin selects Account to search user$")
    public void admin_selects_Account_to_search_user() {
        up.clickOnUserSearchAccount();

    }

    @Then("^Admin clicks on 'Search' icon$")
    public void admin_clicks_on_Search_icon() {
        up.clickOnSearchIcon();
    }

    @Then("^Admin enters the name or email of an user$")
    public void Admin_enters_the_name_or_email_of_an_user(){
        up.clickOnSearchTextBox();
    }
}

