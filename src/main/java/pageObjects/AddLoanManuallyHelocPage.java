package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddLoanManuallyHelocPage
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

    public AddLoanManuallyHelocPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "heloc_multi_select")
    private WebElement heloc_loan;

    @FindBy(id = "root_loan_use_1")
    private WebElement heloc_loan_use;

    @FindBy(how = How.ID, using = "root_primary_subject_property_address1")
    private WebElement address_1;

    @FindBy(how = How.ID, using = "root_primary_subject_property_city")
    private WebElement city;

    @FindBy(how = How.ID, using = "root_primary_subject_property_state")
    private WebElement state;

    @FindBy(how = How.ID, using = "root_primary_subject_property_zip")
    private WebElement zip;

    @FindBy(id  = "root_property_type_3")
    private WebElement property_type;

    @FindBy(how = How.ID, using = "root_property_use_0")
    private WebElement current_use;

    @FindBy(how = How.ID, using = "root_title_status_0")
    private WebElement current_status;

    @FindBy(how = How.ID, using = "root_rental_income")
    private WebElement rental_income;

    @FindBy(how = How.ID, using = "root_home_insurance_name")
    private WebElement insurance_name;

    @FindBy(how = How.ID, using = "root_monthly_homeowners_insurance")
    private WebElement homeowners_insurance;

    @FindBy(how = How.ID, using = "root_monthly_hoa")
    private WebElement monthly_hoa;

    @FindBy(how = How.ID, using = "root_annual_tax")
    private WebElement property_annual_tax;

    @FindBy(id = "root_has_first_mortgage_1")
    private WebElement existing_loan;

    @FindBy(id = "root_market_value")
    private WebElement market_value;

    @FindBy(id = "root_loan_amount")
    private WebElement desired_loan_amount;

    @FindBy(xpath = "//button[@class='js-btn-forward btn btn--block btn--ghost js-substep-nav']")
    private WebElement next_button;

    @FindBy(xpath = "//button[@class='btn btn--block btn--ghost js-substep-nav js-form-footer-next']")
    private WebElement new_next_button;

    @FindBy(xpath = "//button[@class='btn--block btn btn--primary js-step-nav']")
    private WebElement continue_button;

    @FindBy(xpath = "//div[@class='col-12 col-md-2 form-group']/button[@value='next']")
    private WebElement fix_later_continue;

    public void heloc_loan()
    {
        next_button.click();
        sleep();
        heloc_loan.click();
        next_button.click();
        sleep();
    }

    public void heloc_loan_use()
    {
        sleep();
        heloc_loan_use.click();
        sleep();
        new_next_button.click();
        sleep();
    }

    public void property_details()
    {
        address_1.sendKeys("463 7th Avenue");
        sleep();
        city.sendKeys("New York");
        sleep();
        state.click();
        Select s4 = new Select(state);
        s4.selectByVisibleText("CA");
        state.click();
        zip.sendKeys("94118");
        property_type.click();
        sleep();
        current_use.click();
        sleep();
        current_status.click();
        sleep();
        new_next_button.click();
        sleep();
    }

    public void property_income()
    {
        rental_income.sendKeys("1000");
        sleep();
        insurance_name.sendKeys("HDFC");
        sleep();
        homeowners_insurance.sendKeys("100");
        sleep();
        monthly_hoa.sendKeys("100");
        sleep();
        property_annual_tax.sendKeys("100");
        sleep();
        new_next_button.click();
        sleep();
        new_next_button.click();
    }

    public void existing_loan()
    {
        sleep();
        existing_loan.click();
        sleep();
        new_next_button.click();
    }
    public void loan_amount()
    {
        sleep();
        market_value.sendKeys("40000");
        sleep();
        desired_loan_amount.sendKeys("30000");
        sleep();
        new_next_button.click();
        sleep();
        fix_later_continue.click();
    }
}
