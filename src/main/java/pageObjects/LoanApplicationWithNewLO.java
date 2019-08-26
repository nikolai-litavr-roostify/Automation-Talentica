package pageObjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.tika.config.Field;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoanApplicationWithNewLO
{	
	public LoanApplicationWithNewLO(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@aria-label='Corporate menu toggle']") 
	private WebElement icon_hamburger;
	
	@FindBy(xpath = "(//a[contains(@href,'applications')])[1]") 
	private WebElement menu_my_transactions;
	
	@FindBy(id = "select_loan_officer") 
	private WebElement drpdown_SelectLoanOfficer;
	
	@FindBy(xpath = "//button[@name='button'][contains(.,'Start a new application')]") 
	private WebElement btn_Start_New_Loan_Application;
	
	@FindBy(xpath = "//button[contains(@value,'next')]")
	private WebElement btn_Brwr_Continue;
	
	@FindBy(xpath = "//i[@class='c-checkbox__icon']")
	private WebElement checkbx_EsignDisclosure;
	
	@FindBy(xpath = "//button[contains(.,'Yes, I consent')]")
	private WebElement btn_YesIConsent;
	
	@FindBy(xpath = "(//a[contains(@data-content,'Application Release')])[2]")
	private WebElement tab_ApplicationRelease;
	
	@FindBy(xpath = "//button[contains(.,'Skip Warnings and Submit')]")
	private WebElement btn_SkipWarningsAndSubmit;
	
	
	public void clickOnESCButton() throws Exception
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
	}
	
	public void clickOnHamBurgerIcon() throws Exception
	{
		icon_hamburger.click();
		Thread.sleep(1000);
	}
	
	public void clickOnMyTransactions() throws Exception
	{
		menu_my_transactions.click();
		Thread.sleep(1000);
	}
	
	public void acceptWindowsAlert(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		String alertMsg = alert.getText();
		System.out.println(alertMsg);
		alert.accept();
	}
	
	
	public void selectLoanOfficer()
	{
		drpdown_SelectLoanOfficer.click();
		Select selectLO = new Select(drpdown_SelectLoanOfficer);
		selectLO.selectByVisibleText("New Loan Officer");
	}
	
	public void clickOnStartNewLoanApplication()
	{
		if(btn_Start_New_Loan_Application.isDisplayed())
			btn_Start_New_Loan_Application.click();
	}
	
	public void verifySelectLoanOfficerDrpdwnIsPresent(WebDriver driver) throws Exception
	{
		if(drpdown_SelectLoanOfficer.isDisplayed() && drpdown_SelectLoanOfficer.isEnabled())
		{
			selectLoanOfficer();
		}
		else
		{
			System.out.println("LO dropdown not displayed on screen");
			clickOnHamBurgerIcon();
			clickOnMyTransactions();
			acceptWindowsAlert(driver);
			selectLoanOfficer();
		}
		
	}
	
	public void clickOnContinueBtn()
	{
		btn_Brwr_Continue.click();
	}

	public void acceptEsignDisclosure() throws Exception
	{
		checkbx_EsignDisclosure.click();
		Thread.sleep(1000);
		btn_YesIConsent.click();
		Thread.sleep(10000);
		
	}
	
	public void clickOnApplicationReleaseTab()
	{
		if(tab_ApplicationRelease.isDisplayed())
			tab_ApplicationRelease.click();
		
		btn_SkipWarningsAndSubmit.click();
	}
}
