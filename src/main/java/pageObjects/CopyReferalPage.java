package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtility;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class CopyReferalPage {
    WebDriver driver;
    public CopyReferalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver =  driver;
    }

    public static void sleep()
    {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    @FindBy(xpath = "//button[@class='btn btn--link btn--disguised dashboard-btn dashboard-btn__link']/div[@class='icon--active far fa-link c-icon']")
    private WebElement copy_referal_link;

    @FindBy(id = "referral_url")
    private  WebElement referral_url;

    @FindBy(xpath = "//button[@class='btn btn--ghost pull-right']")
    private WebElement close_button;

    @FindBy(css = ".fa-sign-out")
    private WebElement logout_button;

    @FindBy(linkText = "Sign out")
    private WebElement sign_out;

    @FindBy(id = "show_referral_link")
    private WebElement body;
    public void copy_referal_link()
    {
        WaitUtility.untilJqueryIsDone(driver);
        copy_referal_link.click();

    }

    public void referral_url() {

        WaitUtility.untilJqueryIsDone(driver, (long) 3000);
        referral_url.click();
    }

    public void open_new_tab()
    {


        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        sleep();
        robot.keyPress((KeyEvent.VK_CONTROL));
        robot.keyPress(KeyEvent.VK_T);
        sleep();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        sleep();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_ENTER);
        WaitUtility.untilJqueryIsDone(driver);

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(driver.switchTo().window(tabs.get(1)).getTitle());

    }
}