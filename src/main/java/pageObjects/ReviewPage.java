package pageObjects;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.WaitUtility;
import java.awt.Robot;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import java.awt.AWTException;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.io.File;

public class ReviewPage {
    WebDriver driver;


    public static void sleep() {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public ReviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='icon--active far fa-folder-open c-icon']")
    private WebElement review_button;

    @FindBy(xpath = "//div[@class='c-loan-property']")
    private WebElement summary_Presence;

    @FindBy(xpath = "//button[@class='btn btn--secondary mt-2 mr-3 assign-link']")
    private WebElement assign_Enabled;

    @FindBy(xpath = "//a[@class='btn btn--secondary mt-2 mr-3']")
    private WebElement BorrowerView_Enabled;

    @FindBy(xpath = "(//*[@class='c-loan-property__data-header' and contains(text(),'Borrower Details')])[1]")
    private WebElement borrower_Details;

    @FindBy(xpath = "(//*[@class='c-loan-property__data-header' and contains(text(),'Loan Details')])[1]")
    private WebElement loan_Details;

    @FindBy(xpath = "//div[@class='c-loan-property__data-header'][1]")
    private WebElement status_Presence;

    @FindBy(xpath = "//div[@class='c-loan-property mt-3'][2]")
    private WebElement applicationResponse_Presence;

    @FindBy(xpath = "(//*[contains(text(),'Loan Information')])[1]")
    private WebElement loan_Information_Presence;

    @FindBy(xpath = "//div[@class='c-loan-property__data-wrap mt-3'][1]")
    private WebElement subjectProperty_Presence;

    @FindBy(xpath = "(//*[@class='c-loan-property__data-wrap mt-3']/h4)[1]")
    private WebElement borrowerPersonal_Presence;

    @FindBy(xpath = "(//*[@class='c-loan-property__data-wrap mt-3']/h4)[2]")
    private WebElement borrowerDeclaration_presence;

    @FindBy(xpath = "(//*[@class='c-loan-property__data-wrap mt-3']/h4)[3]")
    private WebElement hmdaGender_presence;

    @FindBy(xpath = "(//*[@class='c-loan-property__data-wrap mt-3']/h4)[4]")
    private WebElement hmdaEthnicity_presence;

    @FindBy(xpath = "(//*[@class='c-loan-property__data-wrap mt-3']/h4)[5]")
    private WebElement hmdaRace_presence;

    @FindBy(xpath = "//a[@class='joyride-next-tip btn btn--primary']")
    private WebElement alert_value;

    @FindBy(xpath = "//a[text()='Finish']")
    private WebElement finish_value;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle bs-placeholder c-select-picker']")
    private WebElement assign_value;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    private WebElement assign_select;

    @FindBy(xpath = "//a[@class='dropdown-item selected']")
    private WebElement tab_select;

    @FindBy(xpath = "//button[@class='js-grant_access btn btn--primary float-right']")
    private WebElement grant_access;

    @FindBy(id = "documents-tab")
    private WebElement task_button;

    @FindBy(xpath = "//button[@class='btn btn--secondary my-1 mr-1']")
    private WebElement new_task;

    @FindBy(id = "new_document_request_due_at")
    private WebElement due_date_click;

    @FindBy(id = "document_request_description")
    private WebElement task_title;

    @FindBy(id = "document_request_reason")
    private WebElement task_reason;

    @FindBy(id = "document_request_assigned_role")
    private WebElement task_role_click;

    @FindBy(id = "document_request_extension_type")
    private WebElement task_type;

    @FindBy(id = "new_doc_req_submit")
    private WebElement create_task_button;

    @FindBy(xpath = "//a[@aria-label='Task1, opens dialog']")
    private WebElement click_task;

    @FindBy(xpath = "//*[@class='icon--active icon__utility--md far fa-file-plus c-icon']")
    private WebElement add_file;

    @FindBy(xpath = "//*[@class='btn btn--primary float-right document-request-action']")
    private WebElement mark_complete;

    @FindBy(id = "notes-tab")
    private WebElement notes_tab;

    @FindBy(id = "loan_application_note_content")
    private WebElement add_note;

    @FindBy(xpath = "//*[@class='d-none d-lg-block d-md-block d-sm-block']")
    private WebElement add_note_button;

    @FindBy(xpath = "(//*[@class='c-activity-update__content--wrap-content']/p)[2]")
    private WebElement note_Presence;

    @FindBy(id = "warnings-tab")
    private WebElement warnings_tab;

    @FindBy(xpath = "//*[@class='c-warnings__list-title']")
    private WebElement warnings_presence;

    @FindBy(id = "activity-tab")
    private WebElement activity_tab;

    @FindBy(id = "assets-tab")
    private WebElement assets_tab;

    @FindBy(id = "findings-tab")
    private WebElement findings_tab;

    @FindBy(id = "credit-tab")
    private WebElement credit_report_tab;

    @FindBy(id = "rates-tab")
    private WebElement rates_tab;

    @FindBy(id = "messages-tab")
    private WebElement messages_tab;

    @FindBy(id = "stream_container-tab")
    private WebElement stream_tab;

    @FindBy(xpath = "//*[@class='c-activity-update__recent-title']")
    private WebElement recent_activity;

    @FindBy(id = "status_update_input")
    private WebElement status_update;

    @FindBy(xpath = "//*[@class='js-submit btn btn--primary c-activity-update__btn c-activity-update__btn--text']")
    private WebElement click_post;

    @FindBy(xpath = "//*[@class='c-activity-update__content js-activity-content']")
    private WebElement status_displayed;

    @FindBy(xpath = "(//*[@class='c-activity-update__text-link c-collapsable f-sm js-comments-toggle collapsed'])")
    private WebElement comments_click;

    @FindBy(xpath = "(//*[@class='c-input js-status-input'])")
    private WebElement comments_reply;

    @FindBy(xpath = "//*[@class='js-submit btn btn--ghost c-activity-update__btn c-activity-update__btn--text']")
    private WebElement reply_button;

    @FindBy(id = "credit-auth")
    private WebElement new_credit_report;

    @FindBy(id = "credit_report_modal_applicants_0_ssn")
    private WebElement ssn_enter;

    @FindBy(xpath = "(//*[@class='c-checkbox__icon'])[2]")
    private WebElement auth_check;

    @FindBy(xpath = "//*[@class='btn btn--primary c-modal__button ajax-submit js-credit_auth_submit']")
    private WebElement pull_credit;

    @FindBy(xpath = "//*[@class='btn btn--primary async-button uc-new-finding-report js-findings-report']")
    private WebElement new_findings_report;

    @FindBy(id = "application-tab")
    private WebElement application_tab;

    @FindBy(xpath = "//*[@class='icon--active icon__utility--md far fa-file-plus c-icon']")
    private WebElement add_file_button;

    @FindBy(xpath = "//*[@class='far fa-download c-icon']")
    private WebElement doc_download;

    @FindBy(xpath = "//*[@class='far fa-trash-alt c-icon']")
    private WebElement doc_delete;

    @FindBy(xpath = "//*[@class='btn btn--danger js-confirm-remove']")
    private WebElement confirm_doc_delete;

    @FindBy(xpath = "//*[@class='btn btn--ghost mt-2 mr-3']")
    private WebElement archive_button;

    @FindBy(xpath = "//*//*[@class='btn btn--secondary mt-2 mr-3']")
    private WebElement borrower_view;


    public void click_Review() {
        review_button.click();
    }

    public void review_Summary() {
        boolean summaryPresence = summary_Presence.isDisplayed();
        boolean assignEnabled = assign_Enabled.isEnabled();
        boolean borrowerViewEnabled = BorrowerView_Enabled.isEnabled();
        boolean statusPresence = status_Presence.isDisplayed();
        boolean applicationResponsePresence = applicationResponse_Presence.isDisplayed();

        System.out.println("Summary displayed Value:" + summaryPresence);
        System.out.println("Assign Button Enabled Value:" + assignEnabled);
        System.out.println("BorrowerView Button Enabled Value:" + borrowerViewEnabled);
        System.out.println("Status displayed Value:" + statusPresence);
        System.out.println("Application Responses displayed Value:" + applicationResponsePresence);
    }

    public void page_Sections() {
        boolean borrowerDetails = borrower_Details.isDisplayed();
        boolean loanDetails = loan_Details.isDisplayed();
        boolean loanInformation = loan_Information_Presence.isDisplayed();
        boolean subjectProperty = subjectProperty_Presence.isDisplayed();
        boolean borrowerPersonal = borrowerPersonal_Presence.isDisplayed();
        boolean borrowerDeclarations = borrowerDeclaration_presence.isDisplayed();
        boolean hmdaGender = hmdaGender_presence.isDisplayed();
        boolean hmdaEthnicity = hmdaEthnicity_presence.isDisplayed();
        boolean hmdaRace = hmdaRace_presence.isDisplayed();


        System.out.println("Borrower Details Section displayed Value:" + borrowerDetails);
        System.out.println("Loan Details Section displayed Value:" + loanDetails);
        System.out.println("Loan Information Section displayed Value:" + loanInformation);
        System.out.println("Subject Property Details Section displayed Value:" + subjectProperty);
        System.out.println("Borrower Personal Details Section displayed Value:" + borrowerPersonal);
        System.out.println("Borrower Declarations Section displayed Value:" + borrowerDeclarations);
        System.out.println("HMDA:Gender Section displayed Value:" + hmdaGender);
        System.out.println("HMDA:Ethnicity Section displayed Value:" + hmdaEthnicity);
        System.out.println("HMDA:Race Section displayed Value:" + hmdaRace);

// This will press Escape key on keyboard.

       // robot.keyPress(KeyEvent.VK_ESCAPE);
    }

    public void handling_Msg()
    {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }

    public void task_Test()
    {
        handling_Msg();
        task_button.click();

    }
    public void new_Task()
    {
        new_task.click();
        //due_date_click.sendKeys("01/02/2019");
        task_title.sendKeys("Task1");
       // sleep();
        task_reason.sendKeys("Automation test Task");

        Select s1 = new Select(task_role_click);
        s1.selectByValue("lender");


        create_task_button.click();
    }

    public void task_Operations()
    {
        sleep();
       application_tab.click();
       task_button.click();
       click_task.click();
      // mark_complete.click();

    }
    public void Fileupload() {

        // Specify the file location with extension
        StringSelection sel = new StringSelection("C:\\TestPDF");
        // Copy to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
        System.out.println("selection" +sel);

        add_file_button.click();

        System.out.println("Browse button clicked");

        // Create object of Robot class
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        sleep();
        // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);

// Release Enter
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Press CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

// Release CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        sleep();

      //  Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }


    public void add_File()
    {
        sleep();
        Fileupload();
    }

    public void doc_Download()
    {
        sleep();
       doc_download.click();
    }

    public void doc_Delete()
    {
       sleep();
       doc_delete.click();
       confirm_doc_delete.click();
       driver.navigate().refresh();
    }

    public void task_mark_Complete()
    {
        sleep();
        task_button.click();
        click_task.click();
        mark_complete.click();
    }


    public void stream_Tab()
    {
        handling_Msg();
        stream_tab.click();
    }

    public void recent_Activity()
    {
        boolean recentActivity = recent_activity.isDisplayed();
        System.out.println("Recent Activity displayed Value:" + recentActivity);
    }

    public void status_Update()
    {
        status_update.sendKeys("This is a test Automation Status Update");
    }

    public void click_Post()
    {
        click_post.click();
    }

    public void status_Displayed()
    {
        boolean statusDisplayed = status_displayed.isDisplayed();
        System.out.println("Status displayed Value:" + statusDisplayed);
    }

    public void comments_Click_reply()
    {
        comments_click.click();
        comments_reply.sendKeys("This is a test Automation Reply to the comment");
        reply_button.click();

    }

    public void add_Notes()
    {
        handling_Msg();
        notes_tab.click();
    }

    public void note_Content()
    {
        add_note.sendKeys("This is a Test Automation Note");
    }

    public void add_note_Button()
    {
        add_note_button.click();
        boolean notePresence = note_Presence.isDisplayed();
        System.out.println("Note displayed Value:" + notePresence);
    }

    public void warnings_Tab()
    {
        handling_Msg();
      warnings_tab.click();
    }

    public void warnings_Verify()
    {
        boolean warningsPresence = warnings_presence.isDisplayed();
        System.out.println("Warnings displayed Value:" + warningsPresence);
    }

   public void activity_Click()
   {
       handling_Msg();
      activity_tab.click();
   }

   public void assets_Click()
   {
       handling_Msg();
       assets_tab.click();
   }

    public void findings_Click()
    {
        handling_Msg();
        findings_tab.click();
    }

    public void findings_Report()
    {
        new_findings_report.click();
    }

    public void credit_Report_Click()
    {
        handling_Msg();
        credit_report_tab.click();
    }

    public void new_credit_Report() {
        new_credit_report.click();
    }

    public void ssn_Enter()
    {
       ssn_enter.sendKeys("991919991");
    }

    public void auth_Check()
    {
        auth_check.click();
    }

    public void pull_Credit()
    {
        pull_credit.click();
    }


    public void rates_Click()
    {
        handling_Msg();
        rates_tab.click();
    }

    public void messages_Click()
    {
        handling_Msg();
        messages_tab.click();
    }

    public void archive_Loans()
    {
        handling_Msg();
      archive_button.click();
    }

    public void unarchive_Loans()
    {
        driver.navigate().refresh();
        archive_button.click();
    }

    public void borrower_View()
    {
        borrower_view.click();
    }



    }

