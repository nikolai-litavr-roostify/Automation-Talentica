package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddLoanManuallyHomeConPage
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

    public AddLoanManuallyHomeConPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "home_purchase_multi_select")
    private WebElement home_purchase;

    @FindBy(id = "loan_application_lead_stage_browsing")
    private WebElement browsing_market;

    @FindBy(xpath = "//button[@class='js-btn-forward btn btn--block btn--ghost js-substep-nav']")
    private WebElement next_button;

    @FindBy(xpath = "//button[@class='btn--block btn btn--primary js-step-nav']")
    private WebElement continue_button;

    @FindBy(how = How.ID, using = "loan_application_subject_property_attributes_0_city")
    private WebElement city_names;

    @FindBy(how = How.ID, using = "loan_application_subject_property_attributes_0_state")
    private WebElement state_name;

    @FindBy(how = How.ID, using = "loan_application_subject_property_attributes_0_county_fips")
    private WebElement county;

    @FindBy(how = How.ID, using = "loan_application_subject_property_attributes_0_purchase_price")
    private WebElement ideal_purchase_price;

    @FindBy(how = How.ID, using = "down_payment_percentage")
    private WebElement down_payment;

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


    public void home_purchase() {
        sleep();
        next_button.click();
        home_purchase.click();
        next_button.click();
        sleep();
    }

    public void browsing_market()
    {
        browsing_market.click();
        sleep();
        next_button.click();
        sleep();
    }

    public void location_details()
    {
        sleep();
        city_names.sendKeys("New York");
        state_name.click();
        Select s5 = new Select(state_name);
        s5.selectByVisibleText("CA");
        state_name.click();

        county.click();
        Select s6 = new Select(county);
        s6.selectByVisibleText("Alpine");
        county.click();
        ideal_purchase_price.sendKeys("300000");
        sleep();
        next_button.click();
        down_payment.sendKeys("10");
        next_button.click();
    }

    public void loan_Type()
    {
        loan_type.click();
        next_button.click();
    }

    public void interest_Rate_Type()
    {
        interest_rate_type.click();
        next_button.click();
    }

    public void property_Use()
    {
        property_use.click();
        next_button.click();
    }
    public void downpayment_Plan()
    {
        downpayment_plan.click();
        next_button.click();
    }

    public void no_of_Years()
    {
        no_of_years.click();
        next_button.click();
        continue_button.click();
    }

}
