package pageObjects.loanApplications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IncomeSection {

    public IncomeSection(WebDriver driver)
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

    @FindBy(how = How.ID, using = "loan_application_b_employment_attributes_0_annual_salary")
    private WebElement annual_base_salary;

    @FindBy(how = How.ID, using = "loan_application_b_employment_attributes_0_annual_bonuses")
    private WebElement annual_bonuses;

    @FindBy(how = How.ID, using = "loan_application_b_employment_attributes_0_annual_commissions")
    private WebElement annual_commissions;

    @FindBy(how = How.ID, using = "loan_application_b_incomes_attributes_0_amount")
    private WebElement other_monthly_income;

    @FindBy(how = How.ID, using = "loan_application_b_incomes_attributes_0_source")
    private WebElement source;

    @FindBy(how = How.XPATH, using = "//button[@class='btn--block btn btn--primary js-step-nav']")
    private WebElement continue_button;

    public void income_Section()
    {
        next_button.click();
    }

    public void income_Details()
    {

       annual_base_salary.sendKeys("300000");
       annual_bonuses.sendKeys("20000");
       annual_commissions.sendKeys("10000");
       next_button.click();
       other_monthly_income.sendKeys("20000");

        source.click();
        Select s6 = new Select(source);
        s6.selectByVisibleText("Capital Gains");
        source.click();

        next_button.click();
        continue_button.click();
    }

}
