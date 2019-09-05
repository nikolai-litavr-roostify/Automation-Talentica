package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddLoanManuallyRefinanceConPage
{
    WebDriver driver;

    public static void sleep()
    {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public AddLoanManuallyRefinanceConPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "refinancing_multi_select")
    private WebElement refinace_loan;

    @FindBy(id = "loan_application_amount_of_mortgage_balances_to_refinance")
    private WebElement refinace_balance;

    @FindBy(id = "loan_application_desired_cashout_amount")
    private WebElement cashout;

    @FindBy(id = "loan_application_non_mortgage_payoff_amount")
    private WebElement debts;

    @FindBy(xpath = "//button[@class='js-btn-forward btn btn--block btn--ghost js-substep-nav']")
    private WebElement next_button;

    @FindBy(xpath = "//button[@class='btn--block btn btn--primary js-step-nav']")
    private WebElement continue_button;

    @FindBy(id = "3_years")
    private WebElement arm_years;

    @FindBy(how = How.XPATH, using = "//input[@id='loan_application_mortgage_type_1']")
    private WebElement loan_type;

    @FindBy(how = How.XPATH, using = "//input[@id='loan_application_loan_type_1']")
    private WebElement interest_rate_type;

    @FindBy(how = How.ID, using = "loan_application_property_use_1")
    private WebElement property_use;

    @FindBy(how = How.ID, using = "loan_application_down_payment_method_1")
    private WebElement downpayment_plan;

    @FindBy(how = How.ID, using = "15_years")
    private WebElement no_of_years;

    @FindBy(how = How.ID, using = "applicant_properties_attributes_0_address1")
    private WebElement address_1;

    @FindBy(how = How.ID, using = "applicant_properties_attributes_0_city")
    private WebElement city;

    @FindBy(how = How.ID, using = "applicant_properties_attributes_0_state")
    private WebElement state;

    @FindBy(how = How.ID, using = "applicant_properties_attributes_0_zip")
    private WebElement zip;

    @FindBy(how = How.XPATH, using = "//input[@id='applicant_properties_attributes_0_property_type_3']")
    private WebElement property_type;

    @FindBy(how = How.ID, using = "applicant_properties_attributes_0_property_use_3")
    private WebElement current_use;

    @FindBy(how = How.XPATH, using = "//input[@id='applicant_properties_attributes_0_property_status_2']")
    private WebElement current_status;

    @FindBy(how = How.XPATH, using = "//input[@id='applicant_properties_attributes_0_title_status_2']")
    private WebElement title_status;

    @FindBy(how = How.ID, using = "applicant_properties_attributes_0_market_value")
    private WebElement estimated_market_value;

    @FindBy(how = How.ID, using = "applicant_properties_attributes_0_annual_tax")
    private WebElement annual_property_taxes;

    @FindBy(how = How.ID, using = "applicant_properties_attributes_0_homeowners_insurance_provider")
    private WebElement homeowners_insurance_provider;

    @FindBy(how = How.ID, using = "applicant_properties_attributes_0_monthly_homeowners_insurance")
    private WebElement monthly_homeowners_insurance;

    @FindBy(how = How.ID, using = "applicant_properties_attributes_0_monthly_hoa")
    private WebElement monthly_hoa_dues;

    @FindBy(how = How.ID, using = "applicant_properties_attributes_0_rental_income")
    private WebElement monthly_rental_income;

    @FindBy(how = How.XPATH, using = "//label[@for='applicant[properties_attributes][0]_has_first_mortgage_false']")
    private WebElement existing_loan;

    @FindBy(xpath = "//label[@for='applicant[properties_attributes][0]_subject_property_true']")
    private WebElement property_tobe_refinance;

    @FindBy(how = How.XPATH, using = "//input[@id='loan_application_b_current_ownership_true']")
    private WebElement ownership_stake;

    @FindBy(how = How.XPATH, using = "//input[@id='loan_application_b_recent_ownership_false']")
    private WebElement current_property_ownership;

    @FindBy(how = How.ID, using = "loan_application_b_assets_attributes_0_source")
    private WebElement institute_name;

    @FindBy(how = How.ID, using = "loan_application_b_assets_attributes_0_source_type")
    private WebElement asset_type;

    @FindBy(how = How.ID, using = "loan_application_b_assets_attributes_0_amount")
    private WebElement estimated_current_balance;

    @FindBy(how = How.ID, using = "loan_application_b_ongoing_payments_3")
    private WebElement ongoing_payments;


    public void refinance_loan() {
        sleep();
        next_button.click();
        refinace_loan.click();
        sleep();
        next_button.click();
        sleep();
    }


    public void existing_balance()
    {
        refinace_balance.sendKeys("50000");
        sleep();
        cashout.sendKeys("25000");
        sleep();
        debts.sendKeys("25000");
        sleep();
        next_button.click();
        sleep();
    }

    public void loan_type()
    {
        loan_type.click();
        sleep();
        next_button.click();
        sleep();
    }

    public void interest_Rate_Type()
    {
        interest_rate_type.click();
        next_button.click();
        sleep();
    }

    public void property_Use()
    {
        property_use.click();
        next_button.click();
        sleep();
    }
    public void downpayment_Plan()
    {
        downpayment_plan.click();
        next_button.click();
        sleep();
    }

    public void no_of_Years()
    {
        no_of_years.click();
        next_button.click();
        continue_button.click();
    }

    public void property_Details()
    {
        address_1.sendKeys("463 7th Avenue");
        sleep();
        city.sendKeys("New York");

        state.click();
        Select s4 = new Select(state);
        s4.selectByVisibleText("NY");
        state.click();
        zip.sendKeys("10018");
        sleep();
        property_tobe_refinance.click();
        sleep();
        property_type.click();
        sleep();
        current_use.click();
        sleep();
        current_status.click();
        title_status.click();
        estimated_market_value.sendKeys("100000");
        annual_property_taxes.sendKeys("2000");
        homeowners_insurance_provider.sendKeys("Test_Provider");
        monthly_homeowners_insurance.sendKeys("3000");
        monthly_hoa_dues.sendKeys("1000");
        monthly_rental_income.sendKeys("10000");
        existing_loan.click();
        next_button.click();
    }

    public void assets_Liabilities_Section()
    {
        next_button.click();
    }

    public void ownership_Stake()
    {
        ownership_stake.click();
        sleep();
        next_button.click();
    }

    public void current_Property_Ownership()
    {
        current_property_ownership.click();
        sleep();
        next_button.click();
    }

    public void financial_assets_Details()
    {
        institute_name.sendKeys("Test_Institute_name");

        asset_type.click();
        Select s8 = new Select(asset_type);
        s8.selectByVisibleText("Savings Account");
        asset_type.click();

        estimated_current_balance.sendKeys("10000");
        next_button.click();

    }

    public void ongoing_Payments()
    {
        ongoing_payments.click();
        next_button.click();
        sleep();
        continue_button.click();
    }
}
