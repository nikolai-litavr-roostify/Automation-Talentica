package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagesPage
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
    public MessagesPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id='js-admin-console-left_pane-6']//a[@data-content='Messages']")
    private WebElement click_messages;

    @FindBy(id = "js-admin-console-link-left_pane-6")
    private WebElement click_admin_console;

    @FindBy(xpath = "//*[@id='index_table']/div[2]/table/tbody/tr[1]/td[1]/div/a")
    private WebElement click_message_link;

    @FindBy(linkText = "Start Application")
    private WebElement click_start_application;

    public void click_admin_console()
    {
        click_admin_console.click();
    }

    public void click_messages()
    {
        sleep();
        click_messages.click();
    }

    public void click_message_link()
    {
        sleep();
        click_message_link.click();
        sleep();
    }

    public void click_start_application()
    {
        click_start_application.click();
        sleep();
    }

}
