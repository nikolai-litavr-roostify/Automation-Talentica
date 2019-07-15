package pageObjects.loanApplications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ApplicationRelease
{
    public ApplicationRelease(WebDriver driver)
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
    @FindBy(how = How.XPATH, using = "//button[@class='js-submit_application_button btn btn--block btn--primary js-step-nav']")
    private WebElement skip_warnings_submit;


    public void skip_Warnings_Submit()
    {
        sleep();
        skip_warnings_submit.click();
    }

}
