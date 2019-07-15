package pageObjects.loanApplications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmploymentSection {

    public EmploymentSection(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public static void sleep()
    {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    @FindBy(how = How.XPATH, using = "//button[@class='js-btn-forward btn btn--block btn--ghost js-substep-nav']")
    private WebElement next_button;

    @FindBy(how = How.ID, using = "loan_application_b_recently_employed_true")
    private WebElement current_employment;

    @FindBy(how = How.ID, using = "loan_application_b_employment_attributes_0_name")
    private WebElement employer_name;

    @FindBy(how = How.XPATH, using = "//label[@for='loan_application[b_employment_attributes][0]_self_employed_false']")
    private WebElement self_employed;

    @FindBy(how = How.XPATH, using = "//label[@for='loan_application[b_employment_attributes][0]_independent_contractor_false']")
    private WebElement independent_contractor;

    @FindBy(how = How.XPATH, using = "//label[@for='loan_application[b_employment_attributes][0]_payment_type_salary']")
    private WebElement payment_type;

    @FindBy(how = How.XPATH, using = "//label[@for='loan_application[b_employment_attributes][0]_current_true']")
    private WebElement work_status;

    @FindBy(how = How.ID, using = "loan_application_b_employment_attributes_0_position")
    private WebElement title;

    @FindBy(how = How.ID, using = "loan_application_b_employment_attributes_0_business_type")
    private WebElement industry;

    @FindBy(how = How.ID, using = "loan_application_b_employment_attributes_0_years_in_industry")
    private WebElement years;

    @FindBy(how = How.ID, using = "loan_application_b_employment_attributes_0_phone")
    private WebElement phone_no;

    @FindBy(how = How.ID, using = "loan_application_b_employment_attributes_0_address1")
    private WebElement address;

    @FindBy(how = How.ID, using = "loan_application_b_employment_attributes_0_city")
    private WebElement city;

    @FindBy(how = How.ID, using = "loan_application_b_employment_attributes_0_zip")
    private WebElement zip_code;

    @FindBy(how = How.XPATH, using = "//button[text()='Fix later and continue']")
    private WebElement fix_continue;

    public void employment_Section()
    {
        next_button.click();
}

    public void current_Employment()
    {
        current_employment.click();
        next_button.click();
    }

    public void employment_Details()
    {
    employer_name.sendKeys("Test_Employer");
    self_employed.click();
    independent_contractor.click();
    payment_type.click();
    work_status.click();
    title.sendKeys("Test_Title");

    industry.click();
    Select s6 = new Select(industry);
    s6.selectByVisibleText("Banking and Finance");
    industry.click();

    years.sendKeys("10");
    phone_no.sendKeys("1010101010");
    address.sendKeys("Test_Address");
    city.sendKeys("New York");

//    state.click();
//    Select s7 = new Select(state);
//    s6.selectByVisibleText("AR");
//    state.click();

    zip_code.sendKeys("AE3456");
    next_button.click();
    fix_continue.click();



}


}
