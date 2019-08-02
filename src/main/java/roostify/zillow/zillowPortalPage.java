package roostify.zillow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import roostify.base.base;

public class zillowPortalPage extends base {

    public WebDriver driver;

    base b = new base();


    public zillowPortalPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(),'Close')]")
    WebElement btnClose;



    public void clickCloseButton()
    {
        btnClose.click();
    }

    public static void sleep()
    {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

}
